package Exerice1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Entrer un nombre entier positif: ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("Erreur: Le nombre doit être positif.");
            }
        } while (N <= 0);

        int[] nombres = new int[N];
        int somme = 0;

        System.out.println("Entrez " + N + " nombres :");
        for (int i = 0; i < N; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            nombres[i] = scanner.nextInt();
            somme += nombres[i];
        }

        System.out.print("Tableau des " + N + " nombres : ");
        for (int i = 0; i < N; i++) {
            System.out.print(nombres[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nLa somme des éléments du tableau est : " + somme);
        scanner.close();
    }
}
