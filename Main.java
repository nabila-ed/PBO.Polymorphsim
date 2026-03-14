package E31253108.NabilaPutriAndiniMaharani;
public class Main {
/*
Class Main digunakan untuk menjalankan program
dan menampilkan hasil perhitungan
*/
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(6,8);

        System.out.println("=== PERSEGI ===");
        System.out.println("Luas : " + persegi.luas());
        System.out.println("Keliling : " + persegi.keliling());

        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas : " + lingkaran.luas());
        System.out.println("Keliling : " + lingkaran.keliling());

        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas : " + segitiga.luas());
        System.out.println("Keliling : " + segitiga.keliling());
    }
}  
