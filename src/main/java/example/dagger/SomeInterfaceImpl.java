package example.dagger;

import javax.inject.Inject;

@ValidateScope
public class SomeInterfaceImpl implements SomeInterface {

    @Inject
    SomeInterfaceImpl() {
    }
}
