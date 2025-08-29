package com.isoft.infinionweatherapp.data.api

import com.isoft.infinionweatherapp.model.InfinionWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface InfinionWeatherApiService {
    @GET("data/2.5/weather")
    suspend fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric"
    ): Response<InfinionWeatherResponse>
}
