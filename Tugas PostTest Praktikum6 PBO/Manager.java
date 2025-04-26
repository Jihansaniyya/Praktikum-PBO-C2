public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama){
        this.nama = nama;
    }

    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println(("Tunjangan: " + tunjangan));
    }
    
}
