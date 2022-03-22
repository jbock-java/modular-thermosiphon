package example.dagger;

import javax.inject.Inject;
import java.util.Set;

class DependsOnSet {

    @Inject
    DependsOnSet(Set<SetMemberType> set) {
    }
}
