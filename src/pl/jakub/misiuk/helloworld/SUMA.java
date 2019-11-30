package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class SUMA {
    Scanner scanner = new Scanner(System.in);
    int number;
    int sum=0;

    public void sumNumbers(){

        do {
            number=scanner.nextInt();
            sum=sum+number;
            System.out.println(sum);
        } while (scanner.hasNextInt());
    }

    public static void main(String[] args) {
        SUMA suma = new SUMA();
        suma.sumNumbers();
    }
}
