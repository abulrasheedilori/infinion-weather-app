package com.isoft.infinionweatherapp.data.vm;

import com.isoft.infinionweatherapp.data.repository.InfinionWeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<InfinionWeatherRepository> repositoryProvider;

  public WeatherViewModel_Factory(Provider<InfinionWeatherRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static WeatherViewModel_Factory create(
      Provider<InfinionWeatherRepository> repositoryProvider) {
    return new WeatherViewModel_Factory(repositoryProvider);
  }

  public static WeatherViewModel newInstance(InfinionWeatherRepository repository) {
    return new WeatherViewModel(repository);
  }
}
