package com.isoft.infinionweatherapp.data.vm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/isoft/infinionweatherapp/data/vm/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/isoft/infinionweatherapp/data/repository/InfinionWeatherRepository;", "(Lcom/isoft/infinionweatherapp/data/repository/InfinionWeatherRepository;)V", "favoriteCity", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoriteCity", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Lcom/isoft/infinionweatherapp/model/WeatherUiState;", "uiState", "getUiState", "()Lcom/isoft/infinionweatherapp/model/WeatherUiState;", "setUiState", "(Lcom/isoft/infinionweatherapp/model/WeatherUiState;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "fetchWeather", "", "city", "apiKey", "saveCity", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState uiState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> favoriteCity = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.isoft.infinionweatherapp.model.WeatherUiState getUiState() {
        return null;
    }
    
    private final void setUiState(com.isoft.infinionweatherapp.model.WeatherUiState p0) {
    }
    
    public final void fetchWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    public final void saveCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getFavoriteCity() {
        return null;
    }
}