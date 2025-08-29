package com.isoft.infinionweatherapp.di;

import android.content.Context;
import com.isoft.infinionweatherapp.data.datastore.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideDataStoreFactory implements Factory<DataStoreManager> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideDataStoreFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreManager get() {
    return provideDataStore(contextProvider.get());
  }

  public static AppModule_ProvideDataStoreFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideDataStoreFactory(contextProvider);
  }

  public static DataStoreManager provideDataStore(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDataStore(context));
  }
}
