//package com.isoft.infinionweatherapp.data.repository
//
//import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService
//import com.isoft.infinionweatherapp.data.datastore.DataStoreManager
//import com.isoft.infinionweatherapp.model.InfinionWeatherResponse
//import jakarta.inject.Inject
//import kotlinx.coroutines.flow.Flow
//
//class InfinionWeatherRepositoryImpl @Inject constructor(
//    private val api: InfinionWeatherApiService,
//    private val dataStore: DataStoreManager
//) {
//    suspend fun getWeather(city: String, apiKey: String): InfinionWeatherResponse? {
//        val response = api.getWeather(city, apiKey)
//        return if (response.isSuccessful) response.body() else null
//    }
//
//    suspend fun saveFavoriteCity(city: String) = dataStore.saveFavouriteCity(city)
//    fun getFavoriteCity(): Flow<String?> = dataStore.getFavouriteCity()
//}

package com.isoft.infinionweatherapp.data.repository

import com.isoft.infinionweatherapp.BuildConfig
import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager
import com.isoft.infinionweatherapp.model.InfinionWeatherResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InfinionWeatherRepositoryImpl @Inject constructor(
    private val api: InfinionWeatherApiService,
    private val dataStore: DataStoreManager
) : InfinionWeatherRepository {

    override suspend fun getWeather(city: String): Result<InfinionWeatherResponse> {
        return try {
            val apiKey = BuildConfig.OPENWEATHER_API_KEY
            val response = api.getWeather(city, apiKey)
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception(response.message()))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun saveFavoriteCity(city: String) {
        dataStore.saveFavouriteCity(city)
    }

    override fun getFavoriteCity(): Flow<String?> = dataStore.getFavouriteCity()
}
