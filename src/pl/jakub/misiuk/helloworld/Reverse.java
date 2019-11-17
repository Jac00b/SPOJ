package pl.jakub.misiuk.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {


    Scanner scanner = new Scanner(System.in);
    int wielkosc = 0;
    int[] tablica = new int[wielkosc];
    int wielkosc2 = -1;

    public void numbers() {

        while (scanner.hasNextInt()) {
            wielkosc2++;
            for (int i = wielkosc2; i < tablica.length; i++) {
                tablica[i] = scanner.nextInt();

                System.out.println(tablica[i]);

                for (int j = tablica.length - 1; j >= 0; j--) {
                    System.out.println(tablica[j]);

                }
            }
        }

    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        reverse.numbers();
    }
}
