package pl.jakub.misiuk.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListyZadanieJAVASTART {
    Scanner scanner = new Scanner(System.in);
    public static final String EXIT = "exit";
    List<Integer> list = new ArrayList<>();


    public void fill(List<Integer> list) {
        System.out.println("Podaj kolejną liczbę lub wpisz /exit/ jeżeli chcesz zakończyć program");

        String input = scanner.nextLine();
        if (input.equals(ListyZadanieJAVASTART.EXIT))
            return;
        try {
            Integer number = Integer.valueOf(input);
            list.add(number);
        } catch (NumberFormatException e) {
            System.err.println("Liczba w niepoprawnym formacie");
        }
        fill(list);
    }

    public void writer(List<Integer> list){
        if (!list.isEmpty()){
            StringBuilder sb = new StringBuilder();
            int sum = 0;

            for (int b: list){
                sb.append(b);
                sb.append('+');
                sum+=b;
            }
            sb.replace(sb.length()-1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListyZadanieJAVASTART javastart = new ListyZadanieJAVASTART();
        javastart.fill(list);
        javastart.writer(list);
    }

}
