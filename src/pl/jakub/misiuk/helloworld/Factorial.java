package pl.jakub.misiuk.helloworld;

public class Factorial {
int silnia;
    int factorial(int n) {
       if (n>1){
           return silnia=n*factorial(n-1);
       } return 1;
    }

    public void wyswietlenie(){
        System.out.println(silnia);
    }

    public static void main(String[] args) {
        Factorial factorial1 = new Factorial();
        System.out.println(factorial1.factorial(30));
    }
}
