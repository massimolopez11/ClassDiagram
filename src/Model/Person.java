package Model;

public abstract class Person implements User {
    private String lastName;
    private String firstname;
    private String email;
    private String password;
    private boolean loginStatus;

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    public String login(String email, String password) {
        return null;
    }

    public String logout() {
        return null;
    }

    public String register(String firstName, String lastName, String email, String password) {
        return null;
    }
}
