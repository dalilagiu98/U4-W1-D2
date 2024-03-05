package exercise3;

import java.util.Objects;
import java.util.Scanner;
public class Exercise3 {

    private static String separaCaratteri(String inputStringa) {
        if (inputStringa.isEmpty()) {
            return ""; // Restituisce una stringa vuota se l'input è vuoto
        }

        // Utilizza String.join per separare i caratteri con virgola
        return String.join(",", inputStringa.split(""));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStringa = "";

        while (!inputStringa.equals(":q")) { //finchè l'input è diverso da zero
            System.out.println("Insert a string (or insert \":q\" to exit): ");
            inputStringa = scanner.nextLine();
            System.out.println("The characters of string are: " + separaCaratteri(inputStringa));

        }

        System.out.println("Uscita dal programma.");

        scanner.close();
    }

    }
