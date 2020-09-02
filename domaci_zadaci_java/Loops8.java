package Metode;

import java.util.Scanner;

public class met7D {
    public static void main(String[] args) {
        //1.	Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
        //
        //0 - Izlaz iz programa
        //1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
        //2 - naplata racuna
        //
        //Ukoliko korisnik unese opciju 0 program se zavrsava.
        //Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda
        //         i ta cena se dodaje na racun u prodavnici.
        //Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
        //Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska,
        //          bez umanjenja racuna i da se ponovo ispise meni.
        //	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur
        //         i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.

        Scanner sc = new Scanner(System.in);
        int cena=0, novac, kusur, racun = 0;
        while (true) {
            System.out.println("unesi opciju: ");
            int opcija = sc.nextInt();
            switch (opcija) {
                case 0:
                    System.out.println("izlazite iz programa");
                    return;
                case 1:
                    System.out.println("unesi cenu proizvoda: ");
                    cena = sc.nextInt();
                    racun = racun + cena;
                    System.out.println("racun je: " + racun);
                    break;
                case 2:
                    if (cena == 0) System.out.println("prazna vam je korpa unesite opciju 1 za unos cene ili opciju 0 za izlaz iz programa");
                    else {
                        System.out.println("unesi kolicinu novca: ");
                        novac = sc.nextInt();
                        if (novac < racun) System.out.println("nedovoljno novca!");
                        else {
                            kusur = novac - racun;
                            System.out.println("preuzmite kusur: " + kusur);
                        }
                        racun = 0;
                    }
                    break;
                default:
                    System.out.println("unesi ponovo!");
            }
        }
    }
}
