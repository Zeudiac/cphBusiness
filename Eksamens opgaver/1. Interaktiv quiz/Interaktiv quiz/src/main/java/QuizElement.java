import java.util.ArrayList;

public class QuizElement {

    private String question;
    private String correctAnswer;
    private String[] wrongAnswers;

    public QuizElement(String question, String correctAnswer, String[] wrongAnswers){
        this.question=question;
        this.correctAnswer=correctAnswer;
        this.wrongAnswers=wrongAnswers;
    }

    public boolean isCorrect(String answer){
        if (answer.equalsIgnoreCase(correctAnswer)){
            return true;
        }
        return false;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getWrongAnswers() {
        return wrongAnswers;
    }
}
