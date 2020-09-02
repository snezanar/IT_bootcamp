package Arrays;

import java.util.Scanner;

public class nizZadatak1 {
    public static void main(String[] args) {
//Napisati program koji od korisnika traži da unese neki datum
//i da ispiše koji je to po redu dan u godini.
        Scanner sc = new Scanner(System.in);

        int[] niz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("unesi dan: ");
        int dan = sc.nextInt();
        System.out.println("unesi mesec: ");
        int mesec = sc.nextInt();
        int brojac = 0;
        for (int i = 0; i < (mesec-1); i++) {
            brojac = brojac + niz[i];
        }
        brojac = brojac + dan;
        System.out.println("datum " + dan + "/" + mesec + " je " + brojac + " po redu dan u godini.");
    }
}
