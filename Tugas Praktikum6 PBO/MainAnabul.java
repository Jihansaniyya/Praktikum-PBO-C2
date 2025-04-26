/* Nama File : MainAnabul.java
 * Deskripsi : Berisi Main dalam class Main
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 23 April 2025
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Gaza");
        Anabul anjing = new Anjing("Ciko");
        Anabul burung = new Burung("Ons");

        Anabul[] anabulArray = {kucing, anjing, burung};

        for (Anabul a : anabulArray){
            a.gerak();
            a.suara();
            System.out.println();
        }
    }
    
}
