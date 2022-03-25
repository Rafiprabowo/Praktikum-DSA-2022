package pemilu;

class PemilihanSuara {
    int elemen;
    String[] pilihan;
    String[] kandidat = {
            "Haris","Dian","Bisma","Rani"
    };
    String m = "-";
    int[] nsuara = new int[kandidat.length];

    PemilihanSuara(int np) {
        elemen = np;
        pilihan = new String[elemen];
    }

    void showKandidat() {
        System.out.println("===KANDIDAT===");
        for (int i = 0; i <kandidat.length ; i++) {
            System.out.println((i+1)+". "+kandidat[i]);
        }
    }

    String pemenang(String[] arr, int f, int l) {

        if (f == l) {

            if (arr[f].equalsIgnoreCase(kandidat[0])) {
                nsuara[0] += 1;
            }else if (arr[f].equalsIgnoreCase(kandidat[1])) {
                nsuara[1] += 1;
            }else if (arr[f].equalsIgnoreCase(kandidat[2])) {
                nsuara[2] += 1;
            }else if (arr[f].equalsIgnoreCase(kandidat[3])) {
                nsuara[3] += 1;
            }
        } else {

            int mid = (f + l) / 2;
            pemenang(arr, f, mid);
            pemenang(arr, mid+1, l);

            if (nsuara[0] > (arr.length/2)) {
                m = kandidat[0];
            } if (nsuara[1] > arr.length/2) {
                m = kandidat[1];
            } if (nsuara[2] > arr.length/2) {
                m = kandidat[2];
            } if (nsuara[3] > arr.length/2) {
                m = kandidat[3];
            }
        }
        return m;
    }
}
