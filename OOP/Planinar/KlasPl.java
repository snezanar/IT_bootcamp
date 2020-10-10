package Planinar;
//Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
//neuspesno.Tekstualni oblik je K_ime-ident.

public class KlasPl extends Planinar {
    public KlasPl(String ime) {
        super(ime);
    }

    public boolean penjiSe(int visina) { //Penjanje moze biti uspesno ili neuspesno.
        if (visina > 2000) return false;
        else return true;
    }

    public String toString() {  //Tekstualni oblik je K_ime-ident.
        StringBuilder sb = new StringBuilder();
        //sb.append("K").append("_").append(ime).append("-").append(id);
        sb.append('K').append('_');
        sb.append(super.toString()); //dodaje ime-ident iz klase Planinar
        return sb.toString();
    }

}
