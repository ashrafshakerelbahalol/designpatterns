package creationalPatterns.factorymethod;

import creationalPatterns.factorymethod.burgers.BeefBurger;
import creationalPatterns.factorymethod.burgers.VeggieBurger;
import creationalPatterns.factorymethod.restaurants.BeefBurgerRestaurant;
import creationalPatterns.factorymethod.restaurants.Restaurant;
import creationalPatterns.factorymethod.restaurants.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1= new BeefBurgerRestaurant();
        BeefBurger b1 = (BeefBurger) restaurant1.orderBurger();
        Restaurant restaurant2= new VeggieBurgerRestaurant();
        VeggieBurger b2 = (VeggieBurger) restaurant2.orderBurger();

    }
}
