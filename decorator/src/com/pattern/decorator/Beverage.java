package com.pattern.decorator;

public abstract class Beverage {
  String description = "no name";
  public String getDescription(){
    return description;
  }

  public abstract double cost();
}
