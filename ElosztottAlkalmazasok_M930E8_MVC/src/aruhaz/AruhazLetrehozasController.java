
package aruhaz;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AruhazLetrehozasController {
    private Aruhaz aruhaz;
    private AruhazView view;
    
    public AruhazLetrehozasController(Aruhaz aruhaz, AruhazView view){
       this.aruhaz = aruhaz;
       this.view=view;
       aruhazAdatok();
    }
    
    public void controller(){
        view.getBtFHozzaadas().addActionListener(e-> faBHozzaadas());
        view.getBtKHozzaadas().addActionListener(e->kBHozzaadas());
        view.getBtListazas().addActionListener(e->listazas());
        view.getBtRendezes().addActionListener(e->rendezes());
        view.getBtMasolas().addActionListener(e->masolas());
        view.getBtExportalas().addActionListener(e->exportalas());
        view.getBtFelujitas().addActionListener(e->felujitas());
        view.getBtModositas().addActionListener(e->modositas());
    }
    
    
      private void tablazatbaIr(ArrayList<Butor> butorok){
        DefaultTableModel tblModel = (DefaultTableModel)view.getjTableButorok().getModel();
        tblModel.setRowCount(0);
        for(int i=0;i<butorok.size();i++){
            if(butorok.get(i) instanceof FaButor f){
                String data[] = {String.valueOf(i+1),f.getNev(),String.valueOf(f.getErtek()),String.valueOf(f.getSuly()),"N/A"};

                
                tblModel.addRow(data);
            }
            else if(butorok.get(i) instanceof KarpitozottButor f){
                String data[] = {String.valueOf(i+1),f.getNev(),String.valueOf(f.getErtek()),"N/A",String.valueOf(f.getAnyag())};

                tblModel.addRow(data);
            }
        }    
    }
      
    private void aruhazAdatok(){
        view.getlAruhazNev().setText(aruhaz.getAruhazNev());
        view.getlAruhazFileNev().setText(aruhaz.getFileName());
    }
    
    //Bútorok rendezése érték szerint
    private void rendezes(){
        tablazatbaIr(aruhaz.rendezes());
    }
    
    //Bútorok listázása a táblázatba
    private void listazas(){
        tablazatbaIr(aruhaz.rendezes());
    }
    
    //Bútorok kiíratása bináris állományba.
    private void exportalas(){
        try{
            aruhaz.exportButorok();
            JOptionPane.showMessageDialog(null,"Raktárkészlet sikeresen exportálva.");
        }
        catch(FileNotFoundException f){
            JOptionPane.showMessageDialog(null,"Fájl nem található","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"I/O hiba","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Bútorok felújítása esetén azok értéke 15%-kal csökken
    private void felujitas(){
        //Bútor kiválasztása sorszám alapján
        String sorszam =JOptionPane.showInputDialog(null, "Kérlek add meg a bútor sorszámát:");
        ArrayList<Butor> butorok = aruhaz.getButorok();
        //Amennyiben a bútor sorszámának megadása nem történt meg,a felhasználó figyelmeztetése.
        if(sorszam==null){
            JOptionPane.showMessageDialog(null, "Nem választottál ki bútort!"); 
        }
        //Kiválasztott bútor sorszámának ellenőrzése
        else{
            if(Integer.parseInt(sorszam)<=(butorok.size())&& Integer.parseInt(sorszam)>0){
                butorok.get(Integer.parseInt(sorszam)-1).felujit();
                tablazatbaIr(butorok);
            }
            //Érvénytelen sorszám esetén hibaüzenet megjelenítése
            else{
                JOptionPane.showMessageDialog(null, "Érvénytelen sorszám!","Error",JOptionPane.ERROR_MESSAGE);       
            }
        }   
    }
    
    private void masolas(){
        //Bútor kiválasztása sorszám alapján
        String sorszam =JOptionPane.showInputDialog(null, "Kérlek add meg a bútor sorszámát:");
        ArrayList<Butor> butorok = aruhaz.getButorok();
        //Amennyiben a bútor sorszámának megadása nem történt meg,a felhasználó figyelmeztetése.
        if(sorszam==null){
            JOptionPane.showMessageDialog(null, "Nem választottál ki bútort!"); 
        }
        //Kiválasztott bútor sorszámának ellenőrzése
        else{
            if(Integer.parseInt(sorszam)<=(butorok.size())&& Integer.parseInt(sorszam)>0){
                try{
                    aruhaz.masolas(Integer.parseInt(sorszam)-1);
                    tablazatbaIr(aruhaz.getButorok());
                }
                catch(CloneNotSupportedException c){
                    JOptionPane.showInputDialog(null, "Bútor nem másolható!","Error",JOptionPane.ERROR_MESSAGE); 
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Érvénytelen sorszám!","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }
    }
    //Bútor anyagának módosítása
    private void modositas(){
        //Bútor kiválasztása sorszám alapján
        String sorszam =JOptionPane.showInputDialog(null, "Kérlek add meg a bútor sorszámát:");
        ArrayList<Butor> butorok = aruhaz.getButorok();
        //Amennyiben a bútor sorszámának megadása nem történt meg,a felhasználó figyelmeztetése.
        if(sorszam==null){
            JOptionPane.showMessageDialog(null, "Nem választottál ki bútort!"); 
        }
        //Kiválasztott bútor sorszámának ellenőrzése
        else{
            if(Integer.parseInt(sorszam)<=(butorok.size())&& Integer.parseInt(sorszam)>0){
                //Csak a kápitozott bútor sorszáma valid sorszám
                if(butorok.get(Integer.parseInt(sorszam)-1) instanceof KarpitozottButor f){        
                   String anyag = JOptionPane.showInputDialog(this, "Milyen anyagra szeretnéd megváltoztatni a bútor kárpitját?");
                   f =(KarpitozottButor)butorok.get(Integer.parseInt(sorszam)-1);
                   f.setAnyag(anyag);
                   tablazatbaIr(butorok);
                }
                //Nem valid sorszám esetén hibaüzenet megjelenítése
                else{
                   JOptionPane.showMessageDialog(null, "A kiválasztott bútor nem kárpitozott bútor!","Error",JOptionPane.ERROR_MESSAGE); 
                }
            }
            //Érvénytelen sorszám esetén hibaüzenet megjelenítése
            else{
                JOptionPane.showMessageDialog(null, "Érvénytelen sorszám!","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }
    }
    
    private void faBHozzaadas(){
         if(view.getTfFNev().getText().equals("")||view.getTfFSuly().getText().equals("")){
            JOptionPane.showMessageDialog(null,"Hiányzó adat");        
        }
        else if(view.getTfFAr().getText().equals("")){
            FaButor faButor =new FaButor(view.getTfFNev().getText(), Integer.parseInt(view.getTfFSuly().getText()));
            aruhaz.butorHozzaadasa(faButor);
            String data[]={String.valueOf(view.getjTableButorok().getRowCount()+1),view.getTfFNev().getText(),String.valueOf(faButor.getErtek()),view.getTfFSuly().getText(),"N/A"};
        
            DefaultTableModel tblModel = (DefaultTableModel)view.getjTableButorok().getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Bútor sikeresen hozzáadva!");
            view.getTfFNev().setText("");
            view.getTfFSuly().setText("");
        }
        else{
            aruhaz.butorHozzaadasa(new FaButor(view.getTfFNev().getText(),Double.parseDouble(view.getTfFAr().getText()), Integer.parseInt(view.getTfFSuly().getText())));
            String data[]={String.valueOf(view.getjTableButorok().getRowCount()+1),view.getTfFNev().getText(),view.getTfFAr().getText(),view.getTfFSuly().getText(),"N/A"};
        
            DefaultTableModel tblModel = (DefaultTableModel)view.getjTableButorok().getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Bútor sikeresen hozzáadva!");
            view.getTfFNev().setText("");
            view.getTfFAr().setText("");
            view.getTfFSuly().setText("");
        }
    }
    
    
    private void kBHozzaadas() {
         if(view.getTfKNev().getText().equals("")||view.getTfKAnyag().getText().equals("")){
            JOptionPane.showMessageDialog(null,"Hiányzó adat");        
        }
        else if(view.getTfKAr().getText().equals("")){
            KarpitozottButor karpitozottButor =new KarpitozottButor(view.getTfKNev().getText(),view.getTfKAnyag().getText());
            aruhaz.butorHozzaadasa(karpitozottButor);
            String data[]={String.valueOf(view.getjTableButorok().getRowCount()+1),view.getTfKNev().getText(),String.valueOf(karpitozottButor.getErtek()),"N/A",view.getTfKAnyag().getText()};
        
            DefaultTableModel tblModel = (DefaultTableModel)view.getjTableButorok().getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Bútor sikeresen hozzáadva!");
            view.getTfKNev().setText("");
            view.getTfKAnyag().setText("");
        }
        else{
            aruhaz.butorHozzaadasa(new KarpitozottButor(view.getTfKNev().getText(),Double.parseDouble(view.getTfKAr().getText()),view.getTfKAnyag().getText()));
            String data[]={String.valueOf(view.getjTableButorok().getRowCount()+1),view.getTfKNev().getText(),view.getTfKAr().getText(),"N/A",view.getTfKAnyag().getText()};
        
            DefaultTableModel tblModel = (DefaultTableModel)view.getjTableButorok().getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Bútor sikeresen hozzáadva!");
            view.getTfKNev().setText("");
            view.getTfKAr().setText("");
            view.getTfKAnyag().setText("");
        }
    }
}
