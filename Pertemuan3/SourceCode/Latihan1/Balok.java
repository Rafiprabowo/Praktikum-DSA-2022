package latihan.data;

public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double p,double l,double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi =t;
    }

     public double hitungVolume(){
        return  this.panjang*this.lebar*this.tinggi;
    }
    public  double hitungLuas(){
        return 2*(this.panjang*this.lebar+this.panjang*this.tinggi+this.lebar*this.tinggi);
    }
}
