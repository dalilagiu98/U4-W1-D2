package exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static boolean stringEvenOdd( String word) {
        int length = word.length();
       return  length % 2 == 0;
    }

    public static boolean leapYear( int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a string");
        String input = scanner.nextLine();
        System.out.println("Is even? " + stringEvenOdd(input));

        System.out.println("Insert a year");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Is leap year? " + leapYear(year));
    }
}
