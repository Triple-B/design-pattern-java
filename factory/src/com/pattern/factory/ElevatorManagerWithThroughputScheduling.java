package com.pattern.factory;

import java.util.Calendar;

public class ElevatorManagerWithThroughputScheduling extends ElevatorMnager {

  public ElevatorManagerWithThroughputScheduling(int controllerCount) {
    super(controllerCount);
  }

  @Override
  protected ElevatorScheduler getScheduler() {
    ElevatorScheduler scheduler = null;
    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    if(hour > 12){
      scheduler = ResponseTimeScheduler.getInstance();
    }else{
      scheduler = ThroughputSchedular.getInstance();
    }
    return scheduler;
  }
}
