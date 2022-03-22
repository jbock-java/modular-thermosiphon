package example.dagger;

import dagger.Component;

import javax.annotation.processing.ProcessingEnvironment;

@ProcessorScope
@Component(modules = ProcessorModule.class)
interface ProcessorComponent {

    CommandStep commandStep();

    static ProcessorComponent create(ProcessingEnvironment processingEnvironment) {
        return DaggerProcessorComponent.factory().create(processingEnvironment);
    }

    @Component.Factory
    interface Factory {

        ProcessorComponent create();
    }
}
