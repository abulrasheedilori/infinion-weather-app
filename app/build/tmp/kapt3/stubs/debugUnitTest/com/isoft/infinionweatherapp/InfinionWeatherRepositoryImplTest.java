package com.isoft.infinionweatherapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/isoft/infinionweatherapp/InfinionWeatherRepositoryImplTest;", "", "()V", "api", "Lcom/isoft/infinionweatherapp/data/api/InfinionWeatherApiService;", "dataStore", "Lcom/isoft/infinionweatherapp/data/datastore/DataStoreManager;", "fakeResponse", "Lcom/isoft/infinionweatherapp/model/InfinionWeatherResponse;", "repository", "Lcom/isoft/infinionweatherapp/data/repository/InfinionWeatherRepositoryImpl;", "getFavoriteCity calls datastore", "", "getWeather returns failure on API error", "getWeather returns success", "saveFavoriteCity calls datastore", "setup", "app_debugUnitTest"})
public final class InfinionWeatherRepositoryImplTest {
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.data.datastore.DataStoreManager dataStore = null;
    private com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepositoryImpl repository;
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.model.InfinionWeatherResponse fakeResponse = null;
    
    public InfinionWeatherRepositoryImplTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}