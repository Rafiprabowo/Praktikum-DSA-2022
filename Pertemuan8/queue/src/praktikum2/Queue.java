package praktikum2;

public class Queue {
    Nasabah[] nasabah;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int size) {
        this.size = 0;max = size;nasabah = new Nasabah[size];front = -1; rear = -1;
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
    public void enqueue(Nasabah dt){
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
            this.nasabah[rear] = dt;
            size++;
        }
    }
    public Nasabah dequeue(){
        Nasabah nasabahDeque = new Nasabah();
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            nasabahDeque = nasabah[front];
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
        return nasabahDeque;
    }
    public void peek(){
        if(!isEmpty()){
            System.out.println("Element terdepan: "+nasabah[front].norek+" "+nasabah[front].nama+" "+nasabah[front].alamat+" "+nasabah[front].umur+" "+nasabah[front].saldo);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear){
                System.out.println(nasabah[i].norek+" "+nasabah[i].nama+" "+nasabah[i].alamat+" "+nasabah[i].umur+" "+nasabah[i].saldo);
                i = (i+1)% max;
            }
            System.out.println(nasabah[i].norek+" "+nasabah[i].nama+" "+nasabah[i].alamat+" "+nasabah[i].umur+" "+nasabah[i].saldo);
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


}
