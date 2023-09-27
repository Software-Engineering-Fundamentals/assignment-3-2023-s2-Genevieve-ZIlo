public class Main {

    public static void main(String[] args) {
        // SCENARIO 1: Instructor registers a course on the learning portal/website

        // 1. Instructor instance
        Instructor instructor = new Instructor("John Doe", "john@example.com", "+123456789", "johnDoe", "password123", "credit card", 50.0);

        // 2. Instructor initiates the course creation
        Course newCourse = new Course("course101", "Math", "John Doe", new java.sql.Date(System.currentTimeMillis()), 2.0, null, null);
        System.out.println("Course created with ID: " + newCourse.courseID);

        // 3. Get a course registration form
        Course.CourseForm form = newCourse.getCourseForm();
        System.out.println("Course registration form presented to instructor.");

        // 4. Fill course details
        form.fillCourseDetails("Topic: Math, Duration: 2 hours");
        System.out.println("Course details filled: " + form.getCourseDetails());

        // 5. Display instructor registration form (if not already registered) and fill it
        form.fillInstructorDetails("Name: John Doe, Affiliation: XYZ University");
        System.out.println("Instructor details filled: " + form.getInstructorDetails());

        // 6. Prompt for registration fee
        System.out.println("Displaying and prompting for $50 registration fee.");
        Payment payment = new Payment("payment101", 50.0);
        payment.verifyPayment();

        // 7. Register the instructor (in reality, more logic needed)
        System.out.println("Instructor registered.");

        // 8. Store the course
        instructor.createCourse(newCourse.courseID, newCourse.topic, newCourse.instructorName, newCourse.startDate, newCourse.duration, null, null);
        System.out.println("Course added to instructor's teaching list.");


        // SCENARIO 2: Lodge a general enquiry about the portal which is successfully addressed by the Manager

        Administrator manager = new Administrator();
        User user = new User("Alice", "alice@example.com", "+987654321", "aliceUser", "alicePass");

        // 1. User lodges an enquiry
        user.lodgeEnquiry("How can I reset my password?", manager);
        System.out.println("Enquiry lodged by user: How can I reset my password?");

        // 2. Display unanswered enquiries (simplified)
        System.out.println("Displaying unanswered enquiries to manager.");

        // 3. Manager answers the enquiry
        Administrator.Enquiry userEnquiry = manager.new Enquiry("How can I reset my password?");
        manager.answerEnquiry(userEnquiry, "You can reset your password by clicking on the 'Forgot Password' link on the login page.");
        System.out.println("Manager answered the enquiry: " + userEnquiry.getResponse());

        // 4. Inform user about the enquiry status
        System.out.println("Enquiry was addressed successfully.");
    }
}
