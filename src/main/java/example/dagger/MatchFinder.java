package example.dagger;

import javax.inject.Inject;
import java.util.Set;

@ValidateScope
public class MatchFinder {

    private final Set<Matcher> matchers;

    @Inject
    MatchFinder(
            Set<Matcher> matchers) {
        this.matchers = matchers;
    }
}
