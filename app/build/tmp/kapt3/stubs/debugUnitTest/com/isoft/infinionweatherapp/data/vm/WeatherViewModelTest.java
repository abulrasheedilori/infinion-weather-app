package com.isoft.infinionweatherapp.data.vm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0011\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0012\u001a\u00060\u000ej\u0002`\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u00020\u00068G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/isoft/infinionweatherapp/data/vm/WeatherViewModelTest;", "", "()V", "fakeWeatherResponse", "Lcom/isoft/infinionweatherapp/model/InfinionWeatherResponse;", "mainDispatcherRule", "Lcom/isoft/infinionweatherapp/util/MainDispatcherRule;", "getMainDispatcherRule", "()Lcom/isoft/infinionweatherapp/util/MainDispatcherRule;", "repository", "Lcom/isoft/infinionweatherapp/data/repository/InfinionWeatherRepository;", "viewModel", "Lcom/isoft/infinionweatherapp/data/vm/WeatherViewModel;", "favoriteCity emits saved city", "", "Lkotlinx/coroutines/test/TestResult;", "fetchWeather failure updates uiState to Error", "fetchWeather success updates uiState to Success", "saveCity calls repository saveFavoriteCity", "setup", "app_debugUnitTest"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
public final class WeatherViewModelTest {
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.util.MainDispatcherRule mainDispatcherRule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository repository = null;
    private com.isoft.infinionweatherapp.data.vm.WeatherViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.model.InfinionWeatherResponse fakeWeatherResponse = null;
    
    public WeatherViewModelTest() {
        super();
    }
    
    @org.junit.Rule()
    @org.jetbrains.annotations.NotNull()
    public final com.isoft.infinionweatherapp.util.MainDispatcherRule getMainDispatcherRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}