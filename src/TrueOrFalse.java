import java.util.ArrayList;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, String correctAnswer, ArrayList<String> answerChoices){
        super(question, correctAnswer, answerChoices);
    }

    @Override
    public String checkAnswer() {
        return null;
    }
}
