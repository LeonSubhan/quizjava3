package quiz_java_03;

import java.util.Scanner;

public class two_numbers {
    public static void main(String[] args)
    {
        Scanner ali = new Scanner(System.in);

        int num1, num2;
        char choice;

        do
        {
            System.out.print("Enter the first number ");
            num1 = ali.nextInt();

            System.out.print("Enter the second number ");
            num2 = ali.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);

            System.out.print("Do you want to continue y/n? ");
            choice = ali.next().charAt(0);

            System.out.println();

        }while(choice=='y' || choice == 'Y');
    }

}
