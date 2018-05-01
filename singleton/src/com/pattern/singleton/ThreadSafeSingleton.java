package com.pattern.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance;
  private ThreadSafeSingleton(){}

  public static synchronized ThreadSafeSingleton getInstance(){
    if(Objects.isNull(instance)){
      instance = new ThreadSafeSingleton();
      System.out.println("create instance");
    }
    return instance;
  }

  public void print(){
    System.out.println("ThreadSafeSingleton print");
  }
}
