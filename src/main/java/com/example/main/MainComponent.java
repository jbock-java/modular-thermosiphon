package com.example.main;

import com.example.sub.MainDependency;
import dagger.Component;

@Component
public interface MainComponent {
    MainDependency mainDependency();

    @Component.Factory
    interface Factory {
        MainComponent create();
    }
}
