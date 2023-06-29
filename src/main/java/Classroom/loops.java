package Classroom;

import java.util.Random;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //for; foreach; do while; while;

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        String[] fruits = {"apple", "banana", "kiwi", "oragne", "pear"};

        for (int i =0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        for (int i =0; i < fruits.length; i++) {
            if (fruits[i].equals("kiwi")) {
                System.out.println("I found Kiwi!");
                break;
            }
        }

        //enhanced for

        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }

        //print the number from 20 till 40

        for (int i = 20; i <= 40; i++) {
            System.out.println(i);
        }

        //calculate the sum of all even numbers between 1 and 100

        int sum = 0;
        for (int i =1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);


        // Print the multiplication of a given number

        //6

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }
        System.out.println();


        //Multiplication table till 10

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( i * j + " ");
            }
            System.out.println();
        }

        // WHILE LOOP

        int i = 10;
        while (i > 0) {
            System.out.println("Hello World!");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Hello World!");
            j++;
        }

        // do while

        int k =0;
        do {
            System.out.println("Hello World.");
            k++;
        } while (k < 10) ;

        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt (5);


 //       boolean IsGuessed = false;
 //       while (!IsGuessed) {
 //           System.out.println("Please enter number i guessed:");
 //           int inputNumber = myScanner.nextInt();
        //          if (randomNumber == inputNumber) {
  //              System.out.println("You guessed the number!!");
 //               IsGuessed = true;
   //         } else {
  //              System.out.println("Try again");
  //          }
   //     }

        // TO DO: Limit guess with 3 times;


        String name = "Elina";
        String reversed = "";
        for (int l = name.length() -1; l >= 0 ; l--) {
           reversed = reversed + name.charAt(l);
        }
        System.out.println(reversed);


    }
}
