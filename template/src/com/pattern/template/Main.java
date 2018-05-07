package com.pattern.template;

import apple.laf.JRSUIConstants;

public class Main {
  public static void main(String[] args) {
    Door door = new Door();
    HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
    hyundaiMotor.move(JRSUIConstants.Direction.UP);
  }

}
