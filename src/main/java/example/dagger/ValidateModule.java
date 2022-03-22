package example.dagger;

import dagger.Binds;
import dagger.multibindings.IntoSet;

public interface ValidateModule {

    @Binds
    @IntoSet
    Matcher listMatcher(ListMatcher validator);
}
