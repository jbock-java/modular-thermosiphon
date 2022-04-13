package com.example.sub;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class MainDependency {
    @Inject
    MainDependency(TransitiveDependency dependency) {
    }
}
