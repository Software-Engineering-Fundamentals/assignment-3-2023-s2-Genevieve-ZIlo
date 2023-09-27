public class Payment {
    private String paymentID;
    private Double amount;

    public Payment(String paymentID, Double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
    }

    public void verifyPayment() {
        if (isValid(paymentID)) {
            System.out.println("Payment " + paymentID + " is verified.");
        } else {
            System.out.println("Payment " + paymentID + " is not valid.");
        }
    }

    // Simulate the bill calculation
    public double calculateBill() {
        double handlingFee = 0.02 * amount;
        double totalBill = amount + handlingFee;

        System.out.println("Total bill with handlingFee: " + totalBill);
        return totalBill;
    }

    // Helper method to simulate validation
    private boolean isValid(String paymentID) {
        // Simple validation for this example; can be replaced with actual logic
        return paymentID != null && !paymentID.isEmpty();
    }
}
