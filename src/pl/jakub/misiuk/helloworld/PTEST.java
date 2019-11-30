package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class PTEST {
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    int suma;

    public void sum(){

        suma=a+b;

        System.out.println(suma);
    }

    public static void main(String[] args) {
        PTEST ptest = new PTEST();
        ptest.sum();
    }
}
