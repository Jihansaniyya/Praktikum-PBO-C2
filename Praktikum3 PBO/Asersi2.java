/* Nama File : Asersi2.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol";
        Lingkaran l= new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}


// Jawaban pertanyaan
/* Assertion dalam Java hanya akan aktif jika dijalankan dengan opsi -enable assertions. 
Secara default, assertion tidak akan dijalankan karena harus diaktifkan secara eksplisit saat program dijalankan. 
Jika assertion tidak diaktifkan, program tetap akan berjalan meskipun nilai jariJari adalah 0.*/
