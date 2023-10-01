import java.util.ArrayList;
import java.util.List;

public class Administrator {
    // Fields to store managed courses and enquiries
    private List<Course> managedCourses;
    private List<Enquiry> enquiries;

    // Constructor to initialize managedCourses and enquiries
    public Administrator() {
        this.managedCourses = new ArrayList<>();
        this.enquiries = new ArrayList<>();
    }

    // Method to add a course to the list of managed courses
    public void addManagedCourse(Course course) {
        if (!this.managedCourses.contains(course)) {
            this.managedCourses.add(course);
            System.out.println("Course added to managed courses.");
        } else {
            System.out.println("Course already in managed courses.");
        }
    }

    // Method to remove a course from the list of managed courses
    public void removeManagedCourse(Course course) {
        if (this.managedCourses.contains(course)) {
            this.managedCourses.remove(course);
            System.out.println("Course removed from managed courses.");
        } else {
            System.out.println("Course not found in managed courses.");
        }
    }

    // Method to answer an enquiry with a response
    public void answerEnquiry(Enquiry enquiry, String response) {
        if (this.enquiries.contains(enquiry)) {
            enquiry.setResponse(response);
            System.out.println("Enquiry answered successfully.");
        } else {
            System.out.println("Enquiry not found.");
        }
    }

    // Method to lodge a new enquiry
    public void lodgeEnquiry(String content) {
        Enquiry newEnquiry = new Enquiry(content);
        this.enquiries.add(newEnquiry);
    }

    // Inner class to represent an enquiry
    protected class Enquiry {
        private String content;
        private String response;

        // Constructor for Enquiry
        public Enquiry(String content) {
            this.content = content;
        }

        // Getter method for enquiry content
        public String getContent() {
            return this.content;
        }

        // Setter method for setting a response to the enquiry
        public void setResponse(String response) {
            this.response = response;
        }

        // Getter method for enquiry response
        public String getResponse() {
            return this.response;
        }
    }
}
