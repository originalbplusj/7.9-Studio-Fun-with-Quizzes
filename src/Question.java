import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question  {
    private String question;
    private String correctAnswer;
    private ArrayList<String> answerChoices;

    public Question(String question, String correctAnswer, ArrayList<String> answerChoices) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answerChoices = answerChoices;
    }

    // getters and setters

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void displayQuestion(){
        System.out.println(question);
        for(String answer: answerChoices) {
            System.out.println(answer);

        }
        System.out.println("\n");
    }

    public abstract String checkAnswer();
}
