package arrayobjects;

public class DaftarPersegiPanjang {
    
    public PersegiPanjang PPterluas(PersegiPanjang[] arrayPersegiPanjang) {
        PersegiPanjang terluas = new PersegiPanjang();
        terluas = arrayPersegiPanjang[0];
        for (int i=1; i<arrayPersegiPanjang.length; i++) {
            if (arrayPersegiPanjang[i].luas()>terluas.luas()) {
                terluas = arrayPersegiPanjang[i];
            }
        }
        return terluas;
    }
}


