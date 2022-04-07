package com.example.main;

import com.example.sub.MainDependency;

public interface MainComponent {
    MainDependency mainDependency();

    interface Factory {
        MainComponent create();
    }
}
