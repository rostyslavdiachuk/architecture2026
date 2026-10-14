package ua.edu.chnu.gof.abstractFactory;

import ua.edu.chnu.gof.abstractFactory.factories.LabClassFactory;
import ua.edu.chnu.gof.abstractFactory.factories.LectureClassFactory;
import ua.edu.chnu.gof.abstractFactory.factories.PracticeClassFactory;
import ua.edu.chnu.gof.abstractFactory.factories.UniversityClassFactory;

public class ClassScheduler {

	public static void main(String[] args) {
		scheduleClass(new LabClassFactory(), "GOF Patterns", 343);
		scheduleClass(new LectureClassFactory(), "GOF Patterns", 343);
		scheduleClass(new PracticeClassFactory(), "GOF Patterns", 343);
	}

	public static void scheduleClass(UniversityClassFactory factory, String subject, int group) {
		var uClass = factory.createClass(subject, group);
		var log = factory.createLog();
		uClass.notifyAttendee();
		log.prepareLog();
	}
}