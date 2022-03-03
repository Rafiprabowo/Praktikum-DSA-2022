package entitas.barang.rafiprabowo;

public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        if(b1.stok==0){
            System.out.println("Stok Kosong");
        }
        b1.nama = "Corsair";
        b1.jenis = "DDR 4";
        b1.stok = 0;
        b1.hargaSatuan = 25_000;
        b1.tampilanBarang();
        // b1.tambahStok(2);
        b1.kurangiStok(3);
        double a = b1.hitungHargaTotal(4);
        System.out.println(a);


        Barang b2 = new Barang("Logitech", "Wireless Mouse", 15_0000, 25 );
        b2.tampilanBarang();


    }

}
