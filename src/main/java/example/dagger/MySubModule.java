package example.dagger;

import dagger.Binds;
import dagger.multibindings.IntoSet;

public interface MySubModule {

    @Binds
    @IntoSet
    SomeInterface listMatcher(SomeInterfaceImpl validator);
}
