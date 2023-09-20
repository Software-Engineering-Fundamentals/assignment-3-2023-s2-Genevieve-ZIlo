// Payment Class
public class Payment {
    // 
    private String paymentID;
    private Double amount;

    public Payment(String paymentID, Double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
    }

    public void verifyPayment() {
        if (paymentID is valid) {
            System.verified(paymentID)
        }
    }
}

