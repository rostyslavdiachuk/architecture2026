package ua.edu.chnu.gof.observer;

public class Lecturer {
	private NotificationChannel publisher;
	public Lecturer(NotificationChannel publisher) {
		this.publisher = publisher;
	}

	public void sentUpdate(String updateMessage)
	{
		System.out.println("***************");
		System.out.println("Lecture" + "EVENTS");
		publisher.notifyAll(updateMessage);
		System.out.println("***************");
	}
}
