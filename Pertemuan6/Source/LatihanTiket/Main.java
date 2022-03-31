package LatihanTiket;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---Program Sorting Harga Tiket ---");
        Tiket garuda = new Tiket("Garuda",1_500_000,"Surabaya","Jakarta");
        Tiket airAsia = new Tiket("Air-Asia",600_000,"Malang","Bali");
        Tiket lion = new Tiket("Lion",800_000,"Surabaya","Balikpapan");
        Tiket sriwijaya = new Tiket("Sriwijaya",750_000,"Malang","Jakarta");
        Tiket etihad = new Tiket("Etihad",15_000_000,"Jakarta","London");

        TiketService tiketService = new TiketService();
        tiketService.tambahTiket(garuda);
        tiketService.tambahTiket(airAsia);
        tiketService.tambahTiket(lion);
        tiketService.tambahTiket(sriwijaya);
        tiketService.tambahTiket(etihad);
        Scanner input = new Scanner(System.in);
        System.out.println("-----Program Pengurutan Tiket-----");
        System.out.println("Silahkan pilih urutan tiket");
        System.out.println("1. Dari termahal ke termurah");
        System.out.println("2. Dari termurah ke termahal");
        System.out.print("pilih : ");
        int pilih;
        pilih = input.nextInt();
        System.out.println("----------------------------");
        System.out.println("====Data tiket sebelum sorting====");
        System.out.println("----------------------------");
        tiketService.tampil();
        if(pilih==1){
            tiketService.bubblesort();
        }else {
            tiketService.selectionsort();
        }
        System.out.println("====Data tiket setelah sorting====");
        System.out.println("----------------------------");
        tiketService.tampil();

    }
}
