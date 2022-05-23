
package aruhaz;


public class FaButor extends Butor implements Cloneable{
    private final int suly;
    
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
    public String toString() {
        return "Fa bútor{" + super.toString() + ", súly=" + suly + "}";
    }

    
    
}
