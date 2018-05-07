package com.pattern.decorator;

public class DarkRoast extends Beverage {

  public DarkRoast(){
    this.description = "DarkRoast";
  }

  @Override
  public double cost() {
    return 2.99;
  }
}
