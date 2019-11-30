package pl.jakub.misiuk.helloworld;

import java.util.Scanner;

public class PTROL {
    Scanner scanner = new Scanner(System.in);

    int numberOfTests = scanner.nextInt();

    public void ptrol(){
        for (int i = 0; i<numberOfTests;i++){
            int tabLenght=scanner.nextInt();
            int [] tab = new int[tabLenght];
            int [] outTab = new int[tabLenght];

            for (int l = 0; l<tabLenght;l++){
                tab[l]=scanner.nextInt();
            }

            for (int j=0; j<tab.length;j++){
                if (j==0){
                    outTab[tabLenght-1]=tab[j];
                    outTab[j]=tab[j+1];
                } else if (j==tabLenght-1) {
                    outTab[j]=tab[0];
                } else {
                    outTab[j] = tab[j + 1];
                }
            }

            for (int k=0;k<outTab.length;k++){

                System.out.print(outTab[k]+" ");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        PTROL ptrol = new PTROL();
        ptrol.ptrol();
    }
}
