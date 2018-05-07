package com.pattern.factory;

import java.util.Calendar;

public class SchedulerFactory {
  public static ElevatorScheduler getScheduler(SchedulingStrategyID schedulingStrategyID){
    ElevatorScheduler scheduler = null;
    switch (schedulingStrategyID){
      case RESPONSE_TIME:
        scheduler = ResponseTimeScheduler.getInstance();
        break;
      case THROUGHPUT:
        scheduler = ThroughputSchedular.getInstance();
        break;
      case DYNAMIC:
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hour > 12){
          scheduler = ResponseTimeScheduler.getInstance();
        }else{
          scheduler = ThroughputSchedular.getInstance();
        }

        break;
    }

    return scheduler;
  }
}
