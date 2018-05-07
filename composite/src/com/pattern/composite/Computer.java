package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
  private List<ComputerDevice> components = new ArrayList<>();
  public void addComponent(ComputerDevice computerDevice){
    this.components.add(computerDevice);
  }

  public void removeComponent(ComputerDevice computerDevice){
    this.components.remove(computerDevice);
  }

  public int getPrice(){
    int price = 0;
    for(ComputerDevice o : this.components){
      price += o.getPrice();
    }
    return price;
  }

  public int getPower(){
    int power = 0;
    for(ComputerDevice o : this.components){
      power += o.getPower();
    }
    return power;
  }

}
