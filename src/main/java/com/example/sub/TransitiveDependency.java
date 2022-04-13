package com.example.sub;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
class TransitiveDependency {
    @Inject
    TransitiveDependency() {
    }
}
