
package aruhaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;


public class Aruhaz{
 
    private final String aruhazNev;   
    private ArrayList<Butor> butorok = new ArrayList<>();
    private final String fileName;
    
    public Aruhaz(String aruhazNev, String fileName){
        this.aruhazNev=aruhazNev;
        this.fileName=fileName;
        this.butorok=importButorok();     
       
    }

    public String getAruhazNev() {
        return aruhazNev;
    }

    public ArrayList<Butor> getButorok() {
        return butorok;
    }

    public String getFileName() {
        return fileName;
    }

    public void setButorok(ArrayList<Butor> butorok) {
        this.butorok = butorok;
    }
    
    //Új bútor hozzáadása
    public void butorHozzaadasa(Butor f){
        butorok.add(f);
    }
    
    //Érték szerinti rendezés
    public ArrayList<Butor> rendezes(){
        Collections.sort(butorok,new ErtekComparator());
        return butorok;
    }
    
    //Bútor másolása
    public void masolas(int sorszam) throws CloneNotSupportedException{
        butorok.add(butorok.get(sorszam).clone());
    }
    
    //Bútorok kiíratása egy bináris állományba
    public void exportButorok() throws FileNotFoundException,IOException{
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(butorok);
        oos.close();
        fos.close();   
    }
    
       
    private <T extends Butor> ArrayList<T> importButorok(){       
        ArrayList<T> butorok = new ArrayList<>();
         
        File file=new File(fileName);
        if(file.exists()&& file.length()!=0){
            try{
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis); 

                butorok = (ArrayList)ois.readObject();
                ois.close();
                fis.close();    
            }
            catch(ClassNotFoundException c){
                System.exit(0);
            }
            catch(IOException ex){
                System.exit(0);
            }
        }
        else{
            try{
                file.createNewFile();
            }
            catch(IOException ex){
                System.exit(0);
            }
        }
        return butorok;
    }
}
