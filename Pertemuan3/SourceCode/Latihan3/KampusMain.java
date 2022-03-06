import java.util.Scanner;

public class KampusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kampus[] kampus = new Kampus[3];
        for (int i = 0; i < kampus.length ; i++) {
            kampus[i]=new Kampus();
            System.out.println("Masukkan data Mahasiswa ke "+(i+1));
            System.out.print("Masukkan nama : ");
            kampus[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            kampus[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            kampus[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            kampus[i].ipk=sc.nextDouble();
            sc.nextLine();
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < kampus.length; i++) {
            System.out.println("Data Mahasiswa ke "+(i+1));
            kampus[i].showData();
        }
    }
}
