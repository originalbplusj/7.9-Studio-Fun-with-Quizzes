import java.util.ArrayList;

public class Checkbox extends Question{

    private ArrayList<String> correctAnswers;

    public Checkbox(String question, String correctAnswer, ArrayList<String> correctAnswers, ArrayList<String> answerChoices){
        super(question, correctAnswer, answerChoices);
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String checkAnswer() {
        return null;
    }
}
