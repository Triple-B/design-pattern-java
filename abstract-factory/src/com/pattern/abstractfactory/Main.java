package com.pattern.abstractfactory;

import apple.laf.JRSUIConstants.Direction;

public class Main {

  public static void main(String[] args) {
    ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorID.LG);
    Door door = factory.createDoor();
    Motor motor = factory.createMotor();
    motor.setDoor(door);

    door.open();
    motor.move(Direction.UP);
  }
}
