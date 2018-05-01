package com.pattern.singleton;

import java.util.Objects;

public class LazySingleton {
  private static LazySingleton instance;
  private LazySingleton(){}

  public static LazySingleton getInstance(){
    if(Objects.isNull(instance)){
      instance = new LazySingleton();
      System.out.println("create instance");
    }
    return instance;
  }

  public void print(){
    System.out.println("LazySingleton print");
  }
}
