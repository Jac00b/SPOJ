package pl.jakub.misiuk.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP0601A2 {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    List<Integer> list = new ArrayList<>();

    public void method() {

       for (int i = 0; counter<3; i++){
           int liczba = scanner.nextInt();
           list.add(liczba);
           if (i==0){
               continue;
           }
           if (list.get(i-1)!=42&&list.get(i)==42){
               counter++;
           }
       }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        PP0601A2 pp0601A2 = new PP0601A2();
        pp0601A2.method();
    }
}
