package example.dagger;

import dagger.Component;

import javax.annotation.processing.ProcessingEnvironment;

@ProcessorScope
@Component(modules = MyModule.class)
interface MyComponent {

    MainDependency rootBinding();

    static MyComponent create(ProcessingEnvironment processingEnvironment) {
        return DaggerProcessorComponent.factory().create(processingEnvironment);
    }

    @Component.Factory
    interface Factory {

        MyComponent create();
    }
}
