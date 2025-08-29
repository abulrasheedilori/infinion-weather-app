package com.isoft.infinionweatherapp

import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepositoryImpl
import com.isoft.infinionweatherapp.model.*
import kotlinx.coroutines.runBlocking
import okhttp3.ResponseBody
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.*
import retrofit2.Response

class InfinionWeatherRepositoryImplTest {

    private val api: InfinionWeatherApiService = mock()
    private val dataStore: DataStoreManager = mock()
    private lateinit var repository: InfinionWeatherRepositoryImpl

    private val fakeResponse = InfinionWeatherResponse(
        coord = Coord(lon = 3.75, lat = 6.5833),
        weather = listOf(
            Weather(
                id = "803",
                main = "Clouds",
                description = "broken clouds",
                icon = "04n"
            )
        ),
        base = "stations",
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
        visibility = 10000,
        wind = Wind(speed = 1.85, deg = 210, gust = 5.77),
        clouds = Clouds(all = 62),
        dt = 1756499732,
        sys = Sys(country = "NG", sunrise = 1756445906, sunset = 1756490032),
        timezone = 3600,
        cityId = 2332453,
        cityName = "Lagos",
        cod = 200
    )

    @Before
    fun setup() {
        repository = InfinionWeatherRepositoryImpl(api, dataStore)
    }

    @Test
    fun `getWeather returns success`() = runBlocking {
        whenever(api.getWeather(eq("Lagos"), any(), any()))
            .thenReturn(Response.success(fakeResponse))

        val result = repository.getWeather("Lagos")

        assertTrue(result.isSuccess)
        assertEquals("Lagos", result.getOrNull()?.cityName)
        assertEquals("broken clouds", result.getOrNull()?.weather?.first()?.description)
    }

    @Test
    fun `getWeather returns failure on API error`() = runBlocking {
        whenever(api.getWeather(eq("Paris"), any(), any()))
            .thenReturn(Response.error(404, ResponseBody.create(null, "Not found")))

        val result = repository.getWeather("Paris")

        assertTrue(result.isFailure)
    }

    @Test
    fun `saveFavoriteCity calls datastore`() = runBlocking {
        repository.saveFavoriteCity("Nairobi")
        verify(dataStore).saveFavouriteCity("Nairobi")
    }

    @Test
    fun `getFavoriteCity calls datastore`(): Unit = runBlocking {
        repository.getFavoriteCity()
        verify(dataStore).getFavouriteCity()
    }
}
