package test;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        //a) Napisati program koji ucitava testove napisane za jednu aplikaciju
        //   tako sto ucita naziv testa i rezultat njegovog izvrsavanja (da li je uspesno izvrsen ili ne).
        //b) Ucitavanje treba da se izvrsava sve dok korisnik za naziv testa ne ucita recenicu "Kraj testiranja".
        //c) Ucitavanje treba da se izvrsava sve dok ne unese prethodno opisanu recenicu ili dok ne unese 5 testova.
        //d) ispisati koliko ukupno ima testova.
        //e) ispisati koliko ima testova koji su pali.

        Scanner sc = new Scanner(System.in);

        int i, sum1 = 0, sum2 = 0;
        String test, yn;

        for (i = 0; i < 5; i++) {
            System.out.println("Unesite naziv testa: ");
            test = sc.nextLine();

            if (test.equals("Kraj testiranja")) break;

            System.out.println("Unesite da li je test uspešan DA ili NE: ");
            yn = sc.nextLine();

            while (!yn.equals("da") && !yn.equals("ne")) {
                System.out.println("Unesite da ili ne!");
                yn = sc.nextLine().toLowerCase();
            }
            if (yn.equals("da")) sum1++;
            if (yn.equals("ne")) sum2++;

        }
        System.out.println("Broj palih testova je: " + sum2);
        System.out.println("Ukupan broj testova je: " + (sum1 + sum2));
    }
}