package ua.edu.chnu.gof.builder;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.With;

@Getter
@ToString
@Builder
@With
public class WebMeeting {
	private final String id;
	private final ServiceType type;
	private final int durationM;
	private final String title;
	private final List<String> participants;
	private final String attachments;
	private final boolean saveRecording;


	public void startMeeting() {
		System.out.println(this.toString());
	}
}
