import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        QuizElement qE1 = new QuizElement("Hvor gammel er Malte?","23", new String[]{"21", "24", "22"});
        QuizElement qE2 = new QuizElement("Hvilken sport har Malte Eliteudøvet?","Svømning",new String[]{"Fodbold","Vægtløftning"});
        QuizElement qE3 = new QuizElement("Hvilken karakter mener Malte han bør få?","12",new String[]{"10","7","4","02","00","-3"});

        quiz.addQuizElement(qE1);
        quiz.addQuizElement(qE2);
        quiz.addQuizElement(qE3);

        quiz.playGame();
    }
}