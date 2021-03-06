/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import javax.swing.JPanel;
import CAD.Mapping;
import Processus.Historique;
import Processus.Map;
import Processus.PI;
import Processus.carte;

/**
 *
 * @author Rémi
 */

public class form_ajouter_poi extends javax.swing.JFrame {

    private int Id_Map;
    private double doubleX;
    private double doubleY;
    private Map map;
    /**
     * Creates new form form_ajouter_poi
     */
    public form_ajouter_poi(double X,double Y) {
        initComponents();
        this.doubleX=X;
        this.doubleY=Y;
        this.Position_X.setText(String.valueOf(X));
        this.Position_Y.setText(String.valueOf(Y));
    }
	public void setId_Map(int Id_Map){
		this.Id_Map = Id_Map;
	}
	public int getId_Map(){
		return Id_Map;
	}
	public void setMap(Map map){
		this.map = map;
	}
	public Map getMap(){
		return map;
	}
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
	
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_image = new javax.swing.JLabel();
        bouton_parcourir = new javax.swing.JButton();
        text_field_image = new javax.swing.JTextField();
        text_field_libelle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area_texte_court = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_area_description = new javax.swing.JTextArea();
        boutton_ajouter = new javax.swing.JButton();
        boutton_annuler = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Position_X = new javax.swing.JLabel();
        Position_Y = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout du P.I");

        jLabel1.setText("Libelle");

        jLabel2.setText("Texte court");

        jLabel3.setText("Description");

        label_image.setText("Image");

        bouton_parcourir.setText("Parcourir les dossiers");
        bouton_parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_parcourirActionPerformed(evt);
            }
        });

        text_field_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_imageActionPerformed(evt);
            }
        });

        text_field_libelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_libelleActionPerformed(evt);
            }
        });

        text_area_texte_court.setColumns(20);
        text_area_texte_court.setRows(5);
        jScrollPane1.setViewportView(text_area_texte_court);

        text_area_description.setColumns(20);
        text_area_description.setRows(5);
        jScrollPane2.setViewportView(text_area_description);

        boutton_ajouter.setText("Ajouter");
        boutton_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ajouterActionPerformed(evt);
            }
        });

        boutton_annuler.setText("Annuler");
        boutton_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_annulerActionPerformed(evt);
            }
        });

        jLabel4.setText("Position X : ");

        jLabel5.setText("Position Y :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label_image)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_field_libelle, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Position_Y)
                            .addComponent(Position_X))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text_field_image, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(bouton_parcourir)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(boutton_ajouter)
                .addGap(110, 110, 110)
                .addComponent(boutton_annuler)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_field_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Position_X))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Position_Y))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_image)
                    .addComponent(text_field_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_parcourir))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_ajouter)
                    .addComponent(boutton_annuler))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_parcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_parcourirActionPerformed
        jFileChooser1.showOpenDialog(this);

        String filePath = jFileChooser1.getSelectedFile().getAbsolutePath();
        text_field_image.setText(filePath);
    }//GEN-LAST:event_bouton_parcourirActionPerformed

    private void text_field_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_field_imageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_field_imageActionPerformed

    private void text_field_libelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_field_libelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_field_libelleActionPerformed

    private void boutton_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ajouterActionPerformed
        // TODO add your handling code here:
        PI pi = new PI();
        
        pi.setAbscisse(this.doubleX);
        pi.setOrdonee(this.doubleY);
    	pi.setLibelle(this.text_field_libelle.getText());
    	pi.setTexteCourt(this.text_area_texte_court.getText());
    	pi.setDescription(this.text_area_description.getText());
    	pi.setImage(this.text_field_image.getText());
        pi.Ajouter_PI(Id_Map);
    }//GEN-LAST:event_boutton_ajouterActionPerformed

    private void boutton_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_annulerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_boutton_annulerActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Position_X;
    private javax.swing.JLabel Position_Y;
    public javax.swing.JButton bouton_parcourir;
    private javax.swing.JButton boutton_ajouter;
    private javax.swing.JButton boutton_annuler;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_image;
    private javax.swing.JTextArea text_area_description;
    private javax.swing.JTextArea text_area_texte_court;
    public javax.swing.JTextField text_field_image;
    private javax.swing.JTextField text_field_libelle;
    // End of variables declaration//GEN-END:variables
}
