package example.dagger;

import io.jbock.simple.Component;
import io.jbock.simple.Provides;
import io.jbock.simple.Inject;

class CoffeeApp {

    @Component
    interface CoffeeComponent {
        CoffeeMaker coffeeMaker();

        @Component.Builder
        interface Builder {
            Builder logger(Logger logger);

            CoffeeComponent buildComponent();
        }
    }

    interface Logger {
        void log(String msg);
    }

    @Inject
    static class CoffeeMaker {
        private final Logger logger;

        CoffeeMaker(Logger logger) {
            this.logger = logger;
        }

        void brew() {
            logger.log("~ ~ ~ heating ~ ~ ~");
            logger.log("=> => pumping => =>");
            logger.log(" [_]P coffee! [_]P ");
        }
    }

}
