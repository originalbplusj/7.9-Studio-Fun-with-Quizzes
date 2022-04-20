import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> correctAnswer;
    private ArrayList<String> answerChoices;


    // getters and setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ArrayList<String> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }


    public Question(String question, ArrayList<String> correctAnswer, ArrayList<String> answerChoices) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answerChoices = answerChoices;

    }
    public void displayQuestion() {
        System.out.println("Please enter the number of the correct answer: ");
        System.out.println(question);
        for (String answer : answerChoices) {
            System.out.println(answer);

        }
            System.out.println("\n");
        }


    }


