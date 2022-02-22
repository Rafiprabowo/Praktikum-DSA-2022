public class array {
    public static void main(String[] args) {
        int aglonemaPrice=75_000,keladiPrice=50_000,alocasiaPrice=60_000,mawarPrice=10_000;
        int [][]stockBunga={
                {10,5,15,7},
                {6,11,9,12},
                {2,10,10,5},
                {5,7,12,9},
        };
        String[] jenisBunga={"Aglonema","Keladi","Alocasia","Mawar"};
        String[] cabangToko={"RoyalGarden 1","Royal Garden 2","Royal Garden 3","Royal Garden 4"};

        int aglonemaSum=0,keladiSum=0,alocasiaSum=0,mawarSum=0, totalSum;
        int aglonemaINdex=0,keladiIndex=1,alocasiaIndex=2,mawarIndex=3;
        int royalGarden1=0;
        int totalPendapatan=0;
        for (int i = 0; i <4 ; i++) {
            aglonemaSum = aglonemaSum+ stockBunga[i][aglonemaINdex];
            keladiSum = keladiSum+stockBunga[i][keladiIndex];
            alocasiaSum = alocasiaSum+stockBunga[i][alocasiaIndex];
            mawarSum = mawarSum+stockBunga[i][mawarIndex];
        }
        totalSum=aglonemaSum+keladiSum+alocasiaSum+mawarSum;
        System.out.println("Stok Bunga di Semua cabang : "+totalSum);
        System.out.println("===========================");
        System.out.println("Stock Aglonema: "+aglonemaSum);
        System.out.println("Stock Keladi : "+keladiSum);
        System.out.println("Stcok Alocasia : "+alocasiaSum);
        System.out.println("Stock Mawar : "+mawarSum);
        System.out.println("===========================");
        aglonemaSum=stockBunga[royalGarden1][aglonemaINdex]-1;
        keladiSum=stockBunga[royalGarden1][keladiIndex]-=2;
        alocasiaSum=stockBunga[royalGarden1][alocasiaIndex]-=0;
        mawarSum=stockBunga[royalGarden1][mawarIndex]-=5;

        totalPendapatan=(alocasiaSum*alocasiaPrice)+(aglonemaSum*aglonemaPrice)+(keladiSum*keladiPrice)+(mawarSum*mawarPrice);
        System.out.printf("Total Pendapatan %s :"+totalPendapatan,cabangToko[0]);
        System.out.print("\n");
    }
}
