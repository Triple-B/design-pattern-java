package com.pattern.factory;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorMnager {

  public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
    super(controllerCount);
  }

  @Override
  protected ElevatorScheduler getScheduler() {
    ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
    return scheduler;
  }
}
