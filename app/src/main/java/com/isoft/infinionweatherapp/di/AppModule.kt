package com.isoft.infinionweatherapp.di

import android.content.Context
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepositoryImpl
import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY // Logs URL + headers + body
        }

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideWeatherApi(retrofit: Retrofit): InfinionWeatherApiService = retrofit.create(InfinionWeatherApiService::class.java)

    @Provides
    @Singleton
    fun provideRepository(api: InfinionWeatherApiService, dataStore: DataStoreManager): InfinionWeatherRepository = InfinionWeatherRepositoryImpl(api, dataStore)

    @Provides
    @Singleton
    fun provideDataStore(@ApplicationContext context: Context): DataStoreManager = DataStoreManager(context)
}
