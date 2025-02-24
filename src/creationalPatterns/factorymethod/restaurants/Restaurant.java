package creationalPatterns.factorymethod.restaurants;

import creationalPatterns.factorymethod.burgers.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();

}
