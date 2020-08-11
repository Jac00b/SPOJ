package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class CALC {
    Scanner scanner = new Scanner(System.in);
    int number;
    int number2;
    int result;

    String operation;

    public void method(){
       do {
           String line = scanner.nextLine();

           String[] tab = line.split(" ");

           operation = tab[0];
           number = Integer.parseInt(tab[1]);
           number2 = Integer.parseInt(tab[2]);

           if (operation.equals("+")) {
               result = number + number2;
               System.out.println(result);
           }

           if (operation.equals("-")) {
               result = number - number2;
               System.out.println(result);
           }

           if (operation.equals("/")) {
               result = number / number2;
               System.out.println(result);
           }

           if (operation.equals("*")) {
               result = number * number2;
               System.out.println(result);
           }
           if (operation.equals("%")) {
               result = number % number2;
               System.out.println(result);
           }
       } while (scanner.hasNextLine());
    }


    public static void main(String[] args) {
CALC calc = new CALC();
calc.method();
    }

}
