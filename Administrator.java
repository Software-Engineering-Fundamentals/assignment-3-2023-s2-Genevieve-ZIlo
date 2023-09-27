import java.util.ArrayList;
import java.util.List;

public class Administrator {

    private List<Course> managedCourses;
    private List<Enquiry> enquiries;

    public Administrator() {
        this.managedCourses = new ArrayList<>();
        this.enquiries = new ArrayList<>();
    }

    public void addManagedCourse(Course course) {
        if (!this.managedCourses.contains(course)) {
            this.managedCourses.add(course);
            System.out.println("Course added to managed courses.");
        } else {
            System.out.println("Course already in managed courses.");
        }
    }

    public void removeManagedCourse(Course course) {
        if (this.managedCourses.contains(course)) {
            this.managedCourses.remove(course);
            System.out.println("Course removed from managed courses.");
        } else {
            System.out.println("Course not found in managed courses.");
        }
    }

    public void answerEnquiry(Enquiry enquiry, String response) {
        if (this.enquiries.contains(enquiry)) {
            enquiry.setResponse(response);
            System.out.println("Enquiry answered successfully.");
        } else {
            System.out.println("Enquiry not found.");
        }
    }

    public void lodgeEnquiry(String content) {
        Enquiry newEnquiry = new Enquiry(content);
        this.enquiries.add(newEnquiry);
    }
    

    protected class Enquiry {
        private String content;
        private String response;

        public Enquiry(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public String getResponse() {
            return this.response;
        }
    }
}
