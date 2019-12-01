package pl.jakub.misiuk.helloworld;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JSZYCER {
    String letters;
    Scanner scanner = new Scanner(System.in);
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public void cesar() {

        do {
            letters = scanner.nextLine();
            letters=letters.toUpperCase();
            char[] newLetters = letters.toCharArray();
            int temp = 0;
            char[] tab = new char[newLetters.length];
            for (int i = 0; i < newLetters.length; i++) {
                if (newLetters[i] == ' ') {
                    tab[i] = newLetters[i];
                    temp++;
                    continue;
                }
                for (int j = 0; j < alphabet.length; j++) {


                    if (alphabet[j] == newLetters[i] && j < alphabet.length - 3) {
                        tab[temp] = alphabet[j + 3];
                        temp++;
                    }
                    if ((j == alphabet.length - 3) && alphabet[j] == newLetters[i]) {
                        tab[temp] = alphabet[0];
                        temp++;
                    } else if ((j == alphabet.length - 2) && alphabet[j] == newLetters[i]) {
                        tab[temp] = alphabet[1];
                        temp++;
                    } else if ((j == alphabet.length - 1) && alphabet[j] == newLetters[i]) {
                        tab[temp] = alphabet[2];
                        temp++;
                    }
                }
            }

            for (int i = 0; i < newLetters.length; i++) {
                System.out.print(tab[i]);
            }
            System.out.println("");
        } while (scanner.hasNextLine());

    }

    public static void main(String[] args) {
        JSZYCER jszycer = new JSZYCER();
        jszycer.cesar();
    }
}
