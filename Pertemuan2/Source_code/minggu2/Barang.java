package entitas.barang.rafiprabowo;

public class Barang {
    String nama;
    String jenis;
    int stok;
    int hargaSatuan;

    Barang(String paramName, String paramJenis, int paramHargaSatuan, int paramStok) {
        nama = paramName;
        jenis = paramJenis;
        stok = paramStok;
        hargaSatuan = paramHargaSatuan;
    }

    Barang() {

    }

    void tampilanBarang() {
        System.out.println("Nama Barang = " + nama);
        System.out.println("Jenis Barang = " + jenis);
        System.out.println("Stok Barang = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n) {
        if (stok > 0)
            stok = stok + n;
    }

    void kurangiStok(int n) {
        stok = stok - n;
    }

    int hitungHargaTotal(int n) {
        System.out.printf("Harga %s buah adalah = ", n);
        return hargaSatuan * n;
    }
}
