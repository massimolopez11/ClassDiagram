package Model;

import Controller.Controller;

public class Administrator extends Person{
    private int administratorId;
    Controller controller;
    public int getAdministratorId() {
        return administratorId;
    }
    public Administrator(Controller controller){
        this.controller = controller;
    }
}
