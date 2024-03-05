package exercise4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a integer");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Countdown from " + number + " to 0: ");
        for( int i = number; i>= 0; i--){
            System.out.println(i);
        }
    }
}
