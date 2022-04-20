import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

    private static ArrayList<Question> quizQuestions;


    public Quiz() {
        // answer choice sets

        ArrayList<String> multipleChoicesQuestion1 = new ArrayList<>(Arrays.asList("1 - Matthieu van der Poel", "2 - Dylan van Baarle", "3 - Wout Van Aert", "4 - Filippo Ganna"));
        ArrayList<String> trueOrFalseChoicesQuestion2 = new ArrayList<>(Arrays.asList("1- True", "2 -False"));
        ArrayList<String> checkboxChoicesQuestion3 = new ArrayList<>(Arrays.asList("1 - Tom Boonen", "2 - Peter Sagan", "3 - George Hincapie", "4 - Greg Lemond", "5 - Fabian Cancellara", "6 - Tadej Pogacar"));

        //correct answer sets

        ArrayList<String> multipleChoiceCorrectAnswer = new ArrayList<>(Arrays.asList("2 - Dylan van Baarle"));
        ArrayList<String> trueOrFalseCorrectAnswer = new ArrayList<>(Arrays.asList("1 - True"));
        ArrayList<String> checkboxCorrectAnswer = new ArrayList<>(Arrays.asList("1 - Tom Boonen", "2 - Peter Sagan", "5 - Fabian Cancellara"));


        //questions

        String question1 = "Who won 2022 Paris-Roubaix?";
        String question2 = "The Paris-Roubaix race takes place in France.";
        String question3 = "Which of the following cyclists have won previous editions of Paris-Roubaix?";

        //create set of quiz questions

        quizQuestions = new ArrayList<>();
        quizQuestions.add(new Question(question1, multipleChoiceCorrectAnswer, multipleChoicesQuestion1));
        quizQuestions.add(new Question(question2, trueOrFalseCorrectAnswer, trueOrFalseChoicesQuestion2));
        quizQuestions.add(new Question(question3, checkboxCorrectAnswer, checkboxChoicesQuestion3));

    }


    public static void takeQuiz() {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < quizQuestions.size(); i++) {

            quizQuestions.get(i).displayQuestion();
            int inputAnswer = scan.nextInt();
            ArrayList<String> theAnswer = quizQuestions.get(i).getCorrectAnswer();
            ArrayList<String> choices = quizQuestions.get(i).getAnswerChoices();
            for (int k = 0; k < choices.size(); k++) {

                if (theAnswer.equals(choices.get(k))) {

                    int correctAnswerIndex = k;
                    //System.out.println(correctAnswerIndex);
                    if (inputAnswer == (correctAnswerIndex + 1)) {

                        score++;
                    }
                }
            }
        }
        scan.close();
        System.out.println("Your score is " + score);
    }
}









