package com.pattern.state;

public class OFF implements State{

  private static OFF off = new OFF();

  private OFF(){}

  public static OFF getInstance(){
    return off;
  }

  @Override
  public void onButtonPushed(Light light) {
    System.out.println("Light On");
    light.setState(ON.getInstance());
  }

  @Override
  public void offButtonPushed(Light light) {
    System.out.println("--");
  }
}
