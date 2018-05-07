package com.pattern.abstractfactory;

import java.util.Objects;

public class LGElevatorFactory extends ElevatorFactory {
  private static ElevatorFactory factory;
  private LGElevatorFactory(){}

  public static ElevatorFactory getInstance(){
    if(Objects.isNull(factory)){
      factory = new LGElevatorFactory();
    }
    return factory;
  }

  @Override
  public Motor createMotor() {
    return new LGMotor();
  }

  @Override
  public Door createDoor() {
    return new LGDoor();
  }
}
