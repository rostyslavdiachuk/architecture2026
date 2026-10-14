package ua.edu.chnu.gof.objectPool;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

public class WebMeetingPool {
	private List<WebMeeting> pool = Arrays.asList(
			WebMeeting.builder().id("2").title("Patterns").type(ServiceType.ZOOM).status(Status.READY).build(),
			WebMeeting.builder().id("3").title("Patterns").type(ServiceType.HANGOUTS).status(Status.READY).build()
	);


	public Optional<WebMeeting> getMeeting() {
		if (hasFree()) {
			var webMeeting = pool.stream()
					.filter(el -> el.getStatus() == Status.READY)
					.findFirst()
					.get();
			webMeeting.setStatus(Status.RUNNING);
			return Optional.of(webMeeting);

		} else {
			System.out.println("No free web meetings now");
			return Optional.empty();
		}
	}

	public void releaseMeeting(WebMeeting webMeeting) {
		webMeeting.setStatus(Status.READY);
		webMeeting.setTitle("");
	}

	private boolean hasFree() {
		return pool.stream().anyMatch(el -> el.getStatus() == Status.READY);
	}
}
