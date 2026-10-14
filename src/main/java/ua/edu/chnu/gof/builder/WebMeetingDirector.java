package ua.edu.chnu.gof.builder;

import java.util.List;

public class WebMeetingDirector {
  private WebMeetingBuilder builder;


  public WebMeeting build(String title, List<String> participants){
    return builder
        .setId()
        .setType()
        .setTitle(title)
        .setParticipants(participants)
        .build();
  }
}
