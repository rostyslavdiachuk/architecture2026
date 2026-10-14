package ua.edu.chnu.gof.composite;

import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		var java = getSubject();
		var diachuk = new Student("Diachuk", Arrays.asList(java, getSubject2()));
		System.out.println(diachuk.getAverage());
	}

	private static Subject getSubject() {
		return new Subject("Java", Arrays.asList(
				new LearningModule(1, Arrays.asList(
						new Lab(1, 30),
						new Lab(2, 20))),
				new SingleLabModule(new Lab(3, 50))));
	}

	private static Subject getSubject2() {
		return new Subject("APPZ", Arrays.asList(
				new LearningModule(1, Arrays.asList(
						new Lab(1, 30),
						new Lab(2, 20),
						new Lab(3, 20),
						new Lab(4, 20))),
				new SingleLabModule(new Lab(5, 10))));
	}
}
