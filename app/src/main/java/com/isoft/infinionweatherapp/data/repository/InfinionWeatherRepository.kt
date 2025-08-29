package com.isoft.infinionweatherapp.data.repository

import com.isoft.infinionweatherapp.model.InfinionWeatherResponse
import kotlinx.coroutines.flow.Flow

interface InfinionWeatherRepository {
    suspend fun getWeather(city: String): Result<InfinionWeatherResponse>
    suspend fun saveFavoriteCity(city: String)
    fun getFavoriteCity(): Flow<String?>
}