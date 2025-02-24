package creationalPatterns.abstractfactorymethod.restaurant;

import creationalPatterns.abstractfactorymethod.burgers.BeefBurger;
import creationalPatterns.abstractfactorymethod.burgers.Burger;
import creationalPatterns.abstractfactorymethod.pizzas.BeefPizza;
import creationalPatterns.abstractfactorymethod.pizzas.Pizza;

public class BeefRestaurant implements Restaurant {

    @Override
    public Burger prepareBurger() {
        System.out.println("one beef burger is created ");
        return new BeefBurger();
    }

    @Override
    public Pizza preparePizza() {
        System.out.println("one beef pizza is created ");
        return new BeefPizza();
    }

}
