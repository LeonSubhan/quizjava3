package quiz_java_03;

import java.util.Scanner;

public class switch_statement {

    static int firstNumber;
    static int secondNumber;
    static int result;
    static String operator;

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = ali.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = ali.nextInt();
        System.out.println("Enter your operator: ");
        operator = ali.next();

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("Your result is: " + result);
                break;
            default:
                System.out.println("invalid operation");
        }

    }
}
