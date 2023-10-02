public class Payment {
    // Fields to store payment information
    private String paymentID;
    private Double amount;

    // Constructor to initialize payment information
    public Payment(String paymentID, Double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
    }

    // Method to verify the payment
    public void verifyPayment() {
        if (isValid(paymentID)) {
            System.out.println("Payment " + paymentID + " is verified.");
        } else {
            System.out.println("Payment " + paymentID + " is not valid.");
        }
    }

    // Method to simulate the calculation of the bill
    public double calculateBill() {
        double handlingFee = 0.02 * amount;
        double totalBill = amount + handlingFee;

        System.out.println("Total bill with handlingFee: " + totalBill);
        return totalBill;
    }

    // Helper method to simulate validation
    private boolean isValid(String paymentID) {
        // Simple validation for this example
        return paymentID != null && !paymentID.isEmpty();
    }
}