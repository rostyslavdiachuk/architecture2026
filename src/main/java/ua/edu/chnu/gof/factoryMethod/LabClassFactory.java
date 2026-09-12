package ua.edu.chnu.gof.factoryMethod;

public class LabClassFactory extends UniversityClassFactory{
	protected LabClass createClass(String subject, Integer group) {
		return new LabClass(subject,group);
	}
}
