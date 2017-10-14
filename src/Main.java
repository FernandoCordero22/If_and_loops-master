import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    // Look up the documentation for Scanner and what methods are available
    private Main() {
    Scanner input = new Scanner(System.in);
    int number1; // first number to compare
    int number2; // second number to compare
    }

    //TODO: Write a Java program to compare two numbers.
public void compare(int num1, int num2) {
        if (num1 > num2) {
            system.out.print("The bigger number is" + num1 + '\n');
        } else {
            system.out.print("The bigger number is" + num2 + '\n');
        }
}




    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".
    public void read (int num3) {
if (num3==0) {
    System.out.print("zero");
}else {
    if (num3>0) {
        System.out.print("positive");
    }else {
        System.out.print("negative");
    }
    }
}









            // TODO: Write a program in Java to display the first 10 natural numbers.
            public static void main(String[] args){
            {
                int i;
                System.out.println ("The first 10 natural numbers are:\n");
                for (i=1;i<=10;i++)
                {
                    System.out.println (i);
                }
                System.out.println ("\n");
            }
//https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-10.php

        // TODO: Write a Java program to reverse a string. Print the before and after.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >=0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
    }

//https://www.w3resource.com/java-exercises/basic/java-basic-exercise-37.php
}
