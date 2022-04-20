import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    // answer sets

    public static List<String> multipleChoices = new ArrayList<>(Arrays.asList("1 - Matthieu van der Poel", "2 - Dylan van Baarle", "3 - Wout Van Aert", "4 - Filippo Ganna"));
    public static List<String> trueOrFalseChoices = new ArrayList<>(Arrays.asList("1- True", "2 -False"));
    public static List<String> checkboxChoices = new ArrayList<>(Arrays.asList("1 - Tom Boonen", "2 - Peter Sagan", "3 - George Hincapie", "4 - Greg Lemond", "5 - Fabian Cancellara", "6 - Tadej Pogacar"));
    public static List<String> checkboxAnswers = new ArrayList<>(Arrays.asList("1 - Tom Boonen", "2 - Peter Sagan", "3 - Fabian Cancellara"));

    //Add questions
    public static MultipleChoice multipleChoiceQuestion1 = new MultipleChoice("Who won 2022 Paris-Roubaix?", "Dylan van Baarle", (ArrayList<String>) multipleChoices);

    public static TrueOrFalse trueOrFalseQuestion2 = new TrueOrFalse("The Paris-Roubaix race takes place in France.", "True", (ArrayList<String>) trueOrFalseChoices);

    public static Checkbox checkboxQuestion3 = new Checkbox("Which of the following cyclists have won previous editions of Paris-Roubaix?", "", (ArrayList<String>) checkboxAnswers, (ArrayList<String>) checkboxChoices);






    Scanner input = new Scanner(System.in);
    int score = 0;


}
