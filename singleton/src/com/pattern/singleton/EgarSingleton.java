package com.pattern.singleton;

public class EgarSingleton {
  private static EgarSingleton instance = new EgarSingleton();
  private EgarSingleton(){
    System.out.println("EgarSingleton");
  }
  public static EgarSingleton getInstance(){
    return instance;
  }

  public void print(){
    System.out.println("EgarSingleton print");
  }
}
