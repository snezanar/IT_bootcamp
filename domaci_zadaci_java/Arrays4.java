package PetaNedelja;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
//        elemenata.
//        B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.
//        Primer: Ulazni niz -> 1 0 2 25 0 6, Izlaz -> 1 2 25 6 0 0

        Scanner sc = new Scanner(System.in);
        int[] niz = {0, 1, 2, 0, 6, 0, 4, 3};
        for (int i = 0; i < niz.length; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == 0 && niz[j] != 0) {
                    int var = niz[i];
                    niz[i] = niz[j];
                    niz[j] = var;
                }
            }
            System.out.print(niz[i]);
            if (i != niz.length - 1) System.out.print(", ");
        }
    }
}
