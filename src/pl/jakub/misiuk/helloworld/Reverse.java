package pl.jakub.misiuk.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {

    Scanner scanner = new Scanner(System.in);

    public void numbers() {

        String string = scanner.nextLine();

        String [] tab = string.split(" ");

        for (int i = tab.length-1; i>=0; i--){
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        reverse.numbers();
    }
}
