package pl.jakub.misiuk.helloworld;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obzartuchy {


    Scanner scanner = new Scanner(System.in);
    int liczbaTestow;
    long liczbaObzartuchow;
    float liczbaCiastek;
    float seconds;
    float doba = 86400;
    float ciastkaWCiaguDoby1;
    float liczbaPudelek1;
    float sumaPudelek;
    float sumaPudelekTestowa;
    float liczbaPudelekTestowa;
    float ciastkaWCiaguDobyTestowa;
    List<Float> listaWynikow = new ArrayList<>();

    public void konkurs() {
        liczbaTestow = scanner.nextInt();
        for (int i = 0; i < liczbaTestow; i++) {
            liczbaObzartuchow = scanner.nextLong();
            liczbaCiastek = scanner.nextLong();
            for (int j = 0; j < liczbaObzartuchow; j++) {
                seconds = scanner.nextLong();
                ciastkaWCiaguDoby1 = doba / seconds;
                ciastkaWCiaguDobyTestowa = doba / seconds;
                ciastkaWCiaguDoby1 = Math.round(ciastkaWCiaguDoby1);
                if (ciastkaWCiaguDoby1 > ciastkaWCiaguDobyTestowa) {
                    ciastkaWCiaguDoby1 = ciastkaWCiaguDoby1 -1;
                }
                ciastkaWCiaguDobyTestowa = doba/seconds;
                liczbaPudelek1 = ciastkaWCiaguDoby1 / liczbaCiastek;
                listaWynikow.add(liczbaPudelek1);
            }
            for (Float aFloat : listaWynikow) {
                sumaPudelek = sumaPudelek + aFloat;
                sumaPudelekTestowa = sumaPudelekTestowa +aFloat;
            }

            sumaPudelek = Math.round(sumaPudelek);
            if (sumaPudelek < sumaPudelekTestowa) {
                sumaPudelek = sumaPudelek+1;
                System.out.println((long)sumaPudelek);
            } else if (sumaPudelek  == sumaPudelekTestowa || sumaPudelek> sumaPudelekTestowa) {
                System.out.println((long)sumaPudelek);
            }

           for (int s = 0; s < listaWynikow.size(); s++ ) {
               listaWynikow.clear();
           }
            liczbaObzartuchow = 0;
            liczbaCiastek = 0;
            seconds = 0;
          ciastkaWCiaguDoby1 = 0;
            liczbaPudelek1 = 0;
            sumaPudelek = 0;
            sumaPudelekTestowa = 0;
            liczbaPudelekTestowa = 0;
            ciastkaWCiaguDobyTestowa = 0;


        }
    }


    public static void main (String[]args){
        Obzartuchy obzartuchy = new Obzartuchy();
        obzartuchy.konkurs();
    }

}
