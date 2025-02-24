package creationalPatterns.abstractfactorymethod.pizzas;

public class BeefPizza implements Pizza{

    @Override
    public void prepare() {
      System.out.println("one beef pizza is ready");
    }
    
}
