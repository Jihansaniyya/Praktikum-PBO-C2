/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam Subclass Anjing
 * Pembuat : Jihan SaniyyA Pudaliba / 24060123130101
 * Tanggal : Rabu, 7 Mei 2025
 */

public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}