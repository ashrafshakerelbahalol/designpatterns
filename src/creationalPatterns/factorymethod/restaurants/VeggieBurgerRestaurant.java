package creationalPatterns.factorymethod.restaurants;

import creationalPatterns.factorymethod.burgers.BeefBurger;
import creationalPatterns.factorymethod.burgers.Burger;
import creationalPatterns.factorymethod.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant  {

    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
    
}
