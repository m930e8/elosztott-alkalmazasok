
package aruhaz;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class AruhazView {
    private final JFrame frame;
    private final JPanel jPanel1;
    private final JPanel jPanel2;
    private final JLabel jLabel2;
    private final JLabel jLabel3;
    private final JLabel jLabel4;
    private final JLabel jLabel5;
    private final JLabel jLabel6;
    private final JLabel jLabel7;
    private final JLabel jLabel8;
    private final JLabel jLabel9;
    private final JLabel jLabel10;
    private final JLabel jLabel11;
    private final JLabel jLabel12;
    private final JLabel lAruhazNev;
    private final JLabel lAruhazFileNev;
    private JButton btListazas;
    private JButton btFHozzaadas;
    private JButton btKHozzaadas;
    private JButton btFelujitas;
    private JButton btMasolas;
    private JButton btRendezes;
    private JButton btExportalas;
    private JTable jTableButorok;
    private JButton btModositas;
    private JTextField tfFNev;
    private JTextField tfFAr;
    private JTextField tfFSuly;
    private JTextField tfKNev;
    private JTextField tfKAr;
    private JTextField tfKAnyag;
    private final JScrollPane jScrollPane1;

    
    public AruhazView(String title){
        frame=new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Áruház");
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableButorok = new javax.swing.JTable();
        btListazas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lAruhazNev = new javax.swing.JLabel();
        lAruhazFileNev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btFHozzaadas = new javax.swing.JButton();
        tfFNev = new javax.swing.JTextField();
        tfFAr = new javax.swing.JTextField();
        tfFSuly = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfKNev = new javax.swing.JTextField();
        tfKAr = new javax.swing.JTextField();
        tfKAnyag = new javax.swing.JTextField();
        btKHozzaadas = new javax.swing.JButton();
        btFelujitas = new javax.swing.JButton();
        btMasolas = new javax.swing.JButton();
        btRendezes = new javax.swing.JButton();
        btExportalas = new javax.swing.JButton();
        btModositas = new javax.swing.JButton();

        jTableButorok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorszám", "Bútor név", "Ár", "Súly", "Anyag"
            }
        ));
        
        jTableButorok.setGridColor(java.awt.SystemColor.activeCaption);
        jTableButorok.setSelectionBackground(java.awt.SystemColor.activeCaption);
        jScrollPane1.setViewportView(jTableButorok);

        btListazas.setBackground(java.awt.SystemColor.activeCaption);
        btListazas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btListazas.setText("Listázás");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Áruház", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), javax.swing.UIManager.getDefaults().getColor("Actions.Blue"))); // NOI18N
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        jLabel2.setText("Név:");

        jLabel3.setText("File név:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAruhazNev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lAruhazFileNev, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lAruhazFileNev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lAruhazNev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.SystemColor.control);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel4.setText("Bútor hozzáadása");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fa bútor");

        jLabel6.setText("Név");

        jLabel7.setText("Ár");

        jLabel8.setText("Súly");

        btFHozzaadas.setBackground(java.awt.SystemColor.activeCaption);
        btFHozzaadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btFHozzaadas.setText("Hozzáadás");

        jLabel9.setText("Név");

        jLabel10.setText("Ár");

        jLabel11.setText("Anyag");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Kárpitozott bútor");

        btKHozzaadas.setBackground(java.awt.SystemColor.activeCaption);
        btKHozzaadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btKHozzaadas.setText("Hozzáadás");

        btFelujitas.setBackground(java.awt.SystemColor.activeCaption);
        btFelujitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btFelujitas.setText("Felújítás");

        btMasolas.setBackground(java.awt.SystemColor.activeCaption);
        btMasolas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btMasolas.setText("Másolás");

        btModositas.setBackground(java.awt.SystemColor.activeCaption);
        btModositas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btModositas.setText("Módosítás");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFHozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFNev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFAr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFSuly, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfKNev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(btFelujitas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfKAr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfKAnyag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btKHozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btModositas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btMasolas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfFNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfKNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFelujitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfFAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfKAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMasolas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfFSuly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfKAnyag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModositas))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFHozzaadas)
                    .addComponent(btKHozzaadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btRendezes.setBackground(java.awt.SystemColor.activeCaption);
        btRendezes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRendezes.setText("Rendezés");

        btExportalas.setBackground(java.awt.SystemColor.activeCaption);
        btExportalas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExportalas.setText("Exportálás");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListazas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btRendezes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btExportalas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListazas)
                    .addComponent(btRendezes)
                    .addComponent(btExportalas))
                .addGap(26, 26, 26))
        );

    }   

    public JButton getBtListazas() {
        return btListazas;
    }

    public JButton getBtFHozzaadas() {
        return btFHozzaadas;
    }

    public JButton getBtKHozzaadas() {
        return btKHozzaadas;
    }

    public JButton getBtFelujitas() {
        return btFelujitas;
    }

    public JButton getBtMasolas() {
        return btMasolas;
    }

    public JButton getBtRendezes() {
        return btRendezes;
    }

    public JButton getBtExportalas() {
        return btExportalas;
    }

    public JButton getBtModositas() {
        return btModositas;
    }
    
    public JTable getjTableButorok() {
        return jTableButorok;
    }

    public JTextField getTfFNev() {
        return tfFNev;
    }

    public JTextField getTfFAr() {
        return tfFAr;
    }

    public JTextField getTfFSuly() {
        return tfFSuly;
    }

    public JTextField getTfKNev() {
        return tfKNev;
    }

    public JTextField getTfKAr() {
        return tfKAr;
    }

    public JTextField getTfKAnyag() {
        return tfKAnyag;
    }

    public JLabel getlAruhazNev() {
        return lAruhazNev;
    }

    public JLabel getlAruhazFileNev() {
        return lAruhazFileNev;
    }

    public void setBtListazas(JButton btListazas) {
        this.btListazas = btListazas;
    }

    public void setBtFHozzaadas(JButton btFHozzaadas) {
        this.btFHozzaadas = btFHozzaadas;
    }

    public void setBtKHozzaadas(JButton btKHozzaadas) {
        this.btKHozzaadas = btKHozzaadas;
    }

    public void setBtFelujitas(JButton btFelujitas) {
        this.btFelujitas = btFelujitas;
    }

    public void setBtMasolas(JButton btMasolas) {
        this.btMasolas = btMasolas;
    }

    public void setBtRendezes(JButton btRendezes) {
        this.btRendezes = btRendezes;
    }

    public void setBtExportalas(JButton btExportalas) {
        this.btExportalas = btExportalas;
    }

    public void setjTableButorok(JTable jTableButorok) {
        this.jTableButorok = jTableButorok;
    }

    public void setBtModositas(JButton btModositas) {
        this.btModositas = btModositas;
    }

    public void setTfFNev(JTextField tfFNev) {
        this.tfFNev = tfFNev;
    }

    public void setTfFAr(JTextField tfFAr) {
        this.tfFAr = tfFAr;
    }

    public void setTfFSuly(JTextField tfFSuly) {
        this.tfFSuly = tfFSuly;
    }

    public void setTfKNev(JTextField tfKNev) {
        this.tfKNev = tfKNev;
    }

    public void setTfKAr(JTextField tfKAr) {
        this.tfKAr = tfKAr;
    }

    public void setTfKAnyag(JTextField tfKAnyag) {
        this.tfKAnyag = tfKAnyag;
    }
    
    

    
    
    
}
