package exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a integer");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 0: {
                System.out.println("ZERO");
                break;
            }
            case 1: {
                System.out.println("ONE");
                break;
            }
            case 2: {
                System.out.println("TWO");
                break;
            }
            case 3: {
                System.out.println("THREE");
                break;
            }
            default: {
                System.out.println("ERROR! NUMBER IS NOT VALID");
            }
        }
    }
}
