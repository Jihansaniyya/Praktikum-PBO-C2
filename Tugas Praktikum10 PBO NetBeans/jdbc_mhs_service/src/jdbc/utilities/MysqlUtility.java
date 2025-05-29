/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author Jihan Saniyya
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    
    // Static connection object
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Load driver
                Class.forName("com.mysql.jdbc.Driver");
                
                // Connection string dengan lebih banyak parameter untuk debugging
                String url = "jdbc:mysql://localhost:3306/jdbc_mahasiswa?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=UTF-8";
                String user = "root";
                String password = ""; // Kosong untuk XAMPP default
                
                System.out.println("🔄 Mencoba koneksi ke: " + url);
                System.out.println("👤 User: " + user);
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null) {
                    System.out.println("✅ Koneksi berhasil!");
                } else {
                    System.out.println("❌ Koneksi null!");
                }
                
            } catch (ClassNotFoundException cne) {
                System.out.println("❌ Driver tidak ditemukan: " + cne.getMessage());
                cne.printStackTrace();
            } catch (SQLException sqle) {
                System.out.println("❌ SQL Error: " + sqle.getMessage());
                System.out.println("🔍 Error Code: " + sqle.getErrorCode());
                System.out.println("🔍 SQL State: " + sqle.getSQLState());
                
                // Debugging info
                System.out.println("\n🔧 Debugging Info:");
                System.out.println("- Pastikan MySQL di XAMPP sudah running");
                System.out.println("- Pastikan database 'mahasiswa_db' sudah dibuat");
                System.out.println("- Cek port 3306 tidak bentrok");
                
                sqle.printStackTrace();
            }
        }
        return koneksi;
    }
    
    // Method untuk tutup koneksi
    public static void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                koneksi = null;
                System.out.println("🔒 Koneksi ditutup");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error tutup koneksi: " + e.getMessage());
        }
    }
    
    // Method untuk test koneksi
    public static boolean testConnection() {
        System.out.println("🧪 Testing koneksi database...");
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("✅ Test koneksi berhasil!");
            return true;
        } else {
            System.out.println("❌ Test koneksi gagal!");
            return false;
        }
    }
    
    // Main method untuk testing
    public static void main(String[] args) {
        System.out.println("=== TEST KONEKSI DATABASE ===");
        testConnection();
        closeConnection();
    }
}