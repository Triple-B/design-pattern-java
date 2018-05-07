package com.pattern.abstractfactory;

import java.util.Objects;

public class SamsungElevatorFactory extends ElevatorFactory {

  private static ElevatorFactory factory;
  private SamsungElevatorFactory(){}

  public static ElevatorFactory getInstance(){
    if(Objects.isNull(factory)){
      factory = new SamsungElevatorFactory();
    }
    return factory;
  }

  @Override
  public Motor createMotor() {
    return new SamsungMotor();
  }

  @Override
  public Door createDoor() {
    return new SamsungDoor();
  }
}
