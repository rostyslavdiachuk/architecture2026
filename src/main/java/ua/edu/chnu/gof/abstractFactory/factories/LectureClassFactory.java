package ua.edu.chnu.gof.abstractFactory.factories;

import ua.edu.chnu.gof.abstractFactory.LectureClass;
import ua.edu.chnu.gof.abstractFactory.Log;
import ua.edu.chnu.gof.abstractFactory.VisitorLog;
import ua.edu.chnu.gof.factoryMethod.UniversityClass;

import java.util.Collections;


public class LectureClassFactory extends UniversityClassFactory {

	@Override
  public UniversityClass createClass(String subject, Integer group) {
		return new LectureClass(subject, Collections.singletonList(group));
	}

	@Override
  public Log createLog() {
		return new VisitorLog();
	}
}
