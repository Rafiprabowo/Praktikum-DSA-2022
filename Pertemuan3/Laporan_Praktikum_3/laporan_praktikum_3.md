# Laporan Praktikum Algoritma  dan Struktur Data Array of Objek

### Nama: Muhamad Rafi Prabowo
### Kelas: TI-1G
### No absen : 20

## Jawaban Pertanyaan

# 3.2 Membuat Array dari Object, Mengisi dan Menampilkan

3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!

        
        dikarenakan objek maka harus setidaknya mempunyai satu atribut dan juga method, karena setiap objek itu memiliki suatu atribut dan juga apa yang bisa dilakukan (method). namun sebenarnya semuanya tidak harus, kembali ke kebutuhan masing-masing.

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :

        java ppArray[1] = new PersegiPanjang();

        sebenarnya ketika kita membuat array of objek dari persegi panjang, kita telah memanggil sebuah konstruktornya yaitu default constructor, karena default constructor tidak memiliki parameter maka kita tidak wajib memberikan nilai pada parameternya.

3. Apa yang dimaksud dengan kode berikut ini:
        
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

yaitu instansiasi dari array of objek persegi panjang dengan panjang 3

4. Apa yang dimaksud dengan kode berikut ini:

                ppArray[1] = new PersegiPanjang(); -> inisialisasi objek array of objek persegi panjang pada index ke 1
                ppArray[1].panjang = 80; -> meninisialisasi atribut panjang ppArray index ke 1 
                ppArray[1].lebar = 40; -> meninisialisasi atribut lebar ppArray index ke 1 

        

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?


        karena agar ketika dalam membuat class persegi panjang tidak jadi satu dengan program main, sehingga akan memudahkan kita dalam membuat programnya






# 3.3 Menerima Input Isian Array Menggunakan Looping

3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

        tetap dapat di implementasikan pada array 2 dimensi

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

        sebenarnya contohnya juga sama seperti array 2 dimensi pada umumnya akan tetapi hanya saja implementasinya kita menggunakan objek

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?

        Persegi []pgArray = new Persegi[100];
        pgArray[5].sisi = 20;

        program diatas akan terjadi error karena kita belum menginisialisasi objek dari pgArray[5] terlebih dahulu

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang dari array of objek : ");
        int a = input.nextInt();
        PersegiPanjang []ppArray = new PersegiPanjang[a];


5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

        tidak bisa karena dalam setiap objek inisialisasinya harus sendiri - sendiri


# 3.4 Operasi Matematika Atribut Object Array
3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

        di bahasa pemrograman java pembuatan constructor sendiri sebenarnya tidak ada batasanya akan tetapi setiap constructurnya itu sendiri harus berbeda parameternya dengan constructor yang lain.

        contoh penerapanya sendriri sebagai berikut :
        misalkan kita mempunyai sebuah objek Lingkaran
        yang mempunyai sebuah atribut :
        double jariJari;
        double phi;

        contoh constructornya
        1.
        Lingkaran(double r,double pi){
                jariJari = r;
                phi = pi;
        }
        constructor di atas dalam menginisialisasi objeknya akan memaksa untuk memberikan 2 buah nilai pada atributnya. akan tetapi kasus di atas kurang tepat karena phi nya berupa konstan sehingga kita perlu sebuah constructor yang hanya memaksa untuk menginisialisasi jariJarinya saja. 
        Maka kita akan membuat lagi constructor dengan 1 parameter 

        2. 
        Lingkaran(double r){
                jariJari = r;
        }


2. Jika diketahui terdapat class Segitiga seperti berikut ini:

        public class Segitiga{
                public int alas;
                public int tinggi;
        }
Tambahkan constructor pada class **Segitiga** tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi

        Segitiga(int a,int t){
                alas = a;
                tinggi = t;
        }


3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.

        public class Segitiga{
                public int alas;
                public int tinggi

                double hitungLuas(){
                        return (alas*tingg)/2;
                }
                double hitungKeliling(){

                        return alas+tinggi+Math.sqrt((alas*alas)+(tinggi*tinggi));  
                }
        }


4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10

        public static void main(String[]args){
        Segitiga[] segitiga = new Segitiga[4];
        segitiga[0]=new Segitiga(10,4);
        segitiga[1]=new Segitiga(20,10);
        segitiga[2]=new Segitiga(15,6);
        segitiga[3]=new Segitiga(25,10);
        }


5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
hitungLuas() dan hitungKeliling().

Output:

        Segitiga ke-0
        Luas = 20.0
        Keliling = 24.77032961426901
        Segitiga ke-1
        Luas = 100.0
        Keliling = 52.3606797749979
        Segitiga ke-2
        Luas = 45.0
        Keliling = 37.15549442140351
        Segitiga ke-3
        Luas = 125.0
        Keliling = 61.92582403567252

