package creationalPatterns.abstractfactorymethod.pizzas;

public class VeggiePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("one veggie pizza is ready");
  }

}
