import java.sql.Date;
public class Quiz {
    // Fields to store quiz information
    private String quizCode;
    private Double quizScore;
    private Date quizDate;
    private Double duration;

    // Constructor to initialize quiz information
    public Quiz(String quizCode, Double quizScore, Date quizDate, Double duration) {
        this.quizCode = quizCode;
        this.quizScore = quizScore;
        this.quizDate = quizDate;
        this.duration = duration;
    }

    // Setters to update individual quiz information
    public void setQuizCode(String quizCode) {
        this.quizCode = quizCode;
    }
    public void setQuizScore(Double quizScore) {
        this.quizScore = quizScore;
    }
    public void setQuizDate(Date quizDate) {
        this.quizDate = quizDate;
    }
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    // Getters to retrieve individual quiz information
    public String getQuizCode() {
        return quizCode;
    }
    public Double getQuizScore() {
        return quizScore;
    }
    public Date getQuizDate() {
        return quizDate;
    }
    public Double getDuration() {
        return duration;
    }

    // Method to check if the quiz is passed based on a pass threshold
    public boolean isPassed(double passThreshold) {
        return quizScore >= passThreshold;
    }
}