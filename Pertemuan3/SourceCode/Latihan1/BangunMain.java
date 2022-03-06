package latihan.app;

import java.util.Scanner;
import latihan.data.Balok;
import latihan.data.Kerucut;
import latihan.data.Tabung;

public class BangunMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Balok[] balok = new Balok[1];
            Kerucut[] kerucut = new Kerucut[1];
            Tabung[] tabung = new Tabung[1];
            for (int i = 0; i < 1; i++) {
                System.out.println("Balok");
                System.out.println("-------------");
                System.out.print("Input Panjang balok : ");
                double p = sc.nextDouble();
                System.out.print("Input lebar balok : ");
                double l = sc.nextDouble();
                System.out.print("Input tinggi balok : ");
                double t = sc.nextDouble();
                balok[i] = new Balok(p, l, t);

                System.out.println();
                System.out.println("Kerucut");
                System.out.println("-------------");
                System.out.print("Input jari jari kerucut : ");
                double b = sc.nextDouble();
                System.out.print("Input tinggi kerucut : ");
                double c = sc.nextDouble();
                System.out.print("input garis pelukis : ");
                double d = sc.nextDouble();

                kerucut[i] = new Kerucut( b, c, d);
                System.out.println("Tabung");
                System.out.println("-------------");
                System.out.println();
                System.out.print("Input jari jari tabung : ");
                double f = sc.nextDouble();
                System.out.print("Input tinggi tabung : ");
                double g = sc.nextDouble();
                tabung[i] = new Tabung(f, g);
                System.out.println("----------------------------");

                System.out.println("Balok memiliki Luas : " + balok[i].hitungLuas() + ", volume : " + balok[i].hitungVolume());
                System.out.println("Kerucut memiliki Luas : " + kerucut[i].hitungLuas() + ", volume : " + kerucut[i].hitungVolume());
                System.out.println("Tabung memiliki Luas : " + tabung[i].hitungLuas() + ", volume: " + tabung[i].hitungVolume());
            }
        }


    }

}
