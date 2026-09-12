package ua.edu.chnu.gof.factoryMethod;

import java.util.Arrays;

public class UniversityClassScheduler {
	public static void main(String[] args) {
		scheduleLectureAndLab("GOF ", 343);
	}

	/**
	 * Основна ціль методу це створити лекцію та лабораторне заняття для певної групи,
	 * та сповістити її
	 */
	private static void scheduleLectureAndLab(String subject, Integer group) {

		var factories =
				Arrays.asList(new LabClassFactory(), new LectureClassFactory());
		factories.stream()
				 .map(factory -> factory.createClass(subject, group))
				 .forEach(UniversityClass::notifyAttendee);
	}

	public static UniversityClass createClass(String type, String subject, Integer group){
		var lectureClassFactory = new LectureClassFactory();
		var labClassFactory = new LabClassFactory();

		return switch (type){
			case "lecture" -> lectureClassFactory.createClass(subject, group);
			case "lab" -> labClassFactory.createClass(subject, group);
			default -> throw new IllegalArgumentException("Unknown class type: " + type);
		};
	}


	public static UniversityClass createClassFactoryMethod(String type, String subject, Integer group){
		return switch (type){
			case "lecture" -> new LectureClass(subject, Arrays.asList(group));
			case "lab" -> new LabClass(subject, group);
			default -> throw new IllegalArgumentException("Unknown class type: " + type);
		};
	}
}
