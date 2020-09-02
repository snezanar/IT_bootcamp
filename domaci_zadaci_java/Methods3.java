package Metode;

import java.util.Scanner;

public class metNiz4 {
    // napisati program koji ce na stand izlazu ispisati proizvod elemenata niza koji su veci od svog indexa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi duzinu niza: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("pogresan unos");
            n = sc.nextInt();
        }
        int[] niz = new int[n];
        unosNiza(niz);
        proizvodClanova(niz); // void ->nema printa
    }

    public static void unosNiza(int[] niz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi el.niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
    }

    public static void proizvodClanova(int[] niz) {
        int proizvod = 1;
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > i) {
                proizvod *= niz[i];
                brojac++;
            }
        }
        if (brojac == 0) System.out.println("Nema clanova koji su veci od svog indexa");
        else System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je: " + proizvod);
    }

}
