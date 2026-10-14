package ua.edu.chnu.gof.abstractFactory;

import ua.edu.chnu.gof.factoryMethod.UniversityClass;

public class PracticeClass extends UniversityClass {
  @Override
  public void notifyAttendee() {
    System.out.println("Practice class Started");
  }
}
