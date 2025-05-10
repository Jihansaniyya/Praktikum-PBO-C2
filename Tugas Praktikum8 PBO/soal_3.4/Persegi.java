public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    // Getter dan setter
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
    
    @Override
    public String toString() {
        return "Persegi dengan sisi " + sisi;
    }
}