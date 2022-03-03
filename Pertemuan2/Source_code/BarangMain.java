package latihan1;

public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.nama = "Red Dragon Keyboard";
        b1.hargaSatuan = 35_0000;
        b1.jumlah = 3;
        int a = b1.hargaTotal();
        int b = b1.hitungDiskon();
        int c = b1.hitungHargaBayar();
        System.out.printf("Nama Barang = %-10s\n",b1.nama);
        System.out.printf("Harga Satuan = %-10s\n",b1.hargaSatuan);
        System.out.printf("Jumlah Stok = %-10s \n",b1.jumlah);
        System.out.printf("Harga total = %-10s \n",a);
        System.out.printf("Diskon yang didapat sebesar = %-10s \n",b);
        System.out.printf("Harga Bayar = %-10s \n",c);
    }
}
