package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class POL {
    Scanner scanner = new Scanner(System.in);
    int numberOfTests = scanner.nextInt();

    public void polowa() {

        for (int i = 0; i <= numberOfTests; i++) {

            String letters = scanner.nextLine();
            char[] tab = letters.toCharArray();

            for (int j = 0; j < tab.length / 2; j++) {
                System.out.print(tab[j]);
            }System.out.println("");
        }

    }

    public static void main(String[] args) {
        POL pol = new POL();
        pol.polowa();
    }
}
