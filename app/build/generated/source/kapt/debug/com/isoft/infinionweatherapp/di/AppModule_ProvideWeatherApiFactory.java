package com.isoft.infinionweatherapp.di;

import com.isoft.infinionweatherapp.data.api.InfinionWeatherApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideWeatherApiFactory implements Factory<InfinionWeatherApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideWeatherApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public InfinionWeatherApiService get() {
    return provideWeatherApi(retrofitProvider.get());
  }

  public static AppModule_ProvideWeatherApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideWeatherApiFactory(retrofitProvider);
  }

  public static InfinionWeatherApiService provideWeatherApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWeatherApi(retrofit));
  }
}
