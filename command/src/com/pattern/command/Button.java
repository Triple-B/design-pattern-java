package com.pattern.command;

public class Button {

  private Command command;

  public Button(Command command){
    setCommand(command);
  }

  public void setCommand(Command command){
    this.command = command;
  }

  public void pressed(){
    this.command.execute();
  }
}
