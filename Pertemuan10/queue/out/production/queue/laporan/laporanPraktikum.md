# Laporan Praktikum Pertemuan 10 Queue
## Nama  : Muhamad Rafi Prabowo
## Nim   : 2141720239
## Kelas : TI-1G
## Absen : 20

## **Subbab 7.2 Praktikum 1**
**8.2.3 Pertanyaan**
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
   bernilai 0?
**Karena front dan rear agar tidak ada data harus bernilai -1, jika bernilai 0 maka front dan rear ada di indeks 0 sedangkan size nya masih 0 atau tidak ada raung.**
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
   
      if (rear == max - 1) {
      rear = 0;
      }
**Jika rear ada di index terakhir dari array maka rear nya akan di set ke 0, jadi rear tidak akan melewati batas maksimal dari indeks array**
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!


4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
   melainkan int i=front?

**Ya karena bisa saja indeks terdepan bukan indeks 0, indeks terdepan adalah front jadi yang di tampilkan adalah dimulai dari indeks front**
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

```java
i = (i + 1) % max;
```
**Jadi ini iterasi untuk mengeprint data pada array. Ketika i sudah pada indeks paling terakhir dari array, i akan kembali ke 0. Misal max = 5, front = 3, rear = 2 maka akan seperti berikut :  
i = 3 -> print index 3  
i = (3+1) % max // i = 4 -> print index 4  
i = (4+1) % max // i = 0 -> print index 0 // karena 5 % 5 = 0  
i = (0+1) % max // i = 1 -> print index 1  
i = (1+1) % max // i = 2 -> print index 2  //menggunakan sout di luar while karena syarat while adalah i != rear  
dengan begitu sistem tidak akan mengeprint indeks diluar indeks array dan mengulang ke 0 jika i sudah pada indeks paling terakhir dari array**
6. Tunjukkan potongan kode program yang merupakan queue overflow!

```java
System.out.print("Masukkan data baru: ");
int dataMasuk = sc.nextInt();
Q.Enqueue(dataMasuk);
break;
```
dan
```java
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
   dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
   queue overflow dan queue underflow, program dihentikan!

**Method Dequeue tidak perlu modifikasi sedangkan method Enqueue saya modifikasi menjadi :**
```java
public int Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            return 0;
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return 1;
        }
    }
```  
   **8.3.3 Pertanyaan**
1Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
            && data.saldo != 0) {
        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
```  
**Ketika masuk ke case 2 dan data[front] mempunyai isi atau tidak sama dengan kosong, maka sistem akan mengprint data yang telah didequeue tersebut**

2.Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
   Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
   daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
   dapat dipanggil!

**Modifikasi dari class Queue :**
```java
public void peekRear() {
    if (!IsEmpty()) {
        System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
    } else {
        System.out.println("Queue masih kosong");
    }
}
```

**Modifikasi dari class QueueMain :**  
```java
public static void menu() {
    System.out.println("Pilih Menu:");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek Antrian Terdepan");
    System.out.println("4. Cek Semua Antrian");
    System.out.println("5. Cek Antrian Paling Belakang");
    System.out.println("-------------------");
}
```
```java
        case 5:
            antri.peekRear();
            break;
    }

} while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
```

## **TUGAS**

1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:
a. Method peekPosition(data: int) : void
Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan
data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa
b. Method peekAt(position: int) : void
Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut
dapat dipanggil!

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan
   KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus
   menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class
   diagram berikut:
   ````
   Mahasiswa
   nim: String
   nama: String
   absen: int
   ipk: double
   Mahasiswa(nim: String, nama: String, absen: int, ipk: double)
   Class diagram Queue digambarkan sebagai berikut:
   Queue
   antrian: Mahasiswa[]
   front: int
   
## Source Code Program

