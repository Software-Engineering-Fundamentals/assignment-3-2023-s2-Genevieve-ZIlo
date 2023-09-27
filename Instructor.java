import java.util.ArrayList;
import java.util.Date;

public class Instructor extends User {
    private ArrayList<Course> coursesTeaching;
    private PaymentDetail paymentDetails;  // Updated to type PaymentDetail

    // Constructor for Instructor
    public Instructor(String name, String email, String phoneNumber, String username, String password, String paymentMethod, double amount) {
        // Setting the inherited variables from User
        super(name, email, phoneNumber, username, password);
        // Initialize the ArrayList and PaymentDetail
        this.coursesTeaching = new ArrayList<>();
        this.paymentDetails = new PaymentDetail(paymentMethod, amount);
    }
    public PaymentDetail getPaymentDetails() {
        return paymentDetails;
    }
    // createCourse method
    public void createCourse(String courseID, String topic, String instructorName, java.sql.Date date, Double duration, Module[] module, Quiz[] quizzes) {
        Course newCourse = new Course(courseID, topic, instructorName, date, duration, module, quizzes);
        coursesTeaching.add(newCourse);
    }
    

    // deleteCourse method
    public void deleteCourse(String courseID) {
        for(int i = 0; i < coursesTeaching.size(); i++) {
            if(coursesTeaching.get(i).courseID.equals(courseID)) {
                coursesTeaching.remove(i);
                return;
            }
        }
        System.out.println("Course with ID: " + courseID + " not found.");
    }
    
    protected class PaymentDetail {  // Moved inside Instructor class
        private String paymentMethod;
        private double amount;
        private Date transactionDate;

        public PaymentDetail(String paymentMethod, double amount) {
            this.paymentMethod = paymentMethod;
            this.amount = amount;
            this.transactionDate = new Date();  // Assuming this uses java.util.Date
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public Date getTransactionDate() {
            return transactionDate;
        }
    }
}
