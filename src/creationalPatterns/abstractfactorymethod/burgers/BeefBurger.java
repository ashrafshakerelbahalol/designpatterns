package creationalPatterns.abstractfactorymethod.burgers;

public class BeefBurger implements Burger{

    @Override
    public void prepare() {
      System.out.println("one beef burger is ready");
    }
    
}
