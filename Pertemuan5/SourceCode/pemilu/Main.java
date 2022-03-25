package pemilu;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PemilihanSuara p = new PemilihanSuara(8);
        p.showKandidat();
        System.out.println("Masukkan nama pilihan anda!! ");
        for (int i = 0; i < p.elemen; i++) {
            System.out.print("pemilih " + (i + 1) + " : ");
            p.pilihan[i] = sc.nextLine();
        }
        String menang = p.pemenang(p.pilihan, 0,7);
        System.out.println("Ketua BEM terpilih tahun 2022 adalah : " + menang);
    }
}