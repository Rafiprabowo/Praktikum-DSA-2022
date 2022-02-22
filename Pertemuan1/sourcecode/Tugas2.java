import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance,velocity,second;
        System.out.println("Program Menghitung Kecepatan(m/s),Jarak(m),Waktu(s)");
        System.out.println("1. Jarak");
        System.out.println("2. Kecepatan");
        System.out.println("3. Waktu");
        System.out.print("Pilih : ");
        String pilih = input.nextLine();
        if (pilih.equals("1")){
            System.out.println("Program Menghitung Jarak");
            System.out.println("-------------------------");
            System.out.print("Input Kecepatan : ");
            velocity = input.nextDouble();
            System.out.print("Input Waktu : ");
            second = input.nextDouble();
            System.out.println("Nilai dari Jarak adalah : "+hitungJarak(velocity,second)+"/m");
        }else if(pilih.equals("2")){
            System.out.println("Program Menghitung Kecepatan");
            System.out.println("-------------------------");
            System.out.print("Input Jarak : ");
            distance = input.nextDouble();
            System.out.print("Input Waktu : ");
            second = input.nextDouble();
            System.out.println("Nilai dari Kecepatan adalah : "+hitungKecepatan(distance,second)+"m/s");
        }else if(pilih.equals("3")){
            System.out.println("Program Menghitung Waktu");
            System.out.println("-------------------------");
            System.out.print("Input Jarak : ");
            distance = input.nextDouble();
            System.out.print("Input Kecepatan : ");
            velocity = input.nextDouble();
            System.out.println("Nilai dari Waktu adalah : "+hitungWaktu(distance,velocity)+"/s");
        }

    }
    static double hitungJarak(double velocity,double second){
        return  velocity*second;
    }
    static double hitungKecepatan(double distance,double second){
        return  distance/second;
    }
    static double hitungWaktu(double distance,double velocity){
        return distance/velocity;
    }
}
