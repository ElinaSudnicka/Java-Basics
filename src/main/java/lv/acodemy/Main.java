package lv.acodemy;

import javax.naming.Name;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // One-line Comment

        /*
        This is
        multi-line Comment
         */

        // Primitive data types
        // double floating numbers
        double pi = 3.14;
        System.out.println(pi);

        // float
        float v = 34f;
        float weight = 70.34f;
        System.out.println(weight);

        // int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        // char
        char myFirstNameChar = 'E';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 30;
        System.out.println(age);

        // boolean is, has
        boolean isSummer = true;
        System.out.println(isSummer);

        boolean isWinter = false;
        System.out.println(isWinter);

        // string
        String name = "Elina";
        String surname = "Sudnicka";
        System.out.println(name + surname);
        System.out.println(name + " " + surname);
        System.out.printf("My Name Is: %s. My surname is: %s\n", name, surname);
        System.out.printf("%s %s\n", name, surname);
        System.out.println(String.format("My Name Is: %s. My surname is: %s", name, surname));

        //Operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d - e;
        System.out.println(f);
        //10 + 5 - 9.61
        System.out.println(a + b - e);

        int x = 20;
        int y = 20 % 4;
        System.out.println(y);







    }
}