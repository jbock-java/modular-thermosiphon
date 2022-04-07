package com.example.sub;

import jakarta.inject.Inject;

public class MainDependency {
    @Inject
    MainDependency(TransitiveDependency dependency) {
    }
}
