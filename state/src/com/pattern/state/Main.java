package com.pattern.state;

public class Main {
  public static void main(String[] args) {
    Light light = new Light();
    light.offButtonPushed();
    light.onButtonPushed();
    light.offButtonPushed();
  }
}
