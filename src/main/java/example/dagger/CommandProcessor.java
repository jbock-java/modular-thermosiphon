package example.dagger;

import javax.inject.Inject;

@ValidateScope
public class CommandProcessor {

    private final MatchFinder matchFinder;

    @Inject
    CommandProcessor(MatchFinder matchFinder) {
        this.matchFinder = matchFinder;
    }
}
