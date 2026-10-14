package ua.edu.chnu.gof.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssistantSubscriber implements Subscriber {
	private NotificationChannel channel;
	private String name;

	@Override
	public void processUpdate(String update) {
		System.out.println("***************");
		System.out.println("Assistant" + name + "EVENTS");
		System.out.println("Assistant" + name + " processed update " + update);
		channel.notifyAll("From assistant: " + update);
		System.out.println("***************");
	}
}
