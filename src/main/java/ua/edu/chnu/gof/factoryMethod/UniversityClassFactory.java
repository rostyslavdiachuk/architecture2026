package ua.edu.chnu.gof.factoryMethod;

public abstract class UniversityClassFactory {
	protected abstract UniversityClass createClass(String subject, Integer group);
}
