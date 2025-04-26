/* Nama File :Anjing.java
 * Deskripsi :Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 23 April 2025
 */

public class Anjing extends Anabul {

    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan melata");
    }

    public void suara(){
        System.out.println(nama + " bunyinay: GUK GUK GUK");
    }
    
}
