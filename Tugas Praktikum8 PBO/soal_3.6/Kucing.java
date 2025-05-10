/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam subclass Kucing
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu 7 Mei 2025
 */

public class Kucing extends Anabul{

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}