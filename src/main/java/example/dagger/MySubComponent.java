package example.dagger;

import dagger.Binds;
import dagger.Subcomponent;
import dagger.multibindings.IntoSet;

@Subcomponent(modules = MySubComponent.SubModule.class)
interface MySubComponent {
    DependsOnSet dependsOnSet();

    @Subcomponent.Factory
    interface Factory {
        MyComponent create();
    }

    interface SubModule {
        @Binds
        @IntoSet
        SetMemberType someInterfaceImpl(SetMemberTypeImpl impl);
    }
}
