package ua.edu.chnu.gof.abstractFactory.factories;


import ua.edu.chnu.gof.abstractFactory.GradeLog;
import ua.edu.chnu.gof.abstractFactory.Log;
import ua.edu.chnu.gof.factoryMethod.LabClass;

public class LabClassFactory extends UniversityClassFactory {
	public LabClass createClass(String subject, Integer group) {
		return new LabClass(subject, group);
	}

	@Override
  public Log createLog() {
		return new GradeLog();
	}
}
