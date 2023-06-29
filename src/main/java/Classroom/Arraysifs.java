package Classroom;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Arraysifs {

    public static void main(String[] args) {

        // array

        int[] numbers = {1, 5, 9, 10, 20, 30, 50};

        System.out.println(numbers[3]);

        //numbers 0=1, 1=5, 2=9, 3=10, 4=20, 5=30, 6=50..

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        //string array

        String[] names = {"John", "Andrew", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]); //print Angelica

        //Logical Statements

        //if - condition=boolean (true or false)

        if (5 < 10) {
            System.out.println("Yes, this is correct!");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Yes, this is Summer");
        }

        int x = 10;
        if (x > 0) {
            System.out.println("number is positive:" + x);
        }

        if (x < 0) {
            System.out.println(">Number is negative:" + x);
        }

// delitsa li chislo na 2

        if (x % 2 == 0) {
            System.out.println("Wunderbar");
        }

        if (x > 0) {
            System.out.println("number is positive:" + x);
        } else {
            System.out.println("number is negative:" + x);
        }

        if(x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // <= (less or equals)
        // >= (more or equals)
        // == (compare)

        if (x < 18) {
            System.out.println("Person is not eligible for voting");
        } else {
            System.out.println("Person can go vote");
        }

        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer!");
        } else if (isWinter) {
            System.out.println("Right, this is winter!");
        } else if (isAutumn) {
            System.out.println("Right, this is Autumn!");
        } else {
            System.out.println("Not sure, but it can be spring!");
        }

        int grade = 6;

        if(grade == 1) {
            System.out.println("fail");
        } else if(grade == 2) {
            System.out.println("fail");
        } else if (grade == 3) {
            System.out.println("fail");
        } else if (grade == 4) {
            System.out.println("almost satisfactory");
        } else if (grade == 5) {
            System.out.println("satisfactory");
        } else if (grade == 6) {
            System.out.println("almost good");
        } else if (grade == 7) {
            System.out.println("good");
        } else if (grade == 8) {
            System.out.println("very good");
        } else if (grade == 9) {
            System.out.println("excellent");
        } else if (grade == 10) {
            System.out.println("with distinction");
        } else {
            System.out.println("incorrect grade provided");
        }


        int angle = 90;

        if (angle > 0 && angle < 90) {
            System.out.println("acute ang.");
        } else if (angle == 90) {
            System.out.println("right ang.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("obtuse ang.");
        } else if (angle == 180) {
            System.out.println("straight");
        } else {
            System.out.println("provided angle is not supported");
        }



    }
}