/* Nama File : MGaris.java
 * Deskripsi : Main dalam class garis
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Garis G2 = G1;
        titik T2 = new titik(3,6);
        G1.printT1T2();
        G1.setT1Garis(new titik(2, 4));
        G1.printT1T2();
        G1.setT2Garis(T2);
        G1.printT1T2();
        System.out.println("Panjang garis : " + G1.getPanjangGaris());
        System.out.println("Gradien garis : " + G1.getGradien());
        System.out.println("Titik tengah garis : " + G1.getTitikTengah()); 
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); 
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); 
        G1.printRumus();
    }
}
