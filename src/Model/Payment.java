package Model;

import Controller.PaymentAdapter;

public class Payment implements PaymentAdapter {
    public float amount;

    public boolean verifyPayment() {
        return true;
    }

    public float returnPayment() {
        return 0;
    }

}
