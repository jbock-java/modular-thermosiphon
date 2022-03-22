package example.dagger;

import javax.inject.Inject;
import java.util.Set;

@ValidateScope
public class MatchFinder {

    private final Set<SomeInterface> matchers;

    @Inject
    MatchFinder(
            Set<SomeInterface> matchers) {
        this.matchers = matchers;
    }
}
