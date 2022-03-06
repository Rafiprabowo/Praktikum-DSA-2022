package latihan.data;

public class Tabung {
    public double phi = 3.14;
    public double jariJari;
    public double tinggi;
    public Tabung(double r, double t){

        this.jariJari = r;
        this.tinggi = t;
    }
    public double hitungLuas(){
        return 2*phi*jariJari*(tinggi+jariJari);
    }
    public double hitungVolume(){
        return phi*jariJari*jariJari*tinggi;
    }
}
