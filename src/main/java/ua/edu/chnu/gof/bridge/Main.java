package ua.edu.chnu.gof.bridge;

public class Main {
	public static void main(String[] args) {
		var paterns = new LectureClass(new GoogleWebMeeting(), "Paterns");
		var patterns = new LabClass(new ZoomWebMeeting(), "Patterns");
		var paterns1 = new LectureClass(new ZoomWebMeeting(), "Paterns");
		var paterns2 = new LectureClass(new DiscordWebMeeting(), "Paterns");
		doClass(paterns);
		doClass(patterns);
		paterns1.startClass();
		paterns1.endClass();
	}

	public static void doClass(UniversityClass clazz){
		clazz.startClass();
	}
}
