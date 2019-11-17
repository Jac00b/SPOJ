package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class DodawaniePiotrusia {
    Scanner scanner = new Scanner(System.in);
    int liczbaTestow = scanner.nextInt();
    int sum = 0;
    int sum2 = 0;
    String liczba;
    public void peterSum() {
        for (int i = 0; i < liczbaTestow; i++) {
            liczba = scanner.nextLine();
            for (int j = 0; j < liczba.length(); j++) {
                int l, len = liczba.length();
                StringBuilder dest = new StringBuilder(len);
                for (l = (len - 1); i >= 0; i--){
                    dest.append(liczba.charAt(i));
                }
                String palindrm = dest.toString();
                if ( palindrm.equals(liczba)) {
                    System.out.println(liczba);
                }
                else {
                    System.out.println("gowno");

                }
            }

        }
    }

    public void polindrom() {


    }

    public static void main(String[] args) {
        DodawaniePiotrusia dodawanie = new DodawaniePiotrusia();
        dodawanie.peterSum();
    }
}
