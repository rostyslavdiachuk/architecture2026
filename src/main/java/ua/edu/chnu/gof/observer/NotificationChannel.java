package ua.edu.chnu.gof.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class NotificationChannel {
	private Set<Subscriber> subscribers = new HashSet<>();

	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}

	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public void notifyAll(String msg) {
		subscribers.forEach(el -> el.processUpdate(msg));
	}

}
