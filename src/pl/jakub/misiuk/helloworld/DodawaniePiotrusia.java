package pl.jakub.misiuk.helloworld;

import java.util.*;

public class DodawaniePiotrusia {
    Scanner scanner = new Scanner(System.in);
    int liczbaTestow;
    String liczba;
    boolean isPalindrome=false;
    String odwroconaLiczba;
    String nowaLiczba;
    int suma;
    int licznik = 0;


    public void polindrom() {
        liczbaTestow = scanner.nextInt();
        scanner.nextLine();
        for (int i =0; i<liczbaTestow; i++) {
            liczba = scanner.nextLine();
            while (!isPalindrome) {
                isPalindrome(liczba);
                if (isPalindrome) {
                    System.out.print(liczba + " " + licznik);
                    System.out.println(" ");



                } else {
                    int l = Integer.parseInt(liczba);
                    reversedString(liczba);
                    int k = Integer.parseInt(odwroconaLiczba);
                    suma = l + k;
                    liczba=Integer.toString(suma);
                    licznik++;
                }

            }
            licznik=0;
            isPalindrome=false;

        }

    }

    public void reversedString(String reverse) {

        // getBytes() method to convert string
        // into bytes[].
        byte [] strAsByteArray = reverse.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];

        odwroconaLiczba = new String(result);
    }

    public void isPalindrome(String palindrom){
            for (int i = 0; i<palindrom.length(); i++) {
                if (palindrom.length()==1) {
                    isPalindrome=true;
                    break;
                } else if ((palindrom.charAt(0)==palindrom.charAt((palindrom.length()-1)))){
                    isPalindrome=true;
                    break;
                } else {
                    isPalindrome=false;
                }
            }
    }


    public static void main(String[] args) {
 DodawaniePiotrusia dodawaniePiotrusia = new DodawaniePiotrusia();
 dodawaniePiotrusia.polindrom();
    }
}
