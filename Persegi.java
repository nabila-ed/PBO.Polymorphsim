package E31253108.NabilaPutriAndiniMaharani;
public class Persegi extends BangunDatar { 
/*
Class Persegi merupakan turunan dari BangunDatar
Memiliki atribut sisi
*/
    double sisi;
     public Persegi(double sisi) {
        this.sisi = sisi;
    }
    // menghitung luas persegi
    @Override
    public double luas() {
        return sisi * sisi;
    }
    // menghitung keliling persegi
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
