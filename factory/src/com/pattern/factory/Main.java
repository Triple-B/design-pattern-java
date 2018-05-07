package com.pattern.factory;

import apple.laf.JRSUIConstants.Direction;

public class Main {

  public static void main(String[] args) {
    ElevatorMnager elevatorMnager1 = new ElevatorManagerWithResponseTimeScheduling(2);
    elevatorMnager1.requestElevator(10,Direction.UP);

    ElevatorMnager elevatorMnager2 = new ElevatorManagerWithThroughputScheduling(2);
    elevatorMnager2.requestElevator(10,Direction.UP);

    ElevatorMnager elevatorMnager3 = new ElevatorManagerWithDynamicScheduling(10);
    elevatorMnager3.requestElevator(10,Direction.UP);
  }
}
