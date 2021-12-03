package Model;

import Controller.PaymentAdapter;

public class Course {
    private String name;
    private String section;
    private double credits;

    public boolean checkPrerequisite() {
        return true;
    }

    public boolean payCourse(PaymentAdapter payment) {
        return true;
    }


}
