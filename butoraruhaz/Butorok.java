package butoraruhaz;



public class Butorok{
    private double ertek;
    private String nev;
  
    public Butorok(String nev){
        this.nev=nev; 
        this.ertek=50000;
    }
   
    public Butorok(String nev, double ertek){
        this.nev=nev;
        this.ertek=ertek;
    }    

    public double getErtek() {
        return ertek;
    }

    public void setErtek(double ertek) {
        this.ertek = ertek;
    }


    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
    
    public double felujit(){
        this.ertek*=0.85;
        return ertek;
    }
    
    
    @Override
    public String toString() {
        return  " név=" + nev + ", érték=" + ertek;
    }
