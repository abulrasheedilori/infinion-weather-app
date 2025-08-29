package com.isoft.infinionweatherapp.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("id") val id: String,
    @SerializedName("description") val description: String,
    @SerializedName("main") val main: String,
    @SerializedName("icon") val icon: String,
)
