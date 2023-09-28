import java.sql.Date;

public class Quiz {
    private String quizCode;
    private Double quizScore;
    private Date quizDate;
    private Double duration;
    

    public Quiz(String quizCode, Double quizScore, Date quizDate, Double duration){
        this.quizCode = quizCode;
        this.quizScore = quizScore;
        this.quizDate = quizDate;
        this.duration = duration;
    }

    //setters
    public void setQuizCode(String quizCode){
        this.quizCode = quizCode;
    }
    public void setQuizScore(Double quizScore){
        this.quizScore = quizScore;
    }
    public void setQuizDate(Date quizDate){
        this.quizDate = quizDate;
    }
    public void setDuration(Double duration){
        this.duration = duration;
    }

    //getQuiz method
    public String getQuizCode(){
        return quizCode;
    }
    public Double getQuizScore(){
        return quizScore;
    }
    public Date getQuizDate(){
        return quizDate;
    }
    public Double getDuration(){
        return duration;
    }
    
    //see if quiz passed
    public boolean isPassed(double passThreshold) {
        return quizScore >= passThreshold;
    }
}