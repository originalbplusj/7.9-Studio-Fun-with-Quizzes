import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> answerChoices){
        super(question, correctAnswer, answerChoices);
    }

    @Override
    public String checkAnswer() {
        //if(getCorrectAnswer().equals(input)){
            //return true;
        //} else
            return null;
    }
}
