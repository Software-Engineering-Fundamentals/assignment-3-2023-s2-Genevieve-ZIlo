import java.sql.Date;

public class Course {
    public String courseID;
    public String topic;
    public String instructorName; // changed from 'instructor' to make it clear
    public Date startDate; // changed from 'LocalDate' to make it more intuitive
    public Double duration;
    public Module[] modules; // changed from 'module' to make it plural
    public Quiz[] quizzes; //added a quiz class

    // Inner class to represent a form
    public class CourseForm {
        private boolean isFilled;
        private String courseDetails;
        private String instructorDetails;

        public CourseForm() {
            this.isFilled = false;
        }

        public void fillCourseDetails(String details) {
            this.courseDetails = details;
            this.isFilled = true; // mark the form as filled
        }

        public void fillInstructorDetails(String details) {
            this.instructorDetails = details;
            this.isFilled = true; // mark the form as filled
        }

        public boolean isFormFilled() {
            return this.isFilled;
        }

        public String getCourseDetails() {
            return this.courseDetails;
        }

        public String getInstructorDetails() {
            return this.instructorDetails;
        }
    }

    // Constructor
    public Course(String courseID, String topic, String instructorName, Date startDate, Double duration, Module[] modules, Quiz[] quizzes) {
        this.courseID = courseID;
        this.topic = topic;
        this.instructorName = instructorName;
        this.startDate = startDate;
        this.duration = duration;
        this.modules = modules;
        this.quizzes = quizzes;
    }

    // Method to get a new CourseForm for filling
    public CourseForm getCourseForm() {
        return new CourseForm();
    }
}
