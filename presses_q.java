package quiz_java_03;


import java.util.Scanner;

public class presses_q {

    public static void main(String[] args) {

        String choice = "";

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        Scanner ali = new Scanner(System.in);

        while (!choice.equals("q")) {
            System.out.println("Enter a number or q to quit");
            choice = ali.next();

            if (!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                num1 = num1 + number;
                num2 = num2 * number;
                num3++;
            }
        }

        System.out.println("Product is: " + num2 + "\nAverage is: " + ((float) num1 / num3));

    }
}



