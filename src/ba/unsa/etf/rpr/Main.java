package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int SumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unesi broj: ");
        Scanner ulaz = new Scanner(System.in);
        n=ulaz.nextInt();
        System.out.println("Brojevi od 1 do "+ n +" koji su djeljivi sa sumom svojih cifara su: ");
        for(int i = 1; i <= n; i++)
            if(i%SumaCifara(i)==0)
                System.out.println(i + " ");
    }
}
