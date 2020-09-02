package test;

import java.util.Scanner;

public class zadatak1a {
           //-Napisati program koji učitava jedan broj koji predstavlja koliko ljudi će nakon toga uneti podatke o broju dece koju imaju.
           //-Nakon što se broj ljudi učita, učitavaju se podaci o broju dece.
           //-Nakon toga, ispisati koji procenat ljudi ima više od dvoje dece.
           //
           //Na primer, ukoliko se unese broj 4, a zatim brojevi 1, 3, 2 i 4 program treba da ispiše poruku da 50% ljudi ima preko dvoje dece.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("uneti broj ljudi: ");
        int n = sc.nextInt();
        double zbir = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("uneti broj dece: ");
            int broj_dece = sc.nextInt();
            if (broj_dece > 2) {
                zbir = zbir + 1;
            }
            if (broj_dece < 0) {
                System.out.println("br dece mora biti >= 0");
                i--;
            }
        }
        System.out.println("broj ljudi koji imaju preko dvoje dece: " + zbir);
        System.out.println("procenat ljudi koji imaju preko dvoje dece: " + (zbir/n)*100);
    }
}
