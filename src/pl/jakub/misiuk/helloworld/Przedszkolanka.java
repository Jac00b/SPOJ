package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class Przedszkolanka {
    Scanner scanner = new Scanner(System.in);
    int liczbatestow = scanner.nextInt();
    int x, y;
public int NWD (int pierwsza, int druga){
    while (pierwsza != druga)
    {
        if (pierwsza > druga)
        {
            pierwsza = pierwsza - druga;
        }
        else
        {
            druga = druga - pierwsza;
        }
    }
    return pierwsza;
}
    public void cukierki() {
        for (int i = 0; i < liczbatestow; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(((x * y) / NWD(x, y)));
        }
    }
    public static void main(String[] args) {
        Przedszkolanka przedszkolanka = new Przedszkolanka();
        przedszkolanka.cukierki();
    }
}
