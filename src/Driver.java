import Controller.*;
import Model.*;
import View.*;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // load the controller and the models
        Controller controller = new Controller();
        PaymentAdapter paymentAdapter = new Payment();
        BookExam bookExam = new BookExam();
        Administrator administrator = new Administrator(controller);
        Student student = new Student();
        Person person = null;
        Course course = new Course();
        Registration registration = new Registration();
        Exam exam = new Exam();

        // load the website and its webpages
        WebsiteHandler websiteHandler = new WebsiteHandler();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ContactUsPage contactUsPage = new ContactUsPage();
        CoursePage coursePage = new CoursePage();
        ExamPage examPage = new ExamPage();
        PaymentPage paymentPage = new PaymentPage();
        SearchPage searchPage = new SearchPage();
        SignupPage signupPage = new SignupPage();
        FeedbackPage feedbackPage = new FeedbackPage();
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

        Event event = new Event(websiteHandler.getCurrentViewObserver());
        if (websiteHandler.getCurrentViewObserver().equals(homePage)) {
            if (websiteHandler.getCurrentViewObserver().equals(signupPage)) {
                person.register(firstName, lastName, email, password);
                controller.createPerson(person);
            }
            if (websiteHandler.getCurrentViewObserver().equals(loginPage)) {
                person.login(email, password);
            }
            if (person.getPersonType.equals("administrator")) {
                administrator.getAdministratorId();
            }
            if (person.getPersonType.equals("student")) {
                student.getStudentId();
                if (websiteHandler.getCurrentViewObserver().equals(contactUsPage)) {
                    student.getEmail();
                    student.getFirstName();
                    student.getLastName();
                }
                if (websiteHandler.getCurrentViewObserver().equals(coursePage)) {
                    course.checkPrerequisite();
                    bookExam.payExam(paymentAdapter);
                    controller.createRegistration(registration);
                    if (registration.addCouse(course) == true) {
                        controller.createCourse();
                    }
                    if (registration.dropCouse(course) == true) {
                        controller.deleteCourse(Course);
                    }
                    controller.updateCourse();
                    controller.updateRegistration(registration);
                }
                if (websiteHandler.getCurrentViewObserver().equals(bookExamPage)) {
                    controller.readPerson();
                    controller.readExam();
                    bookExam.getCost();
                    bookExam.payExam(paymentAdapter);
                    controller.updateExam(exam);
                    controller.createExam(exam);
                    bookExam.sendEmailReciept(student.getEmail());
                    bookExam.examReminderEmail();
                }
                if (websiteHandler.getCurrentViewObserver().equals(examPage)) {
                    exam.getRoomNumber();
                    exam.getFloorLevel();
                    exam.getBuildingName();
                    exam.getCampusLocation();
                    exam.getStartTime();
                    exam.getDuration();
                }
                if (websiteHandler.getCurrentViewObserver().equals(readCoursePage)) {
                    controller.readCourse();
                }
                if (websiteHandler.getCurrentViewObserver().equals(mapPage)) {
                    controller.readMap();
                }
            }
        } else {
            System.out.println("Error");
        }
        event.onEvent();
        websiteHandler.updateView(event);
    }
}
