package creationalPatterns.factorymethod.restaurants;

import creationalPatterns.factorymethod.burgers.BeefBurger;
import creationalPatterns.factorymethod.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant  {

    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
    
}
