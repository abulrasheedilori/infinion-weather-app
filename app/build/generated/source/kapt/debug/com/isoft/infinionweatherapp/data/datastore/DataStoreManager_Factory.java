package com.isoft.infinionweatherapp.data.datastore;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class DataStoreManager_Factory implements Factory<DataStoreManager> {
  private final Provider<Context> contextProvider;

  public DataStoreManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreManager get() {
    return newInstance(contextProvider.get());
  }

  public static DataStoreManager_Factory create(Provider<Context> contextProvider) {
    return new DataStoreManager_Factory(contextProvider);
  }

  public static DataStoreManager newInstance(Context context) {
    return new DataStoreManager(context);
  }
}
