public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    
    public T get() {
        return bangunDatar;
    }
    
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
    
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    
    @Override
    public String toString() {
        return "Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling();
    }
}