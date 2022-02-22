import  java.util.Scanner;
public class Fungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]stockBunga={
                {10,5,15,7},
                {6,11,9,12},
                {2,10,10,5},
                {5,7,12,9},
        };
        String[] jenisBunga={"Aglonema","Keladi","Alocasia","Mawar"};
        String[] cabangToko={"Royal Garden 1","Royal Garden 2","Royal Garden 3","Royal Garden 4"};
        int toko1Index=0,toko2Index=1,toko3Index=2,toko4Index=3;
        boolean isValid = true;
        while(isValid) {
            System.out.println("Selamat Datang di Royal Bunga");
            System.out.println("Silahkan Pilih menu dari kami");
            System.out.println("1.Stock Bunga di Seluruh Cabang");
            System.out.println("2.Stock Bunga per cabang");
            System.out.println("x.Keluar");
            System.out.print("Masukkan pilihan :");
            String pilih = input.nextLine();
            if (pilih.equals("1")) {
                showStock(stockBunga, cabangToko, jenisBunga);
            } else if (pilih.equals("2")) {
                System.out.println("Cabang toko Kami");
                for (int i = 0; i < cabangToko.length; i++) {
                    System.out.println((i+1) + ". " + cabangToko[i]);
                }
                pilih = input.nextLine();
                if (pilih.equals("1")) {
                    showStockPerCabang(stockBunga, jenisBunga, toko1Index, cabangToko);
                } else if (pilih.equals("2")) {
                    showStockPerCabang(stockBunga, jenisBunga, toko2Index, cabangToko);
                } else if (pilih.equals("3")) {
                    showStockPerCabang(stockBunga, jenisBunga, toko3Index, cabangToko);
                } else if (pilih.equals("4")) {
                    showStockPerCabang(stockBunga, jenisBunga, toko4Index, cabangToko);
                } else {
                    isValid = false;
                }
            }else if(pilih.equals("x")){
                isValid=false;
            }
        }

    }
    static void showStock (int[][]stockBunga,String[]cabangToko,String[]jenisBunga){
        System.out.printf("%14s%10s%12s%12s%8s\n","",jenisBunga[0],jenisBunga[1],jenisBunga[2],jenisBunga[3]);
        for(int i=0;i<stockBunga.length;i++){
            System.out.printf("|%10s|",cabangToko[i]);
            for(int j = 0;j<stockBunga[0].length;j++){
                System.out.printf("%10s|",stockBunga[i][j]);
            }
            System.out.println("");
        }
        System.out.print("\n");
    }
    static void showStockPerCabang(int[][]stockBunga,String[] jenisBunga,int indexToko,String[] cabangToko){
        System.out.printf("%14s%12s%12s%12s%8s\n","",jenisBunga[0],jenisBunga[1],jenisBunga[2],jenisBunga[3]);
        System.out.printf("|%10s|",cabangToko[indexToko]);
        for(int i=0;i< jenisBunga.length;i++){
            System.out.printf("%10s|",stockBunga[indexToko][i]);
        }
        System.out.print("\n");
        System.out.print("\n");
    }
}
