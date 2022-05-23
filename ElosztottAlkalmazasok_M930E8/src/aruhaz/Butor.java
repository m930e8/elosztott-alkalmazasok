
package aruhaz;

import java.io.Serializable;


public class Butor implements Cloneable,Serializable{
    private double ertek;
    private final String nev;
    
    //Ha nem adjuk meg a bútor értékét, a konstruktor alapértelmezetten 50000-re állítja be.
    public Butor(String nev){
        this.nev=nev; 
        this.ertek=50000;
    }
   
    public Butor(String nev, double ertek){
        this.nev=nev;
        this.ertek=ertek;
    }    

    public double getErtek() {
        return ertek;
    }

    public String getNev() {
        return nev;
    }   
    
    //Bútor felújítása esetén az értéke 15%-kal csökken.
    public double felujit(){
        this.ertek*=0.85;
        return ertek;
    }
    
    //Bútor másolatának létrehozása clone() metódus segítségével.
    @Override
    public Butor clone()
        throws CloneNotSupportedException
    {
        Butor obj = (Butor)super.clone();
        
        return obj;
    }
    
    @Override
    public String toString() {
        return  " név=" + nev + ", érték=" + ertek;
    }

    

  
          
          
          
}
