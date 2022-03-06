import  java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Jumlah tanah : ");
        int jumlahTanah = sc.nextInt();
        Tanah[] tanah = new Tanah[jumlahTanah];
        double j=0;
        int z=0;
        for (int i = 0; i <tanah.length ; i++) {
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang : ");
            double a = sc.nextDouble();
            System.out.print("Lebar : ");
            double b =sc.nextDouble();
            tanah[i]=new Tanah(a,b);
            if(tanah[i].hitungLuas()>j){
                j=tanah[i].hitungLuas();
                z=i;
            }
        }
        System.out.printf("Tanah Terluas adalah Tanah %s\n",z+1);
    }

}


