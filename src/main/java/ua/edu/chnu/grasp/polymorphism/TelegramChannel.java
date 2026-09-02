package ua.edu.chnu.grasp.polymorphism;

import ua.edu.chnu.common.Console;

public class TelegramChannel implements Channel {

    @Override
    public void deliver(String recipient, String text) {
        Console.step("Telegram Bot API -> @" + recipient + " : " + text);
    }

    @Override
    public String previewLabel(String recipient, String text) {
        return "Telegram to @" + recipient;
    }

    @Override
    public double costUah(String text) {
        return 0.00;
    }
}
