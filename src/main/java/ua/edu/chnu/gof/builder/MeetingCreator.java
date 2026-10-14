package ua.edu.chnu.gof.builder;

import java.util.Arrays;

public class MeetingCreator {
  public static void main(String[] args) {
    var webMeeting = newHangoutsMeetingsCreation();
    webMeeting.startMeeting();
  }

  private static WebMeeting oldHangoutsMeetingsCreation() {
    var students = Arrays.asList("Ivanov", "Sidorov");
    return new WebMeeting("H1", ServiceType.HANGOUTS, 80,
        "Patterns", students, "The best MEME", true);


  }

  private static WebMeeting newHangoutsMeetingsCreation() {
    var builder = new HangoutsMeetingBuilder();
    var students = Arrays.asList("Ivanov", "Sidorov");
    WebMeeting patterns = builder.setId()
        .setType()
        .setSaveRecording()
        .setDurationM(10)
        .setTitle("Patterns")
        .setParticipants(students)
        .build();
    patterns.withId("123");
    return patterns;



  }
}
