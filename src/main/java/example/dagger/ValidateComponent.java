package example.dagger;

import dagger.Subcomponent;

@ValidateScope
@Subcomponent(modules = ValidateModule.class)
public interface ValidateComponent {

    CommandProcessor processor();

    @Subcomponent.Builder
    interface Builder {

        ValidateComponent build();
    }
}