**Tugas 1**
**CLASS QUEUE**
```java


package praktikum1;

public class Queue {
int[]data;
int front;
int rear;
int size;
int max;

    public Queue(int size) {
        this.size = 0;max =size;data = new int[size];front =-1; rear = -1;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
    if(size == max){
        return true;
    }else {
        return false;
    }
    }
    public void enqueue(int dt){
        if(isFull()){
            System.out.println("Queue sudah penuh");
        }else {
            if(isEmpty()) {
                front = 0;
                rear = 0;
            }else {
                if(rear == max-1){
                    rear = 0;
                }else {
                    rear++;
                }
            }
            this.data[rear] = dt;
            size++;
        }
    }
    public int dequeue(){
        int dt = 0;
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else {
                if(front == max-1){
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }
    public void peek(){
    if(!isEmpty()){
        System.out.println("Element terdepan: "+data[front]);
    }else {
        System.out.println("Queue masih kosong");
    }
    }
    public void print(){
    if(isEmpty()){
        System.out.println("Queue masih kosong");
    }else {
        int i = front;
        while (i!=rear){
            System.out.print(data[i]+" ");
            i = (i+1)%max;
        }
        System.out.println(data[i]+" ");
        System.out.println("Jumlah elemen = "+size);
    }
    }
    public void clear(){
    if(!isEmpty()){
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil di kosongkan");
    }else {
        System.out.println("Queue masih kosong");
    }
    }
    public int peekPosition(int data) {
        int index = -1;
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
   for (int i = 0; i <size; i++) {
   if(this.data[i]==data){
   index = i;
   }
   }
   }
   return index;
   }
   public void  peekAt(int position){
   if (isEmpty() ) {
   System.out.println("Data masih kosong");
   }else {
   if(position<size){
   if (this.data[position] == 0) {
   System.out.println("Data pada index ke-" + position + " masih kosong");
   } else {
   System.out.println("Data pada index ke-" + position + " = " + this.data[position]);
   }
   }else {
   System.out.println("Data index ke-"+position+" 'Tidak Ditemukan'");
   }
   
           }
       }
   
   }
   ```
**CLASS QUEUE MAIN**
```java
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

```

**Tugas2**
**CLASS MAHASISWA**
```java
package Tugas2;

public class Mahasiswa {
    String nim;
    String name;
    int absen;
    double ipk;

    public Mahasiswa(String name, String nim, int absen, double ipk) {
        this.nim = nim;
        this.name = name;
        this.absen = absen;
        this.ipk = ipk;
    }
    Mahasiswa(){

    }
}

```
**CLASS QUEUE**
```java
package Tugas2;
public class Queue {

    Mahasiswa[] Q;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        Q = new Mahasiswa[max];
        size=0;
        front=rear=-1;
    }



    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian Terdepan = " + Q[front].name + " " + Q[front].nim + " " + Q[front].absen + " " + Q[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String ceknim) {
        if (!IsEmpty()) {
            for (int i = 0; i <size ; i++) {
                if(Q[i].nim .equals(ceknim)){
                    System.out.println("Data dengan Nim "+ceknim+" ditemukan pada urutan ke "+i+1);
                }
            }

        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian Terbelakang = " + Q[rear].name + " " + Q[rear].nim + " " + Q[rear].absen + " " + Q[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void printMahasiswa(int cariindex) {
        int idx = cariindex-1;
        if (!IsEmpty()) {
            if (Q[idx] == null) {
                System.out.println("Antrian ke-" + cariindex + " Masih Kosong");
            } else {
                System.out.println("Mahasiswa dengan  Antrian ke-" + cariindex + " adalah " + Q[idx].name);
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i].name + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(Q[i].name + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
}

```
**CLASS QUEUE MAIN**
```java
package Tugas2;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position berdasarkan NIM");
        System.out.println("7. Cari Mahasiswa berdasarkan Index");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue = ");
        int n = sc.nextInt();
        int pilih;
        Queue antri = new Queue(n);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nama = ");
                    String nama = sc.nextLine();
                    System.out.print("NIM = ");
                    String nim = sc.nextLine();
                    System.out.print("Nomer Absen = ");
                    int absen = sc.nextInt();
                    System.out.print("IPK = ");
                    double ipk = sc.nextDouble();
                    Mahasiswa p = new Mahasiswa(nama, nim, absen, ipk);
                    antri.Enqueue(p);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.name) && !"".equals(data.nim) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian Yang Keluar = " + data.name + " " + data.nim + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang Dicari = ");
                    String cari_Nim = sc.next();
                    antri.peekPosition(cari_Nim);
                    break;
                case 7:
                    System.out.print("Masukkan Index / Antrian yang ingin dicari datanya = ");
                    int cariindex = sc.nextInt();
                    antri.printMahasiswa(cariindex);
                    break;

            }
        } while (pilih > 0 || pilih < 8);
    }
}
```

**SOURCE CODE HASIL PROGRAM**

**TUGAS 1**





