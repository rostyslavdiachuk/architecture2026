package ua.edu.chnu.grasp.controller;

import ua.edu.chnu.common.Console;
import ua.edu.chnu.grasp.controller.RegistrationController.RegisterCommand;
import ua.edu.chnu.grasp.controller.RegistrationController.RegistrationResult;

/**
 * Presentation only: turn the operator's menu choice into a command, hand it to
 * the controller, print the result.
 */
public class ConsoleRegistrationUI {

    private final RegistrationController controller;

    public ConsoleRegistrationUI(RegistrationController controller) {
        this.controller = controller;
    }

    public void onRegisterMenuOption(String studentId, String courseCode) {
        RegistrationResult result = controller.registerStudentForCourse(
                new RegisterCommand(studentId, courseCode));
        if (result.success()) {
            Console.ok("console: " + result.message());
        } else {
            Console.fail("console: " + result.message());
        }
    }
}
