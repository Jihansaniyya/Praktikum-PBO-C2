public class Segitiga extends BangunDatar {
    private double alas;
    private double sisi2;
    private double sisi3;
    private double tinggi;

    public Segitiga(double alas, double sisi2, double sisi3, double tinggi){
        this.alas = alas;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getSisi2(){
        return sisi2;
    }

    public void setSisi2(double sisi2){
        this.sisi2 = sisi2;
    }

    public double getSisi3(){
        return sisi3;
    }

    public void setSisi3(double sisi3){
        this.sisi3 = sisi3;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override 
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    @Override 
    public double hitungKeliling(){
        return alas + sisi2 + sisi3;
    }

    @Override
    public String toString() {
        return "Segitiga dengan alas " + alas + ", sisi2 " + sisi2 + ", sisi3 " + sisi3;
    }
}
