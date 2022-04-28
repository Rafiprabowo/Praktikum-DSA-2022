package praktikum1;
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n,pilih;
        System.out.print("Masukkan kapasitas queue:");
        n = scanner.nextInt();
        Queue Q = new Queue(n);

        do{
            menu();
            pilih = scanner.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru:");
                    int dataMasuk = scanner.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if(dataKeluar!=0){
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    System.out.print("Masukkan data yang ingin anda cari indexnya: ");
                    int searchData = scanner.nextInt();
                    int result = Q.peekPosition(searchData);
                    if(result!=-1){
                        System.out.println("Data ditemukan pada index ke-"+result);
                    }
                    break;
                case 6:
                    System.out.print("Masukkan index yang ingin anda cari: ");
                    int searchIndex = scanner.nextInt();
                    Q.peekAt(searchIndex);
                    break;
                case 7:
                    Q.clear();
                    break;
            }
        }while (pilih==1||pilih==2||pilih==3||pilih==4||pilih==5||pilih ==6||pilih == 7);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang di inginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek berdasarkan data");
        System.out.println("6. Peek berdasarkan urutan antrian");
        System.out.println("7. Clear");

    }
}
