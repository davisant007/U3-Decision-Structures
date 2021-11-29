import java.util.Random;
import javax.swing.*;



public class QuizGame(){
    JPanel panel;
    JButton createProblem, checkAnswer;
    JLabel showProblem , resultLabel;
    static int userAnswer, correctAnswer;
    static String displayProblems = "";
        }

    public static void main(String[] args) {
createProblems();
getUserAnswer();
checkAnswers();
int choice = Integer.parseInt(JOptionPane)

    }

    public static void checkAnswers() {
        if (userAnswer == correctAnswer)
            JOptionPane.showMessageDialog(null, "you are correct!");
    }else{
        JOptionPane.showMessageDialog(null, "incorrect answer, please try again");

    }
    public static void getUserAnswer(){
        userAnswer = input(displayProblems);
    }
    public static void adProblem(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 + number2;
        displayProblems - number1 + "" + number2;

    }

    //HELPER METHOD
    public static int random(){

        Random random =new Random();

        return random.nextInt(20)+1;

    }
public static void createProblem()
}
