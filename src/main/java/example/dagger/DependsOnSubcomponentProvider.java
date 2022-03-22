package example.dagger;

import javax.inject.Inject;
import javax.inject.Provider;

class DependsOnSubcomponentProvider {

    @Inject
    DependsOnSubcomponentProvider(Provider<MySubComponent.Factory> provider) {
    }
}
