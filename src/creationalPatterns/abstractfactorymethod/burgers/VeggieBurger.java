package creationalPatterns.abstractfactorymethod.burgers;

public class VeggieBurger implements Burger{

    @Override
    public void prepare() {
      System.out.println("one veggie burger is ready");
    }
    
}
