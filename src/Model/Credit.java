package Model;

public class Credit extends Payment{
    private String number;
    private String type;
    private String expireDate;

    public boolean validateCard(String number, String type, String expireDate) {
        return true;
    }
}
