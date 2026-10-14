package ua.edu.chnu.gof.facade;

public class Main {
	public static void main(String[] args) {
		var markServiceFacade = new MarkServiceFacade();
		var mark = markServiceFacade.getMarkForStudentByName("Diachuk");
		System.out.println(mark);

		var newObject = new Object() {
			public String a;
		};
		var a = newObject.a;

		class SecretClass {}
		record SecretRecord(String a){}
	}
}
