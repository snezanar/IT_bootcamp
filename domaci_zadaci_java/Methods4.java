package Metode;

import java.util.Scanner;

public class met7DD {
    public static void main(String[] args) {
        //Napisati metodu koja prima broj N i K i vraća vrednost n! * k!
        //Gde je '!' oznaka za faktorijel a * oznaka za mnozenje.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi broj n: ");
        int n = sc.nextInt();


        System.out.println("unesi broj k: ");
        int k = sc.nextInt();
        System.out.println("faktorijel od " + n + " i "+k+ " je: " + faktorijel(n,k));

    }

    public static long faktorijel(int n, int k) {
        int fakN = 1;
        for (int i = 2; i <= n; i++) {

            fakN = fakN * i;
        }
        int fakK = 1;
        for (int i = 2; i <= k; i++) {

            fakK = fakK * i;
        }

        return fakN * fakK;

    }
}
