package com.isoft.infinionweatherapp.data.vm

import app.cash.turbine.test
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository
import com.isoft.infinionweatherapp.model.*
import com.isoft.infinionweatherapp.util.MainDispatcherRule
import com.isoft.infinionweatherapp.vm.WeatherViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.kotlin.*

@OptIn(ExperimentalCoroutinesApi::class)
class WeatherViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val repository: InfinionWeatherRepository = mock()
    private lateinit var viewModel: WeatherViewModel

    private val fakeWeatherResponse = InfinionWeatherResponse(
        cityName = "Lagos",
        main = Main(
            temp = 23.65,
            feelsLike = 24.45,
            tempMin = 23.65,
            tempMax = 23.65,
            pressure = 1015,
            humidity = 91,
            seaLevel = 1015,
            groundLevel = 1015
        ),
        weather = listOf(
            Weather(
                id = "803",
                main = "Clouds",
                description = "broken clouds",
                icon = "04n"
            )
        ),
        coord = Coord(lon = 3.75, lat = 6.5833),
        base = "stations",
        visibility = 10000,
        wind = Wind(speed = 1.85, deg = 210, gust = 5.77),
        clouds = Clouds(all = 62),
        dt = 1756499732,
        sys = Sys(
            country = "NG",
            sunrise = 1756445906,
            sunset = 1756490032
        ),
        timezone = 3600,
        cityId = 2332453,
        cod = 200
    )

    @Before
    fun setup() {
        viewModel = WeatherViewModel(repository)
    }

    @Test
    fun `fetchWeather success updates uiState to Success`() = runTest {
        whenever(repository.getWeather("London"))
            .thenReturn(Result.success(fakeWeatherResponse.copy(cityName = "London")))

        viewModel.fetchWeather("London", "fakeApiKey")

        advanceUntilIdle() // ✅ let coroutine finish

        assertTrue(viewModel.uiState is WeatherUiState.Success)
        val success = viewModel.uiState as WeatherUiState.Success
        assertEquals("London", success.data.cityName)
        assertEquals("broken clouds", success.data.weather.first().description)
        assertEquals("04n", success.data.weather.first().icon)
    }

    @Test
    fun `fetchWeather failure updates uiState to Error`() = runTest {
        whenever(repository.getWeather("Paris"))
            .thenReturn(Result.failure(Exception("Network error")))

        viewModel.fetchWeather("Paris", "fakeApiKey")

        advanceUntilIdle() // ✅ wait for coroutine

        assertTrue(viewModel.uiState is WeatherUiState.Error)
        val error = viewModel.uiState as WeatherUiState.Error
        assertEquals("Network error", error.message)
    }

    @Test
    fun `saveCity calls repository saveFavoriteCity`() = runTest {
        viewModel.saveCity("Berlin")

        advanceUntilIdle() // ✅ wait for coroutine

        verify(repository).saveFavoriteCity("Berlin")
    }


    @Test
    fun `favoriteCity emits saved city`() = runTest {
        whenever(repository.getFavoriteCity()).thenReturn(flowOf("Nairobi"))

        repository.getFavoriteCity().test {
            val item = awaitItem()
            assertEquals("Nairobi", item)
            cancelAndConsumeRemainingEvents()
        }
    }
}
