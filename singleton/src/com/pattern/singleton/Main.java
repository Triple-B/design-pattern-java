package com.pattern.singleton;

public class Main {
  public static void main(String[] args) {
    // https://blog.seotory.com/post/2016/03/java-singleton-pattern
    EgarSingleton.getInstance().print();

    LazySingleton.getInstance().print();
    LazySingleton.getInstance().print();

    StaticBlockSingleton.getInstance().print();

    EnumInitialization.getInstance();

    InitializationOnDemandHolderIdiom.getInstance().print();

    ThreadSafeSingleton.getInstance().print();
  }
}
