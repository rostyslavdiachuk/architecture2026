package ua.edu.chnu.gof.abstractFactory.factories;

import ua.edu.chnu.gof.abstractFactory.Log;
import ua.edu.chnu.gof.abstractFactory.PracticeClass;
import ua.edu.chnu.gof.abstractFactory.PracticeLog;
import ua.edu.chnu.gof.factoryMethod.UniversityClass;

public class PracticeClassFactory extends UniversityClassFactory {
  @Override
  public UniversityClass createClass(String subject, Integer group) {
    return new PracticeClass();
  }

  @Override
  public Log createLog() {
    return new PracticeLog();
  }
}
