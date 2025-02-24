package creationalPatterns.abstractfactorymethod;

import creationalPatterns.abstractfactorymethod.burgers.BeefBurger;
import creationalPatterns.abstractfactorymethod.pizzas.Pizza;
import creationalPatterns.abstractfactorymethod.restaurant.BeefRestaurant;
import creationalPatterns.abstractfactorymethod.restaurant.Restaurant;


public class Main {
    public static void main(String[] args) {
        Restaurant r = new BeefRestaurant();
        BeefBurger bb= (BeefBurger) r.prepareBurger();
        Pizza pizza = r.preparePizza();

    }
}
