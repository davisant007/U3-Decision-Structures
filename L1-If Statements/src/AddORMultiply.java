import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */
    public static void main(String[] args) {

        double numInput1 = double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));
        double numInput2 = double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));
        double result = 0;

        if(numInput1 > numInput2){
           result = mutiply(numInput1, numInput1);

        }
        if(numInput1 <= numInput2){
            result = add(numInput1, numInput2)


        }

       JOptionPane.showMessageDialog(null, "the result is " + result);



        public static double add;(double num1 , double num2){

            return num1 + num2;

        }
        public static double mutiply(double num1, double num2){

        return num1 * num2;

    }



    }









}