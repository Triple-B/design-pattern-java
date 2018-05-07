package com.pattern.factory;

public class ElevatorManagerWithDynamicScheduling extends ElevatorMnager {

  public ElevatorManagerWithDynamicScheduling(int controllerCount) {
    super(controllerCount);
  }

  @Override
  protected ElevatorScheduler getScheduler() {
    ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
    return scheduler;
  }
}
