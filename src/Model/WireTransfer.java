package Model;

public class WireTransfer extends Payment {
    private String bankID;
    private String bankName;

    public boolean validateWire(String bankID, String bankName) {
        return true;
    }

}
