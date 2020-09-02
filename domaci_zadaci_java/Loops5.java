package PetaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Zadati su jedan niz celih brojeva, i jedan broj koji predstavlja ‘metu’. Napisati program koji vraća indekse dva
//        broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
//        Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi duzinu niza: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("pogresan unos");
            n = sc.nextInt();
        }
        int niz[] = new int[n];
        System.out.println("unesi elemente niza: ");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }
        System.out.println("elem niza su: " + Arrays.toString(niz));
        System.out.println("unesi metu: ");
        int meta = sc.nextInt();
        boolean vanDometa = true;
        int zbir;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                zbir = niz[i] + niz[j];
                if (zbir == meta) {
                    vanDometa=false;
                    System.out.println("indeksi niza ciji zbir daje zadatu metu: " + niz[i] + " i " + niz[j]);
                    break;
                }
            }
        }
        if (vanDometa) {
            System.out.println("van dometa");
        }
    }
}