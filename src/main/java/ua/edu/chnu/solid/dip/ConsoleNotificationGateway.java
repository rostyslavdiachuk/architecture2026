package ua.edu.chnu.solid.dip;

import ua.edu.chnu.common.Console;

/** Prints instead of sending. */
public class ConsoleNotificationGateway implements NotificationGateway {

    @Override
    public void notify(String recipient, String subject, String body) {
        Console.step("notify -> " + recipient + " | " + subject + " | " + body);
    }
}
