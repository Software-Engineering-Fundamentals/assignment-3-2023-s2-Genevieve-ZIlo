import User;

public class Instructor extends User {
    // Initialising the variables
    private Course[] coursesTeaching;
    private String paymentDetails;

    // Constructor for Instructor
    public Instructor(String name, String email, String phoneNumber, String username, String password, Course[] coursesTeaching, String paymentDetails) {
        // Setting the inherited variables from User
        super(name, email, phoneNumber, username, password);
        // Setting the unique variables 
        this.coursesTeaching = coursesTeaching;
        this.paymentDetails = paymentDetails;
    }

    // createCourse method
    public void createCourse(String paymentID) {
        // create the course
        // Course course = new Course("course1");
    }

    // deleteCourse method
    public void deleteCourse(String courseID) {
        // delete a course
        // Course.deleteCourse(courseID)

    }
}
