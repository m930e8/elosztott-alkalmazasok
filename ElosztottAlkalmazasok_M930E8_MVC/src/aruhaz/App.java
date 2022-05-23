
package aruhaz;


import java.io.IOException;


public class App {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

    Aruhaz aruhaz = new Aruhaz("IKEA", "raktarkeszlet.txt");

    AruhazView view = new AruhazView("aruhaz");
    AruhazLetrehozasController c = new AruhazLetrehozasController(aruhaz, view);
    c.controller();
  
    }
}
