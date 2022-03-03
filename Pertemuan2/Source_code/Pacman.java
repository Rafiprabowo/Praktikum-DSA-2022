package latihan1;

class Pacman {
    int x;
    int y;
    int width;
    int height;
    // Function

    void moveLeft(){
    if( x > 0 && x <=width ){
        x = x - 1;
        System.out.println("move left , x now = "+x);
    }else{
        System.out.println("status : false");
    }
    }
    void moveRight(){
        if( x > 0 && x <=width ){
            x = x + 1;
            System.out.println("move right , x now = "+x);
        }else {
            System.out.println("status : false");
        }
    }
    void moveUp(){
    if(y > 0 && y<= height){
        y=y-1;
        System.out.println("move up , y now = "+y);
    }else{
        System.out.println("status :false");
    }
    }
    void moveDown(){
        if(y > 0 && y<=height){
            y=y+1;
            System.out.println("move down , y now = "+y);
        }else{
            System.out.println("status : false");
        }
    }
    void printPosition(){
        System.out.println("Koordinat x = "+x);
        System.out.println("Koordinat y = "+y);
        System.out.println("Width area = "+width);
        System.out.println("Height area = "+height);
        System.out.println("Lebar Area = "+height*width);
        System.out.printf("Pacman Sekatang berada di koordinat x = %s dan koordinat y = %s\n",x,y);
    }
}
