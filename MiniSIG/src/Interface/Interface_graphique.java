/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.sql.ResultSet;
import java.sql.SQLException;
import CAD.Mapping;
import Processus.Map;

/**
 *
 * @author Rémi
 */
public class Interface_graphique extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map map_actuel;
    private int Id_Map;
    /**
     * Creates new form Interface_graphique
     */
    public Interface_graphique() {
        initComponents();
        
 
    }
    
    public void AjouterPi(double X, double Y){
        form_ajouter_poi fm_ajout_poi = new form_ajouter_poi(X,Y);
        fm_ajout_poi.setId_Map(this.Id_Map);
        fm_ajout_poi.setMap(this.map_actuel);
        fm_ajout_poi.setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        container = new javax.swing.JPanel();
        pan_recherche = new javax.swing.JPanel();
        champ_recherche = new javax.swing.JTextField();
        boutton_recherche = new javax.swing.JButton();
        boutton_precedent = new javax.swing.JButton();
        boutton_suivant = new javax.swing.JButton();
        pan_resultat_recherche = new javax.swing.JTabbedPane();
        pan_parcours = new javax.swing.JPanel();
        pan_resultat = new javax.swing.JPanel();
        pan_news = new javax.swing.JPanel();
        pan_poi = new javax.swing.JPanel();
        pan_historique = new javax.swing.JPanel();
        panel_map = new javax.swing.JPanel();
        panel_remplacement = new javax.swing.JPanel();
        MenuBar_globale = new javax.swing.JMenuBar();
        menu_edition = new javax.swing.JMenu();
        menu_item_ajouter_lieux = new javax.swing.JMenuItem();
        menu_poi = new javax.swing.JMenu();
        menu_item_ajouter_poi = new javax.swing.JMenuItem();
        menu_parcours_modfi_supp_parcours = new javax.swing.JMenu();
        menu_item_ajouter_parcours = new javax.swing.JMenuItem();
        menu_item_modif_supp_parcours = new javax.swing.JMenuItem();
        //jMenu2 = new javax.swing.JMenu();
        menu_item_ajouter_news = new javax.swing.JMenuItem();
        menu_item_modif_supp_news = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniSIG");
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(985, 649));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        boutton_recherche.setText("Rechercher");
        boutton_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_rechercheActionPerformed(evt);
            }
        });

        boutton_precedent.setText("Precedent");
        boutton_precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_precedentActionPerformed(evt);
            }
        });

        boutton_suivant.setText("Suivant");
        boutton_suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_suivantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_rechercheLayout = new javax.swing.GroupLayout(pan_recherche);
        pan_recherche.setLayout(pan_rechercheLayout);
        pan_rechercheLayout.setHorizontalGroup(
            pan_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_rechercheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(champ_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(boutton_recherche)
                .addGap(118, 118, 118)
                .addComponent(boutton_precedent)
                .addGap(53, 53, 53)
                .addComponent(boutton_suivant)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        pan_rechercheLayout.setVerticalGroup(
            pan_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_rechercheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_recherche)
                    .addComponent(boutton_precedent)
                    .addComponent(boutton_suivant))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_parcoursLayout = new javax.swing.GroupLayout(pan_parcours);
        pan_parcours.setLayout(pan_parcoursLayout);
        pan_parcoursLayout.setHorizontalGroup(
            pan_parcoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pan_parcoursLayout.setVerticalGroup(
            pan_parcoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        try {
			Processus.parcours.DisplayParcours(pan_parcours);;
		} catch (SQLException e) {
			e.printStackTrace();
		}

        pan_resultat_recherche.addTab("Parcours", pan_parcours);

        javax.swing.GroupLayout pan_resultatLayout = new javax.swing.GroupLayout(pan_resultat);
        pan_resultat.setLayout(pan_resultatLayout);
        pan_resultatLayout.setHorizontalGroup(
            pan_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pan_resultatLayout.setVerticalGroup(
            pan_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        pan_resultat_recherche.addTab("Resultats recherche", pan_resultat);

        javax.swing.GroupLayout pan_newsLayout = new javax.swing.GroupLayout(pan_news);
        pan_news.setLayout(pan_newsLayout);
        pan_newsLayout.setHorizontalGroup(
            pan_newsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pan_newsLayout.setVerticalGroup(
            pan_newsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        try {
			Processus.News.DisplayPanelNews(pan_news);
		} catch (SQLException e) {
			e.printStackTrace();
		}

        pan_resultat_recherche.addTab("News", pan_news);

        javax.swing.GroupLayout pan_poiLayout = new javax.swing.GroupLayout(pan_poi);
        pan_poi.setLayout(pan_poiLayout);
        pan_poiLayout.setHorizontalGroup(
            pan_poiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pan_poiLayout.setVerticalGroup(
            pan_poiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        pan_resultat_recherche.addTab("P.I", pan_poi);

        javax.swing.GroupLayout pan_historiqueLayout = new javax.swing.GroupLayout(pan_historique);
        pan_historique.setLayout(pan_historiqueLayout);
        pan_historiqueLayout.setHorizontalGroup(
            pan_historiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pan_historiqueLayout.setVerticalGroup(
            pan_historiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        try {
        	Processus.Historique.DisplayPanelHistorique(pan_historique);
        } catch(SQLException e) {
        	e.printStackTrace();
        }

        pan_resultat_recherche.addTab("Historique", pan_historique);

        panel_map.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_map.setFocusable(false);

        panel_remplacement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel_remplacementLayout = new javax.swing.GroupLayout(panel_remplacement);
        panel_remplacement.setLayout(panel_remplacementLayout);
        panel_remplacementLayout.setHorizontalGroup(
            panel_remplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_remplacementLayout.setVerticalGroup(
            panel_remplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_mapLayout = new javax.swing.GroupLayout(panel_map);
        panel_map.setLayout(panel_mapLayout);
        panel_mapLayout.setHorizontalGroup(
            panel_mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_remplacement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_mapLayout.setVerticalGroup(
            panel_mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_remplacement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan_recherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan_resultat_recherche))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pan_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pan_resultat_recherche)
        );

        menu_edition.setText("Lieux");

        menu_item_ajouter_lieux.setText("Ajouter");
        menu_item_ajouter_lieux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_ajouter_lieuxActionPerformed(evt);
            }
        });
        menu_edition.add(menu_item_ajouter_lieux);

        MenuBar_globale.add(menu_edition);

        menu_poi.setText("Points d'inteterets");

        menu_item_ajouter_poi.setText("Ajouter");
        menu_item_ajouter_poi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_ajouter_poiActionPerformed(evt);
            }
        });
        menu_poi.add(menu_item_ajouter_poi);

        MenuBar_globale.add(menu_poi);

        menu_parcours_modfi_supp_parcours.setText("Parcours");

        menu_item_ajouter_parcours.setText("Ajouter");
        menu_parcours_modfi_supp_parcours.add(menu_item_ajouter_parcours);

        menu_item_modif_supp_parcours.setText("Modifier/Supprimer");
        menu_item_modif_supp_parcours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_modif_supp_parcoursActionPerformed(evt);
            }
        });
        menu_parcours_modfi_supp_parcours.add(menu_item_modif_supp_parcours);

        MenuBar_globale.add(menu_parcours_modfi_supp_parcours);

        /*jMenu2.setText("News");

        menu_item_ajouter_news.setText("Ajouter");
        menu_item_ajouter_news.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_ajouter_newsActionPerformed(evt);
            }
        });
        jMenu2.add(menu_item_ajouter_news);

        menu_item_modif_supp_news.setText("Modifier/Supprimer");
        menu_item_modif_supp_news.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_modif_supp_newsActionPerformed(evt);
            }
        });
        jMenu2.add(menu_item_modif_supp_news);

        MenuBar_globale.add(jMenu2);*/

        setJMenuBar(MenuBar_globale);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_rechercheActionPerformed

    private void menu_item_modif_supp_parcoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_modif_supp_parcoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_item_modif_supp_parcoursActionPerformed

    private void menu_item_ajouter_lieuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_ajouter_lieuxActionPerformed
        // TODO add your handling code here:        
        
    }//GEN-LAST:event_menu_item_ajouter_lieuxActionPerformed

    private void menu_item_ajouter_poiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_ajouter_poiActionPerformed
        // TODO add your handling code here:
        /*form_consulter_poi fm_consult_poi = new form_consulter_poi();
        fm_consult_poi.setVisible(true);*/
    }//GEN-LAST:event_menu_item_ajouter_poiActionPerformed

    /*private void menu_item_ajouter_newsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_ajouter_newsActionPerformed
        // TODO add your handling code here:
        form_ajouter_news fan = new form_ajouter_news();
        fan.setVisible(true);
    }//GEN-LAST:event_menu_item_ajouter_newsActionPerformed

    private void menu_item_modif_supp_newsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_modif_supp_newsActionPerformed
        // TODO add your handling code here:
        form_modifier_news fmn = new form_modifier_news();
        fmn.setVisible(true);
    }//GEN-LAST:event_menu_item_modif_supp_newsActionPerformed*/

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
           	
    }//GEN-LAST:event_formWindowOpened

    private void boutton_suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_suivantActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_boutton_suivantActionPerformed

    private void boutton_precedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_precedentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_precedentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new Interface_graphique().setVisible(true);
                }
                catch(Exception e){
                    
                }
              
            }
        });
    }
    /*private void AfficherCarte(){
    	map_actuel = new Map(1100,539,"arras2.png");
    	map_actuel.setVisible(true);
        panel_map.add(map_actuel);
    }*/
    public void AfficherCarte(int Id_Map){
    	Mapping mpg = new Mapping();
    	ResultSet rs=mpg.Select("Image_Map", "map", "ID_Map=\'"+Id_Map+"\'");
    	String lienmap;
		try {
			lienmap = rs.getString("Image_Map");
	    	map_actuel = new Map(1100,539,lienmap);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar_globale;
    private javax.swing.JButton boutton_precedent;
    private javax.swing.JButton boutton_recherche;
    private javax.swing.JButton boutton_suivant;
    private javax.swing.JTextField champ_recherche;
    public static javax.swing.JPanel container;
    private javax.swing.JMenu jMenu1;
    //private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menu_edition;
    private javax.swing.JMenuItem menu_item_ajouter_lieux;
    private javax.swing.JMenuItem menu_item_ajouter_news;
    private javax.swing.JMenuItem menu_item_ajouter_parcours;
    private javax.swing.JMenuItem menu_item_ajouter_poi;
    private javax.swing.JMenuItem menu_item_modif_supp_news;
    private javax.swing.JMenuItem menu_item_modif_supp_parcours;
    private javax.swing.JMenu menu_parcours_modfi_supp_parcours;
    private javax.swing.JMenu menu_poi;
    private javax.swing.JPanel pan_historique;
    private javax.swing.JPanel pan_news;
    private javax.swing.JPanel pan_parcours;
    private javax.swing.JPanel pan_poi;
    private javax.swing.JPanel pan_recherche;
    private javax.swing.JPanel pan_resultat;
    private javax.swing.JTabbedPane pan_resultat_recherche;
    public static javax.swing.JPanel panel_map;
    private javax.swing.JPanel panel_remplacement;
    // End of variables declaration//GEN-END:variables
}
