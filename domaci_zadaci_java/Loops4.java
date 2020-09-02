package PetaNedelja;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Za zadati ceo broj odrediti da li je on stepen broja 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi broj :");
        int broj = sc.nextInt();
        double baza = 3;

        while (baza <= broj) {
            if (baza == broj) {
                System.out.println("uneti broj jeste stepen broja 3");
                break;
            } else {
                baza = baza * 3;
            }
            if (baza > broj) {
                System.out.println("uneti broj nije stepen broja 3");
            }
        }
    }
}


