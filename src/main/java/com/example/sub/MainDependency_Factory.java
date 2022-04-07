package com.example.sub;

import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import jakarta.inject.Provider;

import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainDependency_Factory implements Factory<MainDependency> {
  private final Provider<TransitiveDependency> dependencyProvider;

  public MainDependency_Factory(Provider<TransitiveDependency> dependencyProvider) {
    this.dependencyProvider = dependencyProvider;
  }

  @Override
  public MainDependency get() {
    return newInstance(dependencyProvider.get());
  }

  public static MainDependency_Factory create(Provider<TransitiveDependency> dependencyProvider) {
    return new MainDependency_Factory(dependencyProvider);
  }

  public static MainDependency newInstance(Object dependency) {
    return new MainDependency((TransitiveDependency) dependency);
  }
}
