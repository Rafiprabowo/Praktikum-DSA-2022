package latihan1;

 class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;

    int hargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(){
        int diskon = hargaTotal();
        if(diskon>100_000){
            diskon = diskon*10/100;
        }else if(diskon >= 5_0000 && diskon <=10_0000 ){
            diskon = diskon*5/100;
        }else {
            diskon = 0;
        }
        return  diskon;
    }
    int hitungHargaBayar(){
        return (hargaTotal()-hitungDiskon());
    }

}
