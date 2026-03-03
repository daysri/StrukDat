package arrayobjects;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public PersegiPanjang() {
    }
    
    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public double luas() {
        return panjang * lebar;
    }
}


