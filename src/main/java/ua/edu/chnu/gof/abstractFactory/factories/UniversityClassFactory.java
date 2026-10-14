package ua.edu.chnu.gof.abstractFactory.factories;


import ua.edu.chnu.gof.abstractFactory.Log;
import ua.edu.chnu.gof.factoryMethod.UniversityClass;

public abstract class UniversityClassFactory {
	public abstract UniversityClass createClass(String subject, Integer group);

	public abstract Log createLog();
}
