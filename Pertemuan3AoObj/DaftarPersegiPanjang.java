package Pertemuan3AoObj;

public class DaftarPersegiPanjang {
    
    public PersegiPanjang PPterluas(PersegiPanjang[] arrayPersegiPanjang) {
        PersegiPanjang terluas = new PersegiPanjang();
        PersegiPanjang tersempit =new PersegiPanjang(1,2);
        terluas = arrayPersegiPanjang[0];
        for (int i=1; i<arrayPersegiPanjang.length; i++) {
            if (arrayPersegiPanjang[i].luas()>terluas.luas()) {
                terluas = arrayPersegiPanjang[i];
            }
        }
        return terluas;
    }
}


