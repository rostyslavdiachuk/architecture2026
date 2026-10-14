package ua.edu.chnu.gof.bridge;

import lombok.AllArgsConstructor;

import java.util.stream.IntStream;

public class LectureClass extends UniversityClass {


	public LectureClass(WebMeetingService meetingService, String subject) {
		super(meetingService, subject);
	}

	@Override
	public void startClass() {
		System.out.println("Start lecture of '" + super.subject + "'");
		meetingService.startMeeting();
	}

	public void endClass(){
		System.out.println("End lecture");
		meetingService.endMeeting();
	}
}
