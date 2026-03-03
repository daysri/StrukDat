package Pertemuan3AoObj;

public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3]; 
        //Integer[] contohArray = new Integer[9];     
        ppArray[0] = new PersegiPanjang(100, 20);
        ppArray[1] = new PersegiPanjang(120, 70);
        ppArray[2] = new PersegiPanjang(80, 40);
        System.out.println("Luas Persegi Panjang");
        System.out.println("Persegi Panjang 1 : "+ppArray[0].luas());
        System.out.println("Persegi Panjang 2 : "+ppArray[1].luas());
        System.out.println("Persegi Panjang 3 : "+ppArray[2].luas());
        
        DaftarPersegiPanjang daftarPP = new DaftarPersegiPanjang();
        System.out.print("Persegi Panjang Terluas adalah ");
        System.out.println(daftarPP.PPterluas(ppArray).luas());
    }
}


