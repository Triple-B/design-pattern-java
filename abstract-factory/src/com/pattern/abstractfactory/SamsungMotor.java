package com.pattern.abstractfactory;

import apple.laf.JRSUIConstants.Direction;

public class SamsungMotor extends Motor {

  @Override
  protected void moveMotor(Direction direction) {
    System.out.println("move");
  }
}
