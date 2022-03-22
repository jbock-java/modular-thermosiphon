package example.dagger;

import dagger.Component;
import dagger.Module;

@Component(modules = MyComponent.MainModule.class)
interface MyComponent {
    DependsOnSubcomponentProvider mainDependency();

    @Component.Factory
    interface Factory {
        MyComponent create();
    }

    @Module(subcomponents = MySubComponent.class)
    interface MainModule {}
}
