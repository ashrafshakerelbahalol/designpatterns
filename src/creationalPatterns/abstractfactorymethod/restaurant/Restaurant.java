package creationalPatterns.abstractfactorymethod.restaurant;

import creationalPatterns.abstractfactorymethod.burgers.Burger;
import creationalPatterns.abstractfactorymethod.pizzas.Pizza;

public interface Restaurant {
    Burger prepareBurger();
    Pizza preparePizza();
    
}
