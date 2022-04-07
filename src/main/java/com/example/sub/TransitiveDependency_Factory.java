package com.example.sub;

import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TransitiveDependency_Factory implements Factory<TransitiveDependency> {
  @Override
  public TransitiveDependency get() {
    return newInstance();
  }

  public static TransitiveDependency_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TransitiveDependency newInstance() {
    return new TransitiveDependency();
  }

  private static final class InstanceHolder {
    private static final TransitiveDependency_Factory INSTANCE = new TransitiveDependency_Factory();
  }
}
