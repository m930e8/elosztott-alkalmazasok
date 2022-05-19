package butoraruhaz;


public class FaButor extends Butorok implements Cloneable{
    private int suly;
    
    public FaButor(String nev, int suly){
        super(nev);
        this.suly=suly;
    }
    
    public FaButor(String nev,double ertek,int suly){
        super(nev,ertek);
        this.suly =suly;       
    }

    public int getSuly() {
        return suly;
    }
    
     @Override
     public FaButor clone()
        throws CloneNotSupportedException
    {
        FaButor obj = (FaButor)super.clone();
        
        return obj;
    }
    
    @Override
    public String toString() {
        return "Fa bútor{" + super.toString() + ", súly=" + suly + "}";
    }

    
    
}
