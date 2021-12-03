package Controller;

public class Controller {
    private Course course;
    private Exam exam;
    private Registration registration;
    private Person person;
    private Resource resource;

    /******* Database Controls *******/
    public boolean connectToDB() {
        return false;
    }

    public boolean closeDB() {
        return false;
    }

    /******* Model.Course CRUD *******/
    public void createCourse(Course course) {
    }

    public Course readCourse() {
        return null;
    }

    public void updateCourse(Course course) {
    }

    public void deleteCourse(Course course) {
    }

    /******* Model.Registration CRUD *******/
    public void createRegistration(Registration registraion) {
    }

    public Registration readRegistration() {
        return null;
    }

    public void updateRegistration(Registration registraion) {
    }

    public void deleteRegistration(Registration registraion) {
    }

    /******* Model.Person CRUD *******/
    public void createPerson(Person person) {
    }

    public Person readPerson() {
        return null;
    }

    public void updatePerson(Person person) {
    }

    public void deletePerson(Person person) {
    }

    /******* Model.Exam Controls *******/
    public void createExam(Exam exam) {
    }

    public Exam readExam() {
        return null;
    }

    public void updateExam(Exam exam) {
    }

    public void deleteExam(Exam exam) {
    }

    /******* Model.Resource CRUD *******/
    public void createResource(Resource resource) {
    }

    public Resource readResource() {
        return null;
    }

    public void updateResource(Resource resource) {
    }

    public void deleteResource(Resource resource) {
    }


}
