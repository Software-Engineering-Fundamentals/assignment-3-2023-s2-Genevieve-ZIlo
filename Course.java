import java.sql.Date;

public class Course {
    public String courseID;
    public String topic;
    public String instructor;
    public Date LocalDate;
    public Double duration;
    public Module[] module;
    public Quiz[] quizzes;


	public Course(String courseID, String topic, String instructor, Date LocalDate, Double duration, Module[] module, Quiz[] quizzes){
        this.courseID = courseID;
        this.topic = topic;
        this.instructor = instructor;
        this.LocalDate = LocalDate;
        this.module = module;
        this.quizzes = quizzes;
    }
    
}
