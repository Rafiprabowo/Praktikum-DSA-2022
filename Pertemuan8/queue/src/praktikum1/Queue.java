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
//                for (int i = front; i != rear; i = (i + 1 % max)) {
//                    if (this.data[i] == data) {
//                        index = i;
//                        break;
//                    }
//                }
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
