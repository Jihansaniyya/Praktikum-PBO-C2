

public class titik {
    /************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************METHOD*****************/
    //konstruktor untuk membuat titik (0,0)
    titik (){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    titik (double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

   

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    double getAbsis (){
        return absis;
    }

    //Mengembalikan nilai ordinat 
    double getOrdinat (){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis (double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat (double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }
    
    int getKuadran() {
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(Math.pow(this.getAbsis(), 2) + Math.pow(this.getOrdinat(), 2));
    }

    double getJarak(titik T){
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    void refleksiX(){
        this.ordinat = this.getOrdinat() * (-1);
    }

    void refleksiY(){
        this.absis = this.getAbsis() * (-1);
    }

    double getRefleksiX(){
        return this.getOrdinat() * -1;
    }

    double getRefleksiY(){
        return this.getAbsis() * -1;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

} // end class titik
