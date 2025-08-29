package com.isoft.infinionweatherapp.model

import com.google.gson.annotations.SerializedName

//data class InfinionWeatherResponse(
//    @SerializedName("name") val cityName: String,
//    @SerializedName("main") val main: Main,
//    @SerializedName("weather") val weather: List<Weather>,
//)


data class InfinionWeatherResponse(
    @SerializedName("coord") val coord: Coord,
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("base") val base: String,
    @SerializedName("main") val main: Main,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("dt") val dt: Long,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("id") val cityId: Long,
    @SerializedName("name") val cityName: String,
    @SerializedName("cod") val cod: Int
)