package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class vezba4 { // Formirati niz B od negativnih elemenata niza A
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("unesi duz niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("elem niza su: ");
            niz[i] = sc.nextInt();
        }
        System.out.println("pocetni niz: " + Arrays.toString(niz));

        //broji koliko ima negativnih elem niza a= duzina niza b!!!!
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (niz[i] < 0) count++;
        }
        System.out.println("duzina novog niza: niz2[" + count + "]");

        //FORMIRANJE DRUGOG NIZA: najpre provera da li ima elementata!!!!
        int[] niz2 = new int[1];

        if (count > 0) {
            niz2 = new int[count]; //!!!!
            for (int i = 0; i < n; i++) {
                for (int j = i; j < count; j++) {
                    if (niz[i] < 0) niz2[j] = niz[i];
                }
            }
        } else {
            System.out.println("nema negativnih elemenata");
        }
        System.out.println("novi niz: " + Arrays.toString(niz2));
    }
}

