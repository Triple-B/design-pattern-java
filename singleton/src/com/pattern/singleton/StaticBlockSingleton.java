package com.pattern.singleton;

public class StaticBlockSingleton {
  private static StaticBlockSingleton instance;
  private StaticBlockSingleton(){}

  static {
    try{
      System.out.println("instance create...");
      instance = new StaticBlockSingleton();
    }catch (Exception e){
      throw new RuntimeException("Exception creating StaticBlockInitalization instance.");
    }
  }

  public static StaticBlockSingleton getInstance(){
    return instance;
  }

  public void print(){
    System.out.println("StaticBlockSingleton print");
  }
}
