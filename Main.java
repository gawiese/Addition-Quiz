////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// CSC 160 Computer Science I

// September 12th, 2021

// Homework 3 - Programming Exercise 3.10 (page 110) Addition Quiz

////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers between 0-100
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        //2. If number1 < number2, swap number 1 with number 2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //3. Prompt the student to answer "What is number1 + number2?"
        System.out.print
                ("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //4. Grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 +
                    " should be " + (number1 + number2));
        }
    }
}

