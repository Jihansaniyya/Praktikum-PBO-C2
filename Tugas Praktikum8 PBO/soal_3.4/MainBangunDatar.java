public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGenerik<Persegi> bdgPersegi = new BangunDatarGenerik<>();
        bdgPersegi.set(persegi);
        System.out.println(persegi);
        System.out.println("Luas: " + bdgPersegi.hitungLuas());
        System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
        System.out.println();
        
        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(6.5, 4.2);
        BangunDatarGenerik<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGenerik<>();
        bdgPersegiPanjang.set(persegiPanjang);
        System.out.println(persegiPanjang);
        System.out.println("Luas: " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Keliling: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println();
        
        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(5, 4, 3, 2.5);
        BangunDatarGenerik<Segitiga> bdgSegitiga = new BangunDatarGenerik<>();
        bdgSegitiga.set(segitiga);
        System.out.println(segitiga);
        System.out.println("Luas: " + bdgSegitiga.hitungLuas());
        System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
        System.out.println();
        
        // Membuat objek Segitiga sama sisi
        Segitiga segitigaSamaSisi = new Segitiga(6, 6, 6,6);
        BangunDatarGenerik<Segitiga> bdgSegitigaSamaSisi = new BangunDatarGenerik<>();
        bdgSegitigaSamaSisi.set(segitigaSamaSisi);
        System.out.println(segitigaSamaSisi);
        System.out.println("Luas: " + bdgSegitigaSamaSisi.hitungLuas());
        System.out.println("Keliling: " + bdgSegitigaSamaSisi.hitungKeliling());
    }
}