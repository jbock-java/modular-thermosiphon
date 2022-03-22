package example.dagger;

import javax.inject.Inject;
import javax.inject.Provider;

@ProcessorScope
class CommandStep {

    private final Provider<ValidateComponent.Builder> validateComponentProvider;

    @Inject
    CommandStep(Provider<ValidateComponent.Builder> validateComponentProvider) {
        this.validateComponentProvider = validateComponentProvider;
    }
}
