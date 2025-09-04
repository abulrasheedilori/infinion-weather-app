package com.isoft.infinionweatherapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.isoft.infinionweatherapp.vm.WeatherViewModel
import com.isoft.infinionweatherapp.model.WeatherUiState
import com.isoft.infinionweatherapp.ui.screens.common.WeatherIcon

@Composable
fun DetailsScreen(navController: NavController, viewModel: WeatherViewModel, city: String) {
    val state = viewModel.uiState

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF2196F3), Color(0xFF90CAF9)) // blue sky gradient
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        when (state) {
            is WeatherUiState.Loading -> CircularProgressIndicator(color = Color.White)

            is WeatherUiState.Error -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Error Occurred: ${state.message}",
                        style = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { navController.popBackStack() }) {
                        Text("Retry")
                    }
                }
            }

            WeatherUiState.Idle -> Text(
                "No data. Search for real city names.",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge
            )

            is WeatherUiState.Success -> {
                val weather = state.data.weather.firstOrNull()

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    if (weather != null) {
                        WeatherIcon(weather.icon)
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = state.data.cityName,
                        style = MaterialTheme.typography.headlineLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 28.sp
                        )
                    )

                    Text(
                        text = "${state.data.main.temp} °C",
                        style = MaterialTheme.typography.headlineMedium.copy(
                            color = Color.White,
                            fontSize = 24.sp
                        )
                    )

                    Text(
                        text = weather?.description?.replaceFirstChar { it.uppercase() } ?: "N/A",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = Color.White,
                            fontSize = 18.sp
                        )
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color.White.copy(alpha = 0.2f)
                    ) {
                        Button(
                            onClick = { navController.popBackStack() },
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Text("Return to Home")
                        }
                    }
                }
            }
        }
    }
}
