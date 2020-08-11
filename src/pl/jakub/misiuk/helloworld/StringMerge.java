package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class StringMerge {

    String slowo;
    int liczbaTestow;
    Scanner scanner = new Scanner(System.in);
    int liczbaLiter;
    String newChain = "";
    String slowo1;
    String slowo2;
   boolean contains = false;




    public void stringMerge() {
        liczbaTestow = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < liczbaTestow; i++ ) {
            slowo = scanner.nextLine();
            for (int j = 0; j<slowo.length(); j++) {
                if (slowo.charAt(j)==' '){
                    break;
                } else {
                    liczbaLiter++;
                }
            }

            for (int z = 0; z<=slowo.length(); z++){

                if (slowo.charAt(z)==' ' && z != slowo.length()-1) {
                    contains = true;
                    break;
                }


            }

            if (contains){
                String[] parts = slowo.split(" ");
                slowo1 = parts[0];
                slowo2 = parts[1];

                for (int k = 0; k<liczbaLiter; k++){
                    if (k >= slowo2.length()){
                        break;
                    } else {
                       newChain=newChain + slowo1.charAt(k) + slowo2.charAt(k);
                    }
                }
                System.out.println(newChain);
                newChain = "";
            } else {
                System.out.println(slowo);
            }
            }

        }
    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        stringMerge.stringMerge();
    }
}
