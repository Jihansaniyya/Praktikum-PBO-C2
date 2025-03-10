/* Nama File : Tiket.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 19 Februari 2025
 */

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket){
        int tiketTersedia = 200;

        // Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0: "Jumlah pemesanan harus lebih dari 0";

        //Assertion untuk memastikan jumlah pmesanan tidak melebihi jumlah tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tidak boleh lebih dari tiket tersedia";

        System.out.println("Pemesanan tiket sebanyak: " + jumlahTiket + "berhasil");
    }

    public static void isEWallet(int EWallet) {
        //Memeriksa apakah index e-wallet dipilih valid
        boolean validEWallet = EWallet >= 1 && EWallet <= 4;

        //Assertion untuk memastikan e-wallet yang dipilih valid
        assert validEWallet: "EWallet tidak bisa digunakan";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index){
        switch(index){
            case 1:
            return "OVO";
         case 2:
            return "GoPay";
         case 3:
            return "DANA";
         case 4:
            return "LinkAja";
         default:
            return "";

        }
    }
}
