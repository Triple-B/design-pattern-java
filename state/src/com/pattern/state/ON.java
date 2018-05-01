package com.pattern.state;

public class ON implements State{

  private static ON on = new ON();

  private ON(){}

  public static ON getInstance(){
    return on;
  }

  @Override
  public void onButtonPushed(Light light) {
    System.out.println("--");

  }

  @Override
  public void offButtonPushed(Light light) {
    System.out.println("Light Off");
    light.setState(OFF.getInstance());
  }
}
