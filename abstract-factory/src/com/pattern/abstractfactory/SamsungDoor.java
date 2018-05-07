package com.pattern.abstractfactory;

public class SamsungDoor extends Door {

  @Override
  protected void doClose() {
    System.out.println("close");
  }

  @Override
  protected void doOpen() {
    System.out.println("open");
  }
}
