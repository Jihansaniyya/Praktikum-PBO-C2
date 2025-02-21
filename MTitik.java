/* Nama File : Mtitik.java
 * Deskripsi : Main class titik
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */

public class MTitik {
    public static void main (String[] args) {
        System.out.println("Objek titik");
        // Titik T1
        System.out.println("Titik T1: ");
        titik T1 = new titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Berada di kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());


        // Titik T2
        System.out.println("\n");
        System.out.println("titik T2: ");
        titik T2 = new titik();
        T2.setAbsis(-10);
        T2.setOrdinat(10);
        T2.printTitik();
        T2.geser(5, 5);
        T2.printTitik();
        System.out.println("Berada di kuadran: " + T2.getKuadran());
        System.out.println("Jarak ke pusat: " + T2.getJarakPusat());

        // Jarak antara T1 dan T2
        System.out.println("\n");
        System.out.println("Jarak antara T1 dan T2");
        double jarakT1T2 = T1.getJarak(T2);
        System.out.println("Jarak antara T1 dan T2: " + jarakT1T2);

        // Titik T3
        System.out.println("\n");
        System.out.println("titik T3: ");
        titik T3 = new titik(-5, -3);
        T3.printTitik();
        T3.geser(3, -5);
        T3.printTitik();
        System.out.println("Berada di kuadran: " + T3.getKuadran());
        System.out.println("Jarak ke pusat: " + T3.getJarakPusat());

        // Titik T4
        System.out.println("\n");
        System.out.println("Titik T4: ");
        titik T4 = new titik(8, -1);
        T4.printTitik();
        System.out.println("Berada di kuadran: " + T4.getKuadran());
        System.out.println("Jarak ke pusat: " + T4.getJarakPusat());
        T4.geser(2, -3);
        T4.printTitik();

        // Jarak antara T3 dan T4
        System.out.println("\n");
        System.out.println("Jarak antara T3 dan T4");
        double jarakT3T4 = T3.getJarak(T4);
        System.out.println("Jarak antara T1 dan T2: " + jarakT3T4);

        System.out.println("Jumlah objek Titik = " + titik.getCounterTitik());
    }
}

        

