import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nim,nimBaru,numberDay;
        System.out.print("Masukkan Nim : ");
        nim = input.nextInt();
        nimBaru = nim%100;
        if(nimBaru<10){
            nimBaru+=10;
        }
        System.out.println("n : "+nimBaru);
        for (int i = 1; i <= nimBaru; i++) {
            numberDay = i%7;
            if(numberDay==1){
                System.out.print("Senin ");
            }else if(numberDay==2){
                System.out.print("Selasa ");
            }else if(numberDay==3){
                System.out.print("Rabu ");
            }else if(numberDay==4){
                System.out.print("Kamis ");
            }else if(numberDay==5){
                System.out.print("Jumat ");
            }else if(numberDay==6){
                System.out.print("Saptu ");
            }else if(numberDay==0){
                System.out.print("Minggu ");
            }
        }
    }
}
