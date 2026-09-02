package ua.edu.chnu.solid.isp;

import ua.edu.chnu.common.Console;
import ua.edu.chnu.solid.isp.Roles.BudgetApprover;

/** A department head is a lecturer who also approves budgets. */
public class DepartmentHead extends Lecturer implements BudgetApprover {

    public DepartmentHead(String fullName) {
        super(fullName);
    }

    @Override
    public void approveDepartmentBudget(int amountUah) {
        Console.ok(fullName() + " approved a department budget of " + amountUah + " UAH");
    }
}
