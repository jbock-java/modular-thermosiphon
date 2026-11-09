package example.dagger;

import io.jbock.simple.Component;
import io.jbock.simple.Inject;

class CoffeeApp {

    @Component
    interface CoffeeComponent {
        CoffeeMaker coffeeMaker();

        @Component.Factory
        interface MyFactory {
            CoffeeComponent buildComponent(Logger logger);
        }
    }

    interface Logger {
        void log(String msg);
    }

    @Inject
    record CoffeeMaker(Logger logger) {

        void brew() {
            logger.log("~ ~ ~ heating ~ ~ ~");
            logger.log("=> => pumping => =>");
            logger.log(" [_]P coffee! [_]P ");
        }
    }

    static void main() {
        CoffeeApp.Logger logger = System.out::println;
        CoffeeApp.CoffeeComponent app = CoffeeApp_CoffeeComponent_Impl.factory()
                .buildComponent(logger);
        app.coffeeMaker().brew();
    }
}
