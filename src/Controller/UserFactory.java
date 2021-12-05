package Controller;
import Model.*;

public class UserFactory {
    public User getPerson(String personType){
        if(personType == null){
            return null;
        }

        if(personType.equals("Model.Student")){
            return new Student();
        }

        if(personType.equals("Adminstrator")) {
            return new Administrator();
        }
        return null;
    }
}
