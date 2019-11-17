package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class DwieLiczbySilni {

    Scanner scanner = new Scanner(System.in);

    private int liczbaTestow = scanner.nextInt();
    int liczba;
//    int[] tab = new int[liczbaTestow];


    public void wypisanieTestow() {
        for (int i = 0; i < liczbaTestow; i++) {
            liczba = scanner.nextInt();
            if (liczba > 9) {
                System.out.print(0 + " ");
                System.out.print(0);
                System.out.println("");

            } else {
                int s = 1;
                for (int j = 1; j <= liczba; j++) {
                    s = s * j;
                }
                System.out.print(s / 10 % 10 + " ");
                System.out.print(s % 10);
                System.out.println("");
            }

        }

    }

    public static void main(String[] args) {
DwieLiczbySilni dwieLiczbySilni = new DwieLiczbySilni();
dwieLiczbySilni.wypisanieTestow();
    }

}



