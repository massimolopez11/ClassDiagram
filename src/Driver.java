import Controller.Controller;
import Controller.Event;
import Model.Administrator;
import Model.Student;
import Model.Person;
import View.*;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Controller controller = new Controller();
        ViewObserver viewObserver;
        Administrator administrator = new Administrator(controller);
        Student student = new Student(controller);
        Person person = new Person();
        WebsiteHandler websiteHandler = new WebsiteHandler();
        websiteHandler.initializePages();
        WebPageTemplate webPageTemplate = new WebPageTemplate() {
            @Override
            public void createPage() {
                super.createPage();
            }

            @Override
            public void readPage() {
                super.readPage();
            }

            @Override
            public void updatePage() {
                super.updatePage();
            }

            @Override
            public void deletePage() {
                super.deletePage();
            }
        };

        String url;
        Event event = new Event(websiteHandler.getCurrentViewObserver());
        if (url.equals("homepage")) {
            viewObserver = new HomepageObserver();
            if (url.equals("registration")) {
                person.register(firstName, lastName, email, password);
                controller.createRegistration();
            }
            person.login(email, password);
            if (person.getPersonType.equals("administrator")) {
                administrator.getAdministratorId();
            }
            if (person.getPersonType.equals("student")) {
                student.getStudentId();
                if (ContactPage) {

                }
                if (CourseRegistrationPage) {

                }
                if (MapPage) {

                }
                if (BookExamPage) {

                }
                if (ExamPage) {

                }
                if (ReadCoursePage) {

                }
            }


        } else {
            System.out.println("Error, invalid URL");
        }
        event.onEvent();
        websiteHandler.updateView(event);

        HomePage homepage = new HomePage();
        LoginPage loginPage = new LoginPage();
        PersonFactory personFactory = new Person


    }
}
