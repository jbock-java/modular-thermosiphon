package example.dagger;

import javax.inject.Inject;
import javax.inject.Provider;

@ProcessorScope
class MainDependency {

    private final Provider<MySubComponent.Builder> subComponentBuilderProvider;

    @Inject
    MainDependency(Provider<MySubComponent.Builder> subComponentBuilderProvider) {
        this.subComponentBuilderProvider = subComponentBuilderProvider;
    }
}
