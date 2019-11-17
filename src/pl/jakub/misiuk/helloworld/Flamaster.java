package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class Flamaster {
    Scanner scanner = new Scanner(System.in);
    int liczbaTestow = scanner.nextInt();

    public void skracanie() {
        for (int i = 0; i <= liczbaTestow; i++) {
            String napis = scanner.nextLine();
            System.out.println("");
            int liczba = 1;
            for (int j = 0; j <= napis.length(); j++) {
                if (j + 1 < napis.length()) {
                    if (napis.charAt(j) == napis.charAt(j + 1)) {
                        liczba++;
                    } else {
                        if (liczba == 1) {
                            System.out.print(napis.charAt(j));
                        } else if (liczba == 2) {
                            System.out.print(napis.charAt(j));
                            System.out.print(napis.charAt(j - 1));
                            liczba = 1;
                        } else if (liczba >= 3) {
                            System.out.print(napis.charAt(j)+""+liczba);
                            liczba = 1;
                        }
                    }
                } else if (j + 1 == napis.length()) {
                    if (liczba == 1) {
                        System.out.print(napis.charAt(j));
                    } else if (liczba == 2) {
                        System.out.print(napis.charAt(j));
                        System.out.print(napis.charAt(j - 1));
                        liczba = 1;
                    } else if (liczba >= 3) {
                        System.out.print(napis.charAt(j)+""+liczba);
                        liczba = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Flamaster flamaster = new Flamaster();
        flamaster.skracanie();
    }
}