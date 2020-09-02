package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class vezba5 {
    public static void main(String[] args) {
        //Zameniti mesta najvećem i najmanjem elementu niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi duz niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("elem niza su: ");
            niz[i] = sc.nextInt();
        }
        System.out.println("pocetni niz: " + Arrays.toString(niz));

        int min, max, imin, imax, temp;
        min = max = niz[0];//nadji max i min elementa u nizu i njihove INDEXE
        imin = imax = 0; //LOKACIJA MIN I MAX ELEMENTA NIZA
        for (int i = 0; i < n; i++) {
            if (niz[i] > max) {
                max = niz[i];
                imax = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (niz[i] < min) {
                min = niz[i];
                imin = i;
            }
        }
        //ZAMENA MESTA
        temp=niz[imax];
        niz[imax]=niz[imin];
        niz[imin]=temp;

        System.out.println("max je:" + max);
        System.out.println("min je:" + min);
        System.out.println("index max je:" + imax);
        System.out.println("index min je:" + imin);
        System.out.println("novi niz: " + Arrays.toString(niz));
    }
}