# 3.5 Latihan Praktikum
# 1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang
(minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut
yang ada menggunakan konstruktor semua bangun ruang tersebut.
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.

### Source code 3 bangun ruang

## Objek Balok
```java
public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double p,double l,double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi =t;
    }

     public double hitungVolume(){
        return  this.panjang*this.lebar*this.tinggi;
    }
    public  double hitungLuas(){
        return 2*(this.panjang*this.lebar+this.panjang*this.tinggi+this.lebar*this.tinggi);
    }
}
```

## Objek Kerucut


```java
public class Kerucut {
    public double phi = 3.14;
    public double jariJari;
    public double tinggi;
    public double garisPelukis;

    public Kerucut(double r,double t,double s){
        this.jariJari=r;
        this.tinggi=t;
        this.garisPelukis=s;
    }
    public double hitungVolume(){
        return  (phi*this.jariJari*this.jariJari*this.tinggi)/3;
    }
    public double hitungLuas(){
        return phi*jariJari*(jariJari+garisPelukis);
    }
}
```

## Objek Tabung

```java
public class Tabung {
    public double phi = 3.14;
    public double jariJari;
    public double tinggi;
    public Tabung(double r, double t){

        this.jariJari = r;
        this.tinggi = t;
    }
    public double hitungLuas(){
        return 2*phi*jariJari*(tinggi+jariJari);
    }
    public double hitungVolume(){
        return phi*jariJari*jariJari*tinggi;
    }
}
```

## Class Main

```java
public class BangunMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Balok[] balok = new Balok[1];
            Kerucut[] kerucut = new Kerucut[1];
            Tabung[] tabung = new Tabung[1];
            for (int i = 0; i < 1; i++) {
                System.out.print("Input Panjang balok : ");
                double p = sc.nextDouble();
                System.out.print("Input lebar balok : ");
                double l = sc.nextDouble();
                System.out.print("Input tinggi balok : ");
                double t = sc.nextDouble();
                balok[i] = new Balok(p, l, t);

                System.out.println();

                System.out.print("Input jari jari kerucut : ");
                double b = sc.nextDouble();
                System.out.print("Input tinggi kerucut : ");
                double c = sc.nextDouble();
                System.out.print("input garis pelukis : ");
                double d = sc.nextDouble();

                kerucut[i] = new Kerucut( b, c, d);

                System.out.println();
                System.out.print("Input jari jari tabung : ");
                double f = sc.nextDouble();
                System.out.print("Input tinggi tabung : ");
                double g = sc.nextDouble();
                tabung[i] = new Tabung(f, g);

                System.out.println("Balok memiliki Luas : " + balok[i].hitungLuas() + ", volume : " + balok[i].hitungVolume());
                System.out.println("Kerucut memiliki Luas : " + kerucut[i].hitungLuas() + ", volume : " + kerucut[i].hitungVolume());
                System.out.println("Tabung memiliki Luas : " + tabung[i].hitungLuas() + ", volume: " + tabung[i].hitungVolume());
            }
        }

    }

}
```

## Output Kode Program

<img src = "images/output_3bangun.png">


# 2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas
tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut 

## Source Code

## Class Tanah

```java
public class Tanah {
    double panjang;
    double lebar;

    Tanah(double a,double b){
        this.panjang = a;
        this.lebar = b;
    }

    double hitungLuas(){
        return  panjang*lebar;
    }
}
```

## Class Main
```java
import  java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Jumlah tanah : ");
        int jumlahTanah = sc.nextInt();
        Tanah[] tanah = new Tanah[jumlahTanah];
        double j=0;
        int z=0;
        for (int i = 0; i <tanah.length ; i++) {
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang : ");
            double a = sc.nextDouble();
            System.out.print("Lebar : ");
            double b =sc.nextDouble();
            tanah[i]=new Tanah(a,b);
            if(tanah[i].hitungLuas()>j){
                j=tanah[i].hitungLuas();
                z=i;
            }
        }
        System.out.printf("Tanah Terluas adalah Tanah %s\n",z+1);
    }

}
```
## Output Kode Program

<img src = "images/output_tanah.png">


3.Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. 

## Source Code

### Class Kampus


```java
public class Kampus {
    String nama;
    int nim;
    String jenisKelamin;
    double ipk;

    void showData(){
        System.out.println("nama : "+this.nama);
        System.out.println("nim : "+this.nim);
        System.out.println("Jenis Kelamin : "+this.jenisKelamin);
        System.out.println("Nilai IPK : "+this.ipk);
    }

}
```

## Class Main
```java
import java.util.Scanner;

public class KampusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kampus[] kampus = new Kampus[3];
        for (int i = 0; i < kampus.length ; i++) {
            kampus[i]=new Kampus();
            System.out.println("Masukkan data Mahasiswa ke "+(i+1));
            System.out.print("Masukkan nama : ");
            kampus[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            kampus[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            kampus[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            kampus[i].ipk=sc.nextDouble();
            sc.nextLine();
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < kampus.length; i++) {
            System.out.println("Data Mahasiswa ke "+(i+1));
            kampus[i].showData();
        }
    }
}
```

## Output Kode Program
## input data
<img src="images/output_mahasiswa1.png">

## tampil data

<img src="images/output_mahasiswa2.png">







