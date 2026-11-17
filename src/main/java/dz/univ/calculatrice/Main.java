package dz.univ.calculatrice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operation addition = new AddOperation();
        Operation subtraction = new SubtractOperation();

        int choice;

        do {
            System.out.println("\n===== CALCULATRICE =====");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Premier nombre : ");
                double first = scanner.nextDouble();

                System.out.print("Deuxième nombre : ");
                double second = scanner.nextDouble();

                double result = (choice == 1)
                        ? addition.execute(first, second)
                        : subtraction.execute(first, second);

                System.out.println("Résultat : " + result);

            } else if (choice == 0) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide !");
            }

        } while (choice != 0);

        scanner.close();
    }
}