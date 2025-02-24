package creationalPatterns.abstractfactorymethod.restaurant;

import java.nio.Buffer;

import creationalPatterns.abstractfactorymethod.burgers.BeefBurger;
import creationalPatterns.abstractfactorymethod.burgers.Burger;
import creationalPatterns.abstractfactorymethod.pizzas.Pizza;
import creationalPatterns.abstractfactorymethod.pizzas.VeggiePizza;

public class VeggieRestaurant implements Restaurant{

    @Override
    public Burger prepareBurger() {
        System.out.println("one Veggie burger is created ");
        return new BeefBurger();
    }

    @Override
    public Pizza preparePizza() {
        System.out.println("one Veggie pizza is created ");
        return new VeggiePizza();

    }
    
}
