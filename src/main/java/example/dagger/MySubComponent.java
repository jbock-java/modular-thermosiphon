package example.dagger;

import dagger.Subcomponent;

@ValidateScope
@Subcomponent(modules = MySubModule.class)
public interface MySubComponent {

    SubcomponentDependency subcomponentDependency();

    @Subcomponent.Builder
    interface Builder {

        MySubComponent build();
    }
}
