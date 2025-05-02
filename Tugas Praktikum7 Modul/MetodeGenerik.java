/* Nama File : MetodeGenerik.java
 * Deskripsi : Berisi Metode Generik
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 30 April 2025
 */
public class MetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        datum.getIsi().gerak();
        datum.getIsi().suara();
    }
}
