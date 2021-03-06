/*
 * Copyright (C) 2020 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example.dagger;

import dagger.Component;
import jakarta.inject.Singleton;

/** The main app responsible for brewing the coffee and printing the logs. */
public class CoffeeApp {
    @Singleton
    @Component(
            modules = {
                    HeaterModule.class,
                    PumpModule.class
            }
    )
    public interface CoffeeShop {
        CoffeeMaker maker();

        CoffeeLogger logger();

        @Component.Factory
        interface Factory {
            CoffeeShop create();
        }
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.factory().create();
        System.out.println(coffeeShop.maker());
        System.out.println(coffeeShop.maker());
        System.out.println(DaggerCoffeeApp_CoffeeShop.factory().create().maker());
        coffeeShop.logger().logs().forEach(System.out::println);
    }
}
