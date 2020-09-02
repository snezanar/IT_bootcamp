package Metode;

import java.util.Scanner;

public class metNiz6DMarko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko ce vas niz imati elemenata");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Vas niz ne moze imati ovaj broj elemenata, unesite novi broj");
            n = sc.nextInt();
        }

        while (n == 1) {
            System.out.println(
                    "Nemoguce je proveriti da li je niz rastuci samo sa jednim elementom niza, unesite novi broj");
            n = sc.nextInt();
        }

        System.out.println("Upisite elemente svog niza");
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        if (dalIsteElemente(niz))
            System.out.println("Niz sadrzi sve iste elemente.");
        else if (dalRastuci(niz))
            System.out.println("Niz je rastuci.");
        else if (dalOpadajuci(niz))
            System.out.println("Niz je opadajuci.");
        else
            System.out.println("Niz nije ni opadajuci, ni rastuci.");
    }

    public static boolean dalRastuci(int[] niz) {

        for (int i = 0, j = i + 1; i < niz.length - 1; i++) {
            if (niz[i] > niz[i + 1])
                return false;
        }
        return true;
    }

    public static boolean dalOpadajuci(int[] niz) {
        for (int i = 0, j = i + 1; i < niz.length - 1; i++) {
            if (niz[i] < niz[i + 1])
                return false;
        }
        return true;
    }

    public static boolean dalIsteElemente(int[] niz) {
        for (int i = 0, j = i + 1; i < niz.length - 1; i++) {
            if (niz[i] != niz[i + 1])
                return false;
        }
        return true;
    }
}



