package PetaNedelja;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        A) Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.
//        B) Modifikovati program tako da se postupak pod a) ponavlja i to tako da pre svakog unosa korisnik vidi
//        pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
//        treba završiti program.
//        C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int cifra, brojac = 0;

        while (true) {
           brojac=0;
            System.out.println("unesi broj :");
            int broj = sc.nextInt();

            while (broj != 0) {
                cifra = broj % 10;
                if (cifra % 3 == 0) {
                    brojac++;
                }
                broj = broj / 10;
            }
            System.out.println("Broj cifara deljivih sa tri: " + brojac);
            System.out.println("Da li zeite da unesete jos jedan broj? ");

            String rec = sc2.nextLine().toLowerCase();
            if (rec.equals("da")) {
                System.out.println("unesi jos jedan broj: ");
                continue;
            } else {
                break;
            }
        }
    }
}


