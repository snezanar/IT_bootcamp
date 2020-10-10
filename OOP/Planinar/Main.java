package Planinar;

public class Main {
    public static void main(String[] args) {

        Planinar p1=new KlasPl("Bora");
        Planinar p2=new KlasPl("Lija");
        Planina planina=new Planina("Avala",511);
        Alpinista a1=new Alpinista("Zoki");
        Alpinista a2=new Alpinista("Djura");
        a1.setPartner(a2);
        System.out.println(a1); //A_Zoki-9
        System.out.println(a2); //A_Djura-13
        System.out.println(a2.getPartner());
        planina.dodajPlaninara(p1);
        planina.dodajPlaninara(p2);
        planina.ispisPlaninara();  //[K_Bora-1  K_Lija-5 ]
        System.out.println(planina);//Avala(511.0)
        System.out.println(p1);//K_Bora-1
        System.out.println(a1.penjiSe(511));//penjanje je neuspesno
    }
}
