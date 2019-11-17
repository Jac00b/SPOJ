package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class LiczbyPierwsze {
    Scanner sc = new Scanner(System.in);
    int liczba;
    int liczbaTestow = sc.nextInt();
    int [] tablica = new int[liczbaTestow];
    boolean pierwsza = true;


    public void pobranieLiczby() {

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = sc.nextInt();
            }

        for (int value : tablica) {
            if (value == 2) {
                System.out.println("TAK");
            }

            if (value < 2) {
                System.out.println("NIE");
            }

            for (int j = 2; j < value; j++) {
                if (value % j == 0) {
                    System.out.println("NIE");
                    break;
                }

                if (j == (value - 1)) {
                    System.out.println("TAK");
                }
            }
        }
    }


    public static void main(String[] args) {
    LiczbyPierwsze main = new LiczbyPierwsze();
    main.pobranieLiczby();
    }
}
