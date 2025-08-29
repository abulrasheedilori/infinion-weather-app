package com.isoft.infinionweatherapp.ui.screens.common

import coil.compose.AsyncImage
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherIcon(icon: String) {
    val imageUrl = "https://openweathermap.org/img/wn/${icon}@2x.png" //this could be loaded from a secure point but its fine since its public repo

    AsyncImage(
        model = imageUrl,
        contentDescription = "Weather Icon",
        modifier = Modifier.size(128.dp)
    )
}
