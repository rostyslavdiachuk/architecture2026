package ua.edu.chnu.gof.abstractFactory;

public class PracticeLog extends Log{
  @Override
  protected void prepareLog() {
    System.out.println("Practice log prepared");
  }
}
