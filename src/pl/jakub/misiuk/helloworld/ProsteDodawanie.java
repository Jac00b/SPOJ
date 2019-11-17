package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class ProsteDodawanie {
    Scanner scanner = new Scanner(System.in);
    int liczbaTestow = scanner.nextInt();

    int suma = 0;

    public void sumowanie(){
        for (int i =0; i<liczbaTestow; i++){
            int liczbaLiczbDoZsumowania = scanner.nextInt();
            for (int j = 0; j<liczbaLiczbDoZsumowania;j++){
                int liczba = scanner.nextInt();
                suma=suma+liczba;
            }
            System.out.println(suma);
            suma=0;
        }
    }

    public static void main(String[] args) {
        ProsteDodawanie prosteDodawanie = new ProsteDodawanie();
        prosteDodawanie.sumowanie();
    }
}
