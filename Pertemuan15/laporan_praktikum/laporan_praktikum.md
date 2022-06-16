# Laporan Praktikum Pertemuan 13 Graph
## Nama  : Muhamad Rafi Prabowo
## Nim   : 2141720239
## Kelas : TI-1G
## Absen : 20

## **Praktikum 1**
2.1.3 Pertanyaan Percobaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah
   kegunaan algoritma-algoritma tersebut?
  **Algoritma Hopcroft-Karp (untuk penjodoham maksimum)**
   **Algoritma Hungaria (untuk penjodohan sempurna)**
   **Algoritma Brent (untuk menentukan adanya jalur pada graf)**
   **Algoritma Floyd (untuk menentukan adanya jalur pada graf)**
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan
   pembuatan variabel tersebut ?
   **list tersebut digunakan untuk menyimpan vertex beserta tujuannya, int source di analogikan domainnya dan destinationnya adalah tujuannya**
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
   jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
   **Karena addFirst disini hanya untuk mengenalkan siapa destinationnya**
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge
   pada graph ?
    **cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge
   pada graph yakni ketika i == destination maka akan di lihat source dari i atau dengan cara melakukan looping
   vertex. Jadi, jika vertex lebih besar dari (i) dan destination sama dengan (i) maka edge akan otomatis dihapus.**
5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan
   lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?
**Karena pada saat menghapus kita sebenarnnya menghapus indexnnya bukan valued destinationnya, oleh karena itu perlu dilakukan pencarian index dari destinationnya, barulah bisa dihapus atau mungkin karena pada saat kita menambahan datanya telah bergeser karena kita melakukan addFirst()**
## **Praktikum 2**
2.2.3 Pertanyaan Percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
  **perbedaan degree/derajat pada directed dan undirected graph yakni kalau pada directed degreeIn
   dengan DegreeOutnya berbeda namun pada undirected degreeIn dengan DegreeOut nya sama. Dpat di
   bedakan juga dari bobotnya juga karena pada directed graph degree mempengaruhi bobot pada edge antar
   vertex. Semisal pada A ke B bobotnya 5 , namun B ke A belum tentu memiliki bobot 5. Sedangkan undirected
   graph degree tidak mempengaruhi bobot**
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus
   ditambahkan dengan 1 pada indeks array berikut?
   <img src="img.png">
    **karena index di mulai dari 0, sehingga perlu di tambah dengan 1 agar index terakhirnya sama dengan vertexnnya**
3. Apakah kegunaan method getEdge() ?
**kegunaan method getEdge() yekni digunakan untuk menampilkan suatu lintasan yang di perlukan**
4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?
**Termasuk kedalam graph Directed**
5. Mengapa pada method main harus menggunakan try-catch Exception ?
**ketika kita melakukan pemanggilan funsgi yang berpotensi mengakibatkan error maka perlu dijalankan pada block try catch agar error nya bisa ditangkap**


