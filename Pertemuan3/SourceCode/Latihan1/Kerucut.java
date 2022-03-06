package latihan.data;

public class Kerucut {
    public double phi = 3.14;
    public double jariJari;
    public double tinggi;
    public double garisPelukis;

    public Kerucut(double r,double t,double s){
        this.jariJari=r;
        this.tinggi=t;
        this.garisPelukis=s;
    }
    public double hitungVolume(){
        return  (phi*this.jariJari*this.jariJari*this.tinggi)/3;
    }
    public double hitungLuas(){
        return phi*jariJari*(jariJari+garisPelukis);
    }
}
