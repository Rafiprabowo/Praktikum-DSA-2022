package praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int jumlah;
        int pilih;
        int umur;
        double saldo;
        String norek;
        String nama;
        String alamat;
        Nasabah nasabah;
        Nasabah data;
        System.out.print("Masukkan kapasitas queue:");
        jumlah = scanner.nextInt();
        Queue antri = new Queue(jumlah);
        do {
            menu();
            pilih = scanner.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("No Rekening:");
                    norek = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Nama:");
                    nama = scanner.nextLine();
                    System.out.print("Alamat:");
                    alamat = scanner.nextLine();
                    System.out.print("Umur:");
                    umur = scanner.nextInt();
                    System.out.print("Saldo:");
                    saldo = scanner.nextDouble();
                    nasabah = new Nasabah(norek,nama,alamat,umur,saldo);
                    scanner.nextLine();
                    antri.enqueue(nasabah);
                    break;
                case 2:
                    data=antri.dequeue();
                    if(!"".equals(data.norek)&&!"".equals(data.nama)&&!"".equals(data.alamat)&&(data.umur)!=0 &&(data.saldo)!=0){
                        System.out.println("Antrian yang keluar: "+data.norek+" "+data.nama+" "+data.alamat+" "+data.umur+" "+data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
        }while (pilih==1||pilih==2||pilih==3||pilih==4);
    }
    public static void menu(){
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("--------------------------");
    }
}
