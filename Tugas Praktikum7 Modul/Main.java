/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 30 April 2025
 */

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> kucing = new Datum<>(new Kucing("Gaza"));
        Datum<Anjing> anjing = new Datum<>(new Anjing("Ciko"));
        Datum<Burung> burung = new Datum<>(new Burung("Susi"));

        System.out.println("Simulasi Perilaku Anabul:");
        MetodeGenerik.tampilkanPerilaku(kucing);
        MetodeGenerik.tampilkanPerilaku(anjing);
        MetodeGenerik.tampilkanPerilaku(burung);
    }
}
