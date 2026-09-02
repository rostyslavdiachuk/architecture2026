package ua.edu.chnu.solid.isp;

import ua.edu.chnu.common.Console;
import ua.edu.chnu.solid.isp.Roles.Learner;
import ua.edu.chnu.solid.isp.Roles.TranscriptRequester;

/** A student implements only the roles a student has. No stub methods. */
public class Student implements Learner, TranscriptRequester {

    private final String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String fullName() {
        return fullName;
    }

    @Override
    public void enrollInCourse(String courseCode) {
        Console.ok(fullName + " enrolled in " + courseCode);
    }

    @Override
    public void payTuition(int amountUah) {
        Console.ok(fullName + " paid " + amountUah + " UAH tuition");
    }

    @Override
    public void requestTranscript() {
        Console.ok(fullName + " requested a transcript");
    }
}
