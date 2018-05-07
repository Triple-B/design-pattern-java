package com.pattern.observer;

import java.util.List;

public class MinMaxView implements Observer {
  private ScoreRecord scoreRecord;

  public MinMaxView(ScoreRecord scoreRecord){
    this.scoreRecord = scoreRecord;
  }

  public void update(){
    displayScores(scoreRecord);
  }

  private void displayScores(ScoreRecord record){
    System.out.println("List ............ ");
    System.out.println();
  }
}
