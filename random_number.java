package quiz_java_03;

import java.util.Random;
import java.util.Scanner;

public class random_number {

    public static void main(String[] args) {
        int ans, guess;
        int max = 100;
        Scanner ali = new Scanner(System.in);
        Random ran = new Random();
        boolean correct = false;
        ans = ran.nextInt(max)+1;
        while (!correct){
            System.out.println("Guess a number: ");
            guess = ali.nextInt();

            if (guess>ans){
                System.out.println("Too high, try again");
            } else if (guess<ans) {
                System.out.println("Too low, Try again.");
            } else {
                System.out.println("Your guess is right.");

                correct = true;
            }
        }
        System.exit(0);
    }
}
