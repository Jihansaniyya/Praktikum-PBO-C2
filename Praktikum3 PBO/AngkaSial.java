/* Nama File : AngkaSial.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+ "bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati masukkan angka!!!"); 
        }
    }
}



// jawaban pertanyaan
/* Baris 12 dieksekusi jika agka bukan 13, karena eksepsi hanya terjadi saat angka 13.
 * Baris 21 tidak dieksekusi karena setelah as.cobaAngka(13) melempar eksepsi, program langsung masuk ke blok catch, sehingga as.cobaAngka(12) tidak sempat dijalankan.
 */