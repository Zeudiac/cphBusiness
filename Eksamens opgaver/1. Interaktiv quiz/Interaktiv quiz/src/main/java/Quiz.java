import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<QuizElement> quizElements = new ArrayList<>();

    private String answer;

    int points = 0;
    public void addQuizElement(QuizElement quizElement){
        quizElements.add(quizElement);
    }

    public void askQuestion(QuizElement quizElement){
        System.out.println(quizElement.getQuestion());
        System.out.println(quizElement.getCorrectAnswer());
        for (String s: quizElement.getWrongAnswers()){
            System.out.println(s);
        }
        answer = receiveAnswer();
        if (quizElement.isCorrect(answer)){
            points++;
            System.out.println("Korrekt! +1 point - du har nu: "+points+" point");
        }
        else {
            System.out.println("Forkert :( du har: "+points+" point...");
        }
        System.out.println();

    }

    public void playGame(){
        for(QuizElement qE: quizElements){
            askQuestion(qE);
        }
    }

    public String receiveAnswer(){
        System.out.println("Please type your answer without errors:");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
