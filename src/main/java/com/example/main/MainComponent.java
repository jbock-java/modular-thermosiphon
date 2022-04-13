package com.example.main;

import com.example.sub.MainDependency;
import io.avaje.inject.BeanScope;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class MainComponent {

    private final MainDependency mainDependency;

    @Inject
    MainComponent(MainDependency mainDependency) {
        this.mainDependency = mainDependency;
    }

    public static void main(String[] args) {
        BeanScope beanScope = BeanScope.newBuilder().build();
        System.out.println(beanScope.get(MainComponent.class).mainDependency);
    }
}
