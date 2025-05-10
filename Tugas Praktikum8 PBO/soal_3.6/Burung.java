/* Nama File :Burung.java
 * Deskripsi : Berisi atribut dan method dalam subclass Burung
 * Pembuat : Jihan Saniyya Pudaliba / 240601231430101
 * Tanggal : Rabua, 7 Mei 2025
 */

public class Burung extends Anabul{

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara terbang.");
    }
}
