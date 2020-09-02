package Basic;

import java.util.Scanner;

public class Switch5 {
    //program koji broji dane za tri uneta meseca
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi mesec: ");
        int zbir = 0;
        int br_dana = 0;
        for (int i = 0; i <= 2; i++) {
            String mesec = sc.nextLine();
            switch (mesec) {
                case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                    br_dana = 31;
                    System.out.println("odabrani mesec ima " + br_dana + ".");
                    break;
                case "april", "jun", "septembar", "novembar":
                    br_dana = 30;
                    System.out.println("odabrani mesec ima " + br_dana + ".");
                    break;
                case "februar":
                    br_dana = 28;
                    System.out.println("odabrani mesec ima " + br_dana + ".");
                    break;
                default:
                    System.out.println("pogresan unos");
            }
            zbir = zbir + br_dana;
        }
        System.out.println("ukupan br dana je " + zbir);
    }
}

