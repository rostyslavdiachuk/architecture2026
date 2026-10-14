package ua.edu.chnu.gof.observer;

public class Main {
	public static void main(String[] args) {
		var lecturerPublisher = new NotificationChannel();
		var asistants = new NotificationChannel();
		lecturerPublisher.subscribe(new AssistantSubscriber(asistants,"Dracula"));
		lecturerPublisher.subscribe(new AssistantSubscriber(asistants,"Hulk"));
		lecturerPublisher.subscribe(new StudentSubscriber("Diachuk",643));
		asistants.subscribe(new StudentSubscriber("Diachuk",643));
		lecturerPublisher.subscribe(new StudentSubscriber("Ivanov",643));
		asistants.subscribe(new StudentSubscriber("Ivanov",643));
		lecturerPublisher.subscribe(new StudentSubscriber("Petrov",643));
		asistants.subscribe(new StudentSubscriber("Petrov",643));
		var lecturer = new Lecturer(lecturerPublisher);
		lecturer.sentUpdate("100(A) to everyone");
		System.out.println("**************");
		lecturerPublisher.subscribe(new StudentSubscriber("Petrov1",643));
		asistants.subscribe(new StudentSubscriber("Petrov1",643));
		lecturerPublisher.subscribe(new StudentSubscriber("Petrov2",643));
		asistants.subscribe(new StudentSubscriber("Petrov2",643));
		lecturer.sentUpdate("100(A) to everyone");

	}
}
