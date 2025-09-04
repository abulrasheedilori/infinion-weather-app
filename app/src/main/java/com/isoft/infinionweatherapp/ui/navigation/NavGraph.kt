package com.isoft.infinionweatherapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.isoft.infinionweatherapp.vm.WeatherViewModel
import com.isoft.infinionweatherapp.ui.screens.DetailsScreen
import com.isoft.infinionweatherapp.ui.screens.HomeScreen
import com.isoft.infinionweatherapp.ui.screens.SplashScreen

@Composable
fun NavGraph(navController: NavHostController, viewModel: WeatherViewModel) {
    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController, viewModel) }
        composable("home") { HomeScreen(navController, viewModel) }
        composable("details/{city}") { backStackEntry ->
            val city = backStackEntry.arguments?.getString("city") ?: ""
            DetailsScreen(navController, viewModel, city)
        }
    }
}
