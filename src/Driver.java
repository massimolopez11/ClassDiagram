import Controller.Controller;
import Controller.Event;
import Model.Administrator;
import View.WebsiteHandler;

public class Driver {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Administrator administrator = new Administrator(controller);
        WebsiteHandler websiteHandler = new WebsiteHandler();
        Event event = new Event(websiteHandler.getCurrentViewObserver());
        websiteHandler.updateView(event);



    }
}
