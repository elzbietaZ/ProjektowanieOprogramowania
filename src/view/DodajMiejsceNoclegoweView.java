/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.CMiejsceNoclegowe;
import java.awt.event.ActionListener;

/**
 *
 * @author Elżbieta
 */
public class DodajMiejsceNoclegoweView extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public DodajMiejsceNoclegoweView(ActionListener controler) {
        initComponents();
        listener=controler;
        setListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nazwa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Kraj = new javax.swing.JTextField();
        Miejscowosc = new javax.swing.JTextField();
        Ulica = new javax.swing.JTextField();
        NrBudynku = new javax.swing.JTextField();
        NrLokalu = new javax.swing.JTextField();
        dodajMiejsceNoclegoweButton = new javax.swing.JButton();
        AnulujDMNbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dodajStandardbutton = new javax.swing.JButton();
        dodajPokojebutton = new javax.swing.JButton();
        powrotButton = new javax.swing.JButton();
        menuglownebutton = new javax.swing.JButton();

        Nazwa.setToolTipText("");
        Nazwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nazwa miejsca noclegowego");

        jLabel2.setText("Adres miejsca noclegowego:");

        jLabel3.setText("Kraj");

        jLabel4.setText("Miejscowość");

        jLabel5.setText("Ulica");

        jLabel6.setText("Nr budynku");

        jLabel7.setText("Nr lokalu");

        dodajMiejsceNoclegoweButton.setText("OK");
        dodajMiejsceNoclegoweButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dodajMiejsceNoclegoweButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajMiejsceNoclegoweButtonActionPerformed(evt);
            }
        });

        AnulujDMNbutton.setText("Anuluj");
        AnulujDMNbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("Dodawanie miejsca noclegowego do bazy");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dodajStandardbutton.setText("Dodaj standard");
        dodajStandardbutton.setBorder(null);
        dodajStandardbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajStandardbuttonMouseClicked(evt);
            }
        });
        dodajStandardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajStandardbuttonActionPerformed(evt);
            }
        });

        dodajPokojebutton.setText("Dodaj pokoje");
        dodajPokojebutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dodajPokojebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajPokojebuttonActionPerformed(evt);
            }
        });

        powrotButton.setText("Powrót");
        powrotButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        powrotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotButtonActionPerformed(evt);
            }
        });

        menuglownebutton.setText("Menu główne");
        menuglownebutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuglownebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuglownebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajPokojebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(powrotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuglownebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dodajStandardbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dodajStandardbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dodajPokojebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(powrotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuglownebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(dodajMiejsceNoclegoweButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnulujDMNbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(NrLokalu)
                    .addComponent(NrBudynku)
                    .addComponent(Ulica)
                    .addComponent(Miejscowosc)
                    .addComponent(Nazwa)
                    .addComponent(Kraj))
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Kraj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Miejscowosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Ulica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(NrBudynku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(NrLokalu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajMiejsceNoclegoweButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnulujDMNbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        Nazwa.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NazwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazwaActionPerformed

    private void dodajMiejsceNoclegoweButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajMiejsceNoclegoweButtonActionPerformed
        // TODO add your handling code here:
        /* zastępuje listenerami
        DodajMiejsceNoclegoweView dmn=this;
        CMiejsceNoclegowe controler=new CMiejsceNoclegowe(dmn);
        controler.addMiejsceNoclegowe();
        */
    }//GEN-LAST:event_dodajMiejsceNoclegoweButtonActionPerformed

    private void dodajPokojebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajPokojebuttonActionPerformed
        // TODO add your handling code here:
     /*   DodajPokojeView p=new DodajPokojeView();
        p.setVisible(true);
       */
    }//GEN-LAST:event_dodajPokojebuttonActionPerformed

    private void powrotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powrotButtonActionPerformed

    private void menuglownebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuglownebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuglownebuttonActionPerformed

    private void dodajStandardbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajStandardbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajStandardbuttonMouseClicked

    private void dodajStandardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajStandardbuttonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_dodajStandardbuttonActionPerformed

    private void setListeners(){
        
        
        dodajMiejsceNoclegoweButton.addActionListener(listener);
        dodajPokojebutton.addActionListener(listener);
        dodajStandardbutton.addActionListener(listener);
        menuglownebutton.addActionListener(listener);
        powrotButton.addActionListener(listener);
        AnulujDMNbutton.addActionListener(listener);
        

        
        
    }
    
    private ActionListener listener;
    /**
     * @param args the command line arguments
     */
// 
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DodajMiejsceNoclegoweView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DodajMiejsceNoclegoweView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DodajMiejsceNoclegoweView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DodajMiejsceNoclegoweView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DodajMiejsceNoclegoweView(CMiejsceNoclegowe controler).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnulujDMNbutton;
    private javax.swing.JTextField Kraj;
    private javax.swing.JTextField Miejscowosc;
    private javax.swing.JTextField Nazwa;
    private javax.swing.JTextField NrBudynku;
    private javax.swing.JTextField NrLokalu;
    private javax.swing.JTextField Ulica;
    private javax.swing.JButton dodajMiejsceNoclegoweButton;
    private javax.swing.JButton dodajPokojebutton;
    private javax.swing.JButton dodajStandardbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuglownebutton;
    private javax.swing.JButton powrotButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Kraj
     */
    public String getKraj() {
        return Kraj.getText();
    }

    /**
     * @param Kraj the Kraj to set
     */
    public void setKraj(javax.swing.JTextField Kraj) {
        this.Kraj = Kraj;
    }

    /**
     * @return the Miejscowosc
     */
    public String getMiejscowosc() {
        return Miejscowosc.getText();
    }

    /**
     * @param Miejscowosc the Miejscowosc to set
     */
    public void setMiejscowosc(javax.swing.JTextField Miejscowosc) {
        this.Miejscowosc = Miejscowosc;
    }

    /**
     * @return the Nazwa
     */
    public String getNazwa() {
        return Nazwa.getText();
    }

    /**
     * @param Nazwa the Nazwa to set
     */
    public void setNazwa(javax.swing.JTextField Nazwa) {
        this.Nazwa = Nazwa;
    }

    /**
     * @return the NrBudynku
     */
    public String getNrBudynku() {
        return NrBudynku.getText();
    }

    /**
     * @param NrBudynku the NrBudynku to set
     */
    public void setNrBudynku(javax.swing.JTextField NrBudynku) {
        this.NrBudynku = NrBudynku;
    }

    /**
     * @return the NrLokalu
     */
    public String getNrLokalu() {
        return NrLokalu.getText();
    }

    /**
     * @param NrLokalu the NrLokalu to set
     */
    public void setNrLokalu(javax.swing.JTextField NrLokalu) {
        this.NrLokalu = NrLokalu;
    }

    /**
     * @return the Ulica
     */
    public String getUlica() {
        return Ulica.getText();
    }

    /**
     * @param Ulica the Ulica to set
     */
    public void setUlica(javax.swing.JTextField Ulica) {
        this.Ulica = Ulica;
    }

  
}
