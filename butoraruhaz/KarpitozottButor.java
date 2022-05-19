
package butoraruhaz;


public class KarpitozottButor extends Butorok {
    String anyag;
    
    public KarpitozottButor(String nev, String anyag){
        super(nev);
        this.anyag=anyag;   
    }
    
    public KarpitozottButor(String nev, double ertek,String anyag){
        super(nev,ertek);
        this.anyag=anyag;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }
         @Override
     public KarpitozottButor clone()
        throws CloneNotSupportedException
    {
        KarpitozottButor obj = (KarpitozottButor)super.clone();
        
        return obj;
    }
    @Override
    public String toString() {
        return "Kárpitozott bútor{" + super.toString() + ", anyag=" + anyag + "}";
    }
    
    
}
