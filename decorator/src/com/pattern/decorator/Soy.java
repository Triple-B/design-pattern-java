package com.pattern.decorator;

public class Soy extends CodimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
