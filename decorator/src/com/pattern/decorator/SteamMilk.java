package com.pattern.decorator;

public class SteamMilk extends CodimentDecorator {
  Beverage beverage;

  public SteamMilk(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", SteamMilk";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
