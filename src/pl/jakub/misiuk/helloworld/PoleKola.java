package pl.jakub.misiuk.helloworld;

import java.util.Locale;
import java.util.Scanner;

public class PoleKola {
    Scanner scanner = new Scanner(System.in);
    double r, d;
    double pi = 3.141592654;
    double s;
    public void pole (){

            r = scanner.nextDouble();
            d = scanner.nextDouble();
            s = (r*r - (d*d/4))*pi;
            System.out.format(Locale.US,"%.2f", s);
    }
    public static void main(String[] args) {
        PoleKola pole = new PoleKola();
        pole.pole();
    }
}
