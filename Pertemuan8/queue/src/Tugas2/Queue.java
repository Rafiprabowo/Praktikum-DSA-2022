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
