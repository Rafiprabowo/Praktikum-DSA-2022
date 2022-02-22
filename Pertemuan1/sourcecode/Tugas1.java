public class Tugas1 {
    public static void main(String[] args) {
        int tarif=4500;
        double diskon = 0.05;
        double pendapatanSmileLaundry=0;
        String [] customer = {"Ani","Budi","Bina","Cita"};
        int [] beratCucian = {4,15,6,11};
        double[] totalHarga = new double[4];
        System.out.println("---------------------------");
        for(int i=0;i< beratCucian.length;i++){
            if (beratCucian[i]>10){
                totalHarga[i] = (beratCucian[i]*tarif)-(beratCucian[i]*tarif*diskon);
            }else {
                totalHarga[i] = beratCucian[i]*tarif;
            }
            pendapatanSmileLaundry= pendapatanSmileLaundry+ totalHarga[i];
            System.out.printf("Berat cucian %s = %s",customer[i],beratCucian[i]);
            System.out.print("\n");
            System.out.printf("Total Bayar %s = %s",customer[i],totalHarga[i]);
            System.out.print("\n");
            System.out.println("---------------------------");
        }
        System.out.println("total pendapatan Smile laundry = "+pendapatanSmileLaundry);
    }
}
