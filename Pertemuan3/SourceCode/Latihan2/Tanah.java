public class Tanah {
    double panjang;
    double lebar;

    Tanah(double a,double b){
        this.panjang = a;
        this.lebar = b;
    }

    double hitungLuas(){
        return  panjang*lebar;
    }
}
