package E31253108.NabilaPutriAndiniMaharani; 
public class Segitiga extends BangunDatar  {
/*
Class Segitiga merupakan turunan dari BangunDatar
Memiliki atribut alas dan tinggi
*/
    double alas;
    double tinggi;
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    // menghitung luas segitiga
    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
    // contoh keliling segitiga sederhana
    @Override
    public double keliling() {
        return alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}
