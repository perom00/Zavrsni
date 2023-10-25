/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autokuca.view;

import autokuca.util.Alati;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author petar
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(Alati.NAZIV_APP + " | Izbornik");
        lblOperater.setText(Alati.getOperater());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar = new javax.swing.JToolBar();
        lblOperater = new javax.swing.JLabel();
        btnKupac = new javax.swing.JButton();
        btnProdajno = new javax.swing.JButton();
        btnProdavac = new javax.swing.JButton();
        btnVozilo = new javax.swing.JButton();
        btnRacun = new javax.swing.JButton();
        btnONama = new javax.swing.JButton();
        btnIzlaz = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolbar.setRollover(true);
        toolbar.add(lblOperater);

        btnKupac.setText("Kupci");
        btnKupac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKupacActionPerformed(evt);
            }
        });

        btnProdajno.setText("Prodajna Mjesta");
        btnProdajno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdajnoActionPerformed(evt);
            }
        });

        btnProdavac.setText("Prodavači");
        btnProdavac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdavacActionPerformed(evt);
            }
        });

        btnVozilo.setText("Vozila");
        btnVozilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoziloActionPerformed(evt);
            }
        });

        btnRacun.setText("Računi");
        btnRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacunActionPerformed(evt);
            }
        });

        btnONama.setText("O nama");
        btnONama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONamaActionPerformed(evt);
            }
        });

        btnIzlaz.setText("Izlaz");
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 336, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIzlaz)
                    .addComponent(btnONama)
                    .addComponent(btnRacun)
                    .addComponent(btnVozilo)
                    .addComponent(btnProdavac)
                    .addComponent(btnProdajno)
                    .addComponent(btnKupac))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnKupac)
                .addGap(18, 18, 18)
                .addComponent(btnProdajno)
                .addGap(18, 18, 18)
                .addComponent(btnProdavac)
                .addGap(18, 18, 18)
                .addComponent(btnVozilo)
                .addGap(18, 18, 18)
                .addComponent(btnRacun)
                .addGap(18, 18, 18)
                .addComponent(btnONama)
                .addGap(18, 18, 18)
                .addComponent(btnIzlaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdajnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdajnoActionPerformed
       new ProzorProdajnoMjesto().setVisible(true);
    }//GEN-LAST:event_btnProdajnoActionPerformed

    private void btnKupacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKupacActionPerformed
        new ProzorKupac().setVisible(true);
    }//GEN-LAST:event_btnKupacActionPerformed

    private void btnProdavacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdavacActionPerformed
        new ProzorProdavac().setVisible(true);
    }//GEN-LAST:event_btnProdavacActionPerformed

    private void btnVoziloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoziloActionPerformed
        new ProzorVozilo().setVisible(true);
    }//GEN-LAST:event_btnVoziloActionPerformed

    private void btnRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacunActionPerformed
        new ProzorRacun().setVisible(true);
    }//GEN-LAST:event_btnRacunActionPerformed

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void btnONamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONamaActionPerformed
        Image slika = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        ImageIcon ii = new ImageIcon(slika);
        JOptionPane.showMessageDialog(getRootPane(), "Autokuća Import pruža usluge uvoza i prodaje vozila",
                "Autokuća Import", JOptionPane.INFORMATION_MESSAGE, ii);
    }//GEN-LAST:event_btnONamaActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnKupac;
    private javax.swing.JButton btnONama;
    private javax.swing.JButton btnProdajno;
    private javax.swing.JButton btnProdavac;
    private javax.swing.JButton btnRacun;
    private javax.swing.JButton btnVozilo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblOperater;
    private javax.swing.JToolBar toolbar;
    // End of variables declaration//GEN-END:variables
}