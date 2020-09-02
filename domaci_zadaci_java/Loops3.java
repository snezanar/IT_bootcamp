package PetaNedelja;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadat je nenegativan broj. Sabirati njegove cifre sve dok rezultat ne bude samo jedna cifra. Ispisati je.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi broj :");
        int broj = sc.nextInt();

        int zbir = 0;

        while (broj > 0 || zbir > 9) {
            if (broj == 0) {
                broj = zbir;
                zbir = 0;
            }
            zbir = zbir + broj % 10;
            broj = broj / 10;

        }
        System.out.println("Rezultat je: " + zbir);
    }
}
