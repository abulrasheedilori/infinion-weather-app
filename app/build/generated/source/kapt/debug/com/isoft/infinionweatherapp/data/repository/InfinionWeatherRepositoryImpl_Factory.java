package com.isoft.infinionweatherapp.data.repository;

import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService;
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class InfinionWeatherRepositoryImpl_Factory implements Factory<InfinionWeatherRepositoryImpl> {
  private final Provider<InfinionWeatherApiService> apiProvider;

  private final Provider<DataStoreManager> dataStoreProvider;

  public InfinionWeatherRepositoryImpl_Factory(Provider<InfinionWeatherApiService> apiProvider,
      Provider<DataStoreManager> dataStoreProvider) {
    this.apiProvider = apiProvider;
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public InfinionWeatherRepositoryImpl get() {
    return newInstance(apiProvider.get(), dataStoreProvider.get());
  }

  public static InfinionWeatherRepositoryImpl_Factory create(
      Provider<InfinionWeatherApiService> apiProvider,
      Provider<DataStoreManager> dataStoreProvider) {
    return new InfinionWeatherRepositoryImpl_Factory(apiProvider, dataStoreProvider);
  }

  public static InfinionWeatherRepositoryImpl newInstance(InfinionWeatherApiService api,
      DataStoreManager dataStore) {
    return new InfinionWeatherRepositoryImpl(api, dataStore);
  }
}
