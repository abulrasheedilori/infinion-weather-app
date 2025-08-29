package com.isoft.infinionweatherapp.di;

import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService;
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager;
import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class AppModule_ProvideRepositoryFactory implements Factory<InfinionWeatherRepository> {
  private final Provider<InfinionWeatherApiService> apiProvider;

  private final Provider<DataStoreManager> dataStoreProvider;

  public AppModule_ProvideRepositoryFactory(Provider<InfinionWeatherApiService> apiProvider,
      Provider<DataStoreManager> dataStoreProvider) {
    this.apiProvider = apiProvider;
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public InfinionWeatherRepository get() {
    return provideRepository(apiProvider.get(), dataStoreProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      Provider<InfinionWeatherApiService> apiProvider,
      Provider<DataStoreManager> dataStoreProvider) {
    return new AppModule_ProvideRepositoryFactory(apiProvider, dataStoreProvider);
  }

  public static InfinionWeatherRepository provideRepository(InfinionWeatherApiService api,
      DataStoreManager dataStore) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRepository(api, dataStore));
  }
}
