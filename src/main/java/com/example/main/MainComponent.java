package com.example.main;

import com.example.sub.MainDependency;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component
public interface MainComponent {
    MainDependency mainDependency();

    @Component.Factory
    interface Factory {
        MainComponent create();
    }

    public static void main(String[] args) {
        MainComponent mc = DaggerMainComponent.create();
        System.out.println(mc.mainDependency());
        System.out.println(mc.mainDependency());
    }
}
