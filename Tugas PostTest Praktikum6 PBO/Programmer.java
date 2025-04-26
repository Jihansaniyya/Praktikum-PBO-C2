public class Programmer extends Pegawai{
    private int bonus = 450000;
    
    public Programmer(String nama){
        this.nama = nama;
    }

    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Bonus: " + bonus);
    }
    
}

