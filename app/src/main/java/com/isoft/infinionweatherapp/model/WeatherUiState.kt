package com.isoft.infinionweatherapp.model

sealed class WeatherUiState {
    object Idle : WeatherUiState()
    object Loading : WeatherUiState()
    data class Success(val data: InfinionWeatherResponse) : WeatherUiState()
    data class Error(val message: String) : WeatherUiState()
}