package com.isoft.infinionweatherapp.data.datastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class DataStoreManager @Inject constructor(@ApplicationContext private val context: Context) {
    private val Context.dataStore by preferencesDataStore("settings")
    private val cityKey = stringPreferencesKey("favorite_city")

    suspend fun saveFavouriteCity(city: String) {
        context.dataStore.edit { prefs -> prefs[cityKey] = city }
    }

    fun getFavouriteCity(): Flow<String?> = context.dataStore.data.map { it[cityKey] }
}
