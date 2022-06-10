# Laporan Praktikum Pertemuan 13 Tree
## Nama  : Muhamad Rafi Prabowo
## Nim   : 2141720239
## Kelas : TI-1G
## Absen : 20

## **Praktikum 1**
**2.1.2 Pertanyaan**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif
   dilakukan dibanding binary tree biasa?
   
2. **Karena dalam binary search tree terdapat beberapa aturan yang menjadikan data dari sebuah tree lebih terstruktur, misalnya seperti aturan bahwa semua *left-child* harus lebih
   kecil dari pada *right-child* dan *parent-nya* sehingga itu akan memudahkan kita dalam melakukan traversal, sedangkan pada tree biasa kita akan lebih lama dalam melakukan traversal untuk mencari
   data yang akan di cari.**
3. Untuk apakah di class Node, kegunaan dari atribut left dan right?
4. 
   **atribut right dan left merupakan sebuah implementasi untuk menyimpan data child oleh suatu parent. misal kita memiliki sebuah node parent maka kita ingin
   parent memiliki child right maka disitulah atribut right kita gunakan untuk menyimpan data dari child.** 
5. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

   **atribut *root* berfungsi sebagai Node utama yang tidak boleh memiliki parent, sehingga sebuah root hanya memiliki child**
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

   **ketika objek tree pertama kali dibuat maka root nya akan bernilai null, kita baru mengisi root ketika memanggil fungsi add() yang pertama**
6. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa
   yang akan terjadi? 
   **data  baru itu akan menjadi *root*, karena pada hakikatnnya data pertama adalah parent dari semua *child* atau *node***
7. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah
   ini. Jelaskan secara detil untuk apa baris program tersebut?

   if(data<current.data){
   if(current.left!=null){
   current = current.left;
   }else{
   current.left = new Node(data);
   break;
   }

   **Program diatas bermaksud untuk menambahkan data, akan tetapi ketika data itu kurang dari node yang sekarang
   maka data akan ditambahkan pada *left-child* akan tetapi sebelum ditambahkan kita lakukan pengecekan terlebih dahulu
   apakah *left-child*nya bernilai null atau tidak, jika null maka akan dilakukan pengecekan mulai dari awal lagi
   jika *tidak-null* maka baru ditambahkan**

## **Praktikum 2**
**Pertanyaan Percobaan 2**
1.  Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

    **untuk menyimpan nilai data node dan IdxLast untuk menentukan index**

2. Apakah kegunaan dari method populateData()?

   **untuk melakukan menghitung data dan penyebaran datannya **

3. Apakah kegunaan dari method traverseInOrder()?

   **untuk menampilkan secara inOrder atau menampilkan seluruh data pada tree secara rekursif mulai dari sebelah kiri**

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?

   **left = 1 dan right 3**

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

   **untuk membatasi index agar hanya menjadi 6**

## **Tugas Praktikum**
1. Buat method di dalam class BinaryTree yang akan menambahkan node
   dengan cara rekursif.
```java   
public void addRekursif(Node node, int data) {
		if (isEmpty()) {
			root = new Node(data) ;
		} else {
			if (data < node.data) {
				if (node.left != null) {
					addRekursif(node.left, data) ;
				} else {
					node.left = new Node(data) ;
					return ;
				}
			} else if (data > node.data) {
				if (node.right != null) {
					addRekursif(node.right, data) ;
				} else {
					node.right = new Node(data) ;
					return ;
				}
			} else {
				return ;
			}
		}
	}
```
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil
   dan yang paling besar yang ada di dalam tree.
   ```java
public int Min(Node node) {
Node current = root;
while (current.left != null) {
current = current.left;
}
return current.data;
}

public  int Max(Node node) {
Node current = root;
while (current.right != null) {
current = current.right;
}
return current.data;
}
```
4. Buat method di dalam class BinaryTree untuk menampilkan data yang ada
   di leaf.
   ```java
    public void printLeaves(Node node) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            System.out.print(" " + node.data);
            total++;
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }
   ```
5. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah
   leaf yang ada di dalam tree.
   ```java
void findLeaf(Node node) {
if (node != null) {
findLeaf(node.left) ;
if (node.left == null && node.right == null) {
leaf ++ ;
System.out.print(node.data + " ") ;
}
findLeaf(node.right) ;
}
}
```
   
7. Modifikasi class BinaryTreeArray, dan tambahkan :
   • method add(int data) untuk memasukan data ke dalam tree
   • method traversePreOrder() dan traversePostOrder()





