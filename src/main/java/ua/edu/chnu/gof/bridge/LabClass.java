package ua.edu.chnu.gof.bridge;

public class LabClass extends UniversityClass {

	public LabClass(WebMeetingService meetingService, String subject) {
		super(meetingService, subject);
	}

	@Override
	public void startClass() {
		System.out.println("Start lab of '" + super.subject + "'");
		meetingService.startMeeting();
	}
}
