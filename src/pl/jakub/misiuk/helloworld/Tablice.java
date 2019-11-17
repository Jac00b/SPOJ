package pl.jakub.misiuk.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tablice {
    Scanner scanner = new Scanner(System.in);
    int liczbaTestow = scanner.nextInt();
    int wielkosc=0;



    public void tablice (){

        for (int i = 0; i<liczbaTestow;i++){
            wielkosc=scanner.nextInt();
            int [] tab = new int[wielkosc];
            for (int j = 0; j<wielkosc;j++){
                tab[j]=scanner.nextInt();
            }

            for (int k = wielkosc-1;k>=0; k--){
                System.out.print(tab[k]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Tablice tablice = new Tablice();
        tablice.tablice();
    }
}
