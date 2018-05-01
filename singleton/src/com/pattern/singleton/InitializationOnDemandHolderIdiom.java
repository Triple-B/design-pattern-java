package com.pattern.singleton;

public class InitializationOnDemandHolderIdiom {

  /**
   * 미국 메릴랜드 대학의 컴퓨터 과학 연구원인 Bill pugh 가 기존의 java singleton pattern이 가지고 있는 문제들을 해결 하기 위해 새로운 singleton pattern을 제시하였다.
   * Initialization on demand holder idiom기법이다.
   * 이것은 jvm 의 class loader의 매커니즘과 class의 load 시점을 이용하여 내부 class를 생성시킴으로 thread 간의 동기화 문제를 해결한다.
   */
  private InitializationOnDemandHolderIdiom () {}
  private static class Singleton {
    private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
  }

  public static InitializationOnDemandHolderIdiom getInstance () {
    System.out.println("create instance");
    return Singleton.instance;
  }

  public void print(){
    System.out.println("ThreadSafeSingleton print");
  }
}
