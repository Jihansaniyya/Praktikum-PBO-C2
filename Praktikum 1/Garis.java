/* Nama File : Garis.java
 * Deskripsi : Atribut dan method dalam class garis
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */
public class Garis {
    //Atribut
    titik T1;
    titik T2;
    static int CounterGaris = 0;

    static int getCounterGaris(){
        return CounterGaris;
    }

    Garis(titik T1, titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris++;
    }

    Garis(){
        this(new titik(0, 0), new titik(1, 1));
    }

    titik getT1Garis() {
        return this.T1;
    }

    titik getT2Garis() {
        return this.T2;
    }

    void setT1Garis(titik T1) {
        this.T1 = T1;
    }

    void setT2Garis(titik T2) {
        this.T2 = T2;
    }

    double getPanjangGaris() {
        return Math.sqrt(Math.pow(T1.absis - T2.absis, 2) + Math.pow(T1.ordinat - T2.ordinat, 2));
    }

    double getGradien() {
        double X = T1.getAbsis() - T2.getAbsis();
        if (X == 0) {
            System.out.println("Nilai x1 dan x2 sama, pembagian nol");
        }
        return (T1.getOrdinat() - T2.getOrdinat()) / X;
    }

    titik getTitikTengah() {
        return new titik((this.T1.getAbsis() + this.T2.getAbsis()) / 2, (this.T1.getOrdinat() + this.T2.getOrdinat()) / 2);
    }

    boolean isSejajar(Garis X) {
        return this.getGradien() == X.getGradien();
    }

    boolean isTegakLurus(Garis X) {
        return (this.getGradien() * X.getGradien()) == -1;
    }

    void printT1T2() {
        System.out.println("Titik awal (" + T1.absis + "," + T1.ordinat + "), Titik akhir (" + T2.absis + ", " + T2.ordinat + ")");
    }

    void printRumus() {
        double m = (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
        double c = T1.getOrdinat() - (m * T1.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}

