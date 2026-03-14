package E31253108.NabilaPutriAndiniMaharani;
public class Lingkaran extends BangunDatar {
/*
Class Lingkaran merupakan turunan dari BangunDatar
Memiliki atribut jari-jari (r)
*/
    double r;
    public Lingkaran(double r) {
        this.r = r;
    }
    // menghitung luas lingkaran
    @Override
    public double luas() {
        return Math.PI * r * r;
    }
    // menghitung keliling lingkaran
    @Override
    public double keliling() {
        return 2 * Math.PI * r;
    }
}
