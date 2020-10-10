package Planinar;

//Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
//planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
//partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
//partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.
//*Napomena: Ukoliko je Alpinista A1 partner Alpinisti A2 onda je i Alpinista A2 partner Alpinisti A1.

public class Alpinista extends Planinar {

    private Alpinista partner;

    public Alpinista(String ime) { // CONTSRUCTOR
        super(ime);
    }
    //GET - partner
    public Alpinista getPartner() {
        return partner;
    }
    //SET - partner
    public void setPartner(Alpinista buduciPartner) { // partner = buduciPartner;
        if (this.partner == null && buduciPartner.partner == null) {
            this.partner = buduciPartner;
            buduciPartner.partner = this;
        }
        else System.out.println("Ne moze se postaviti partner!");
    }
    public void ukloniPartnera() {
        if (partner != null) {
            partner.partner = null;
            partner = null;
        }
    }

    public boolean penjiSe(int visina) { //Penjanje moze biti uspesno ili neuspesno.
        if (visina < 3000 && partner!=null) {
            System.out.println("penjanje je neuspesno");
            return false;
        } else return true;
    }

    public String toString() {  //Tekstualni opis je A_ime-ident.
//        StringBuilder sb = new StringBuilder();
//        sb.append('A').append('_');
//        sb.append(super.toString());   OR
        return "A_"+super.toString();
    }
}
