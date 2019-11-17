package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class NWD {


    public static int NWD_1(int pierwsza, int druga) {

        while (pierwsza != druga) // dopóki dwie liczby nie są sobie równe
        {
            if (pierwsza > druga)  // sprawdzamy, która z nich jest większa
            {
                pierwsza = pierwsza - druga; // odejmujemy mniejszą liczbę
            }                               // od większej
            else {
                druga = druga - pierwsza;
            }
        }
        return pierwsza;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaTestow = scanner.nextInt();
        int a, b;
        for (int i = 0; i < liczbaTestow; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > 0 && b > 0) {
                System.out.println(NWD_1(a, b));
            } else {
                break;
            }
        }
    }
}
