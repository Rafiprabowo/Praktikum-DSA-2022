package LatihanTiket;

public class TiketService {
    Tiket tiket[] = new Tiket[5];
    int idx;
    void tambahTiket(Tiket t){
        if(idx< tiket.length){
            tiket[idx] = t;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (Tiket t: tiket
             ) {
            System.out.println("Maskapai : "+t.maskapai);
            System.out.println("Harga : Rp."+t.harga);
            System.out.println("Asal : "+t.asal);
            System.out.println("Tujuan : "+t.tujuan);
            System.out.println("-----------------------");
        }
    }
    void bubblesort(){
        for (int i = 0; i < tiket.length-1; i++) {
            for (int j = 1; j < tiket.length-i ; j++) {
                if(tiket[j].harga>tiket[j-1].harga){
                    Tiket temp = tiket[j];
                    tiket[j] = tiket[j-1];
                    tiket[j-1] = temp;
                }
            }
        }
    }
    void selectionsort(){
        for (int i = 0; i < tiket.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < tiket.length-1; j++) {
                if(tiket[j].harga<tiket[idxMin].harga){
                    idxMin = j;
                }
                Tiket temp = tiket[idxMin];
                tiket[idxMin] = tiket[i];
                tiket[i] = temp;
            }
        }
    }
}
