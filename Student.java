public class Student extends User{
    private Course[] coursesEnrolled;
    private int averageGrade;

    public Student(String name, String email, String phoneNumber, String username, String password) {
        super(name, email, phoneNumber, username, password);
       
        this.coursesEnrolled = coursesEnrolled;
        this.averageGrade = averageGrade;
        
    }
    
    //method for verifying student's enrolment into course by finding courseID and paymentID

    public void enrollintoCourse(String courseID, String paymentID){
        this.courseID = courseID;
        this.paymentID = paymentID;
    }

    public void requestRefund(String CourseID){

    }

    public void takequiz(String quizID){

    }
}
