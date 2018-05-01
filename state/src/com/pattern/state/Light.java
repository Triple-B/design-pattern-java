package com.pattern.state;

public class Light {

  private State state;

  public Light(){
    this.state = OFF.getInstance();
  }

  public void setState(State state){
    this.state = state;
  }

  public void onButtonPushed(){
    this.state.onButtonPushed(this);
  }

  public void offButtonPushed(){
    this.state.offButtonPushed(this);
  }

}
