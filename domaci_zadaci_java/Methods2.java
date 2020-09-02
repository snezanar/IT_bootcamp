package Metode;

import java.util.Arrays;
import java.util.Scanner;

public class metNiz5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi duzinu niza1: ");
        int n1 = sc.nextInt();
        int[] niz1 = new int[n1];
        while (n1 <= 0) {
            System.out.println("pogresan unos");
            n1 = sc.nextInt();
        }
        System.out.println("unesi elemente niza1: ");
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = sc.nextInt();
        }
        System.out.println("elementi niza1 su: " + Arrays.toString(niz1));

        System.out.println("uensi duzinu niza2: ");
        int n2 = sc.nextInt();
        int[] niz2 = new int[n2];
        while (n1 <= 0) {
            System.out.println("pogresan unos");
            n1 = sc.nextInt();
        }
        System.out.println("umnesi elem niza2: ");
        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = sc.nextInt();
        }
        System.out.println("elem niza2 su: " + Arrays.toString(niz2));

        int[] niz3 = new int[0]; //!!!!!!!!!!!!!!!!!

        if (niz1.length > niz2.length) {
            niz3 = new int[n1];
        } else {
            niz3 = new int[n2];
        }

        for (int i = 0; i < niz1.length && i < niz2.length; i++) {
            niz3[i] = niz1[i] + niz2[i];
        }
        if(n1>n2) {
            for (int i = niz2.length; i < n1; i++) {
                niz3[i] = niz1[i];
            }
        }
        if(n2>n1) {
            for (int i = niz1.length; i < n2; i++) {
                niz3[i] = niz2[i];
            }
        }

        System.out.println("suma dva je: " + Arrays.toString(niz3));
    }
}