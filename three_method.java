package quiz_java_03;

/*Write a Java program that has three methods:
getInputFromUser: this method takes 10 integer inputs from a user and store them in
an array and returns that array.calculateSum: this method calculate sum of all elements
of the array and return sum.calculateProduct: this method calculate product of all
elements of the array and return product.*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class three_method {
static int [] arrnum  = new int[10];
    public static void main(String[] args) {
        int [] a = getInputFromUser();
        System.out.println(Arrays.toString(a));
        System.out.println("Sum of the array element is :" +calculateSum());
        System.out.println("Product of the array elemenr is :" +calculateProduct());
    }
    public static int[] getInputFromUser(){
        Scanner ali = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < arrnum.length; i++) {
            arrnum [i] = ali.nextInt();
        }
        return arrnum;
    }

    public static int calculateSum(){
        int sum =0;
        for (int i = 0; i < arrnum.length; i++) {
        // sum = sum+arrnum[i];
        sum  += arrnum[i];
        }
        return sum;
    }
    public static int calculateProduct(){
        int product= 1;
        for (int i = 0; i < arrnum.length; i++) {
            product = product*arrnum[i];

        }
        return product;
    }
}
