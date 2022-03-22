package example.dagger;

import javax.inject.Inject;

@ValidateScope
public class SubcomponentDependency {

    private final MatchFinder matchFinder;

    @Inject
    SubcomponentDependency(MatchFinder matchFinder) {
        this.matchFinder = matchFinder;
    }
}
