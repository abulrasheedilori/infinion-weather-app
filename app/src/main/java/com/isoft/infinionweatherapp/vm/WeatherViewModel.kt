package com.isoft.infinionweatherapp.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository
import com.isoft.infinionweatherapp.model.WeatherUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: InfinionWeatherRepository,
    ) : ViewModel() {
        var uiState by mutableStateOf<WeatherUiState>(WeatherUiState.Loading)
            private set
    fun fetchWeather(city: String, apiKey: String) {
        viewModelScope.launch {
            uiState = WeatherUiState.Loading
            try { val result = repository.getWeather(city)
                uiState = result.let { WeatherUiState.Success(it.getOrThrow()) }
            } catch (e: Exception) {
                uiState = WeatherUiState.Error(e.message ?: "Kindly try again later") } } }

    fun saveCity(city: String) {
        viewModelScope.launch {
            try {
                repository.saveFavoriteCity(city)
            } catch (e: Exception) {
                uiState = WeatherUiState.Error(e.message ?: "Unable to save")
            }
        }
    }

    val favoriteCity: Flow<String?> = repository.getFavoriteCity()
    }