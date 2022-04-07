package com.example.main;

import com.example.sub.MainDependency;
import com.example.sub.MainDependency_Factory;
import com.example.sub.TransitiveDependency_Factory;

import javax.annotation.processing.Generated;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainComponent implements MainComponent {
  private final DaggerMainComponent mainComponent = this;

  private DaggerMainComponent() {

    initialize();

  }

  public static MainComponent.Factory factory() {
    return new Factory();
  }

  public static MainComponent create() {
    return new Factory().create();
  }

  @Override
  public MainDependency mainDependency() {
    return MainDependency_Factory.newInstance(TransitiveDependency_Factory.newInstance());
  }

  @SuppressWarnings("unchecked")
  private void initialize() {

  }

  private static final class Factory implements MainComponent.Factory {
    @Override
    public MainComponent create() {
      return new DaggerMainComponent();
    }
  }
}
