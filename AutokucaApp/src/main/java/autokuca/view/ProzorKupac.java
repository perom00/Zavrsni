/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autokuca.view;

import autokuca.controller.ObradaKupac;
import autokuca.model.Kupac;
import autokuca.util.Alati;
import autokuca.util.AutokucaException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author petar
 */
public class ProzorKupac extends javax.swing.JFrame implements AutokucaViewSucelje{
    
    private ObradaKupac obrada;
    private DecimalFormat df;
    
    /**
     * Creates new form ProzorKupac
     */
    public ProzorKupac() {
        initComponents();
        obrada= new ObradaKupac();
        setTitle(Alati.NAZIV_APP + " |KUPAC ");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.of("hr", "HR"));
        df = new DecimalFormat("###,##0.00", dfs);
        ucitaj();
    }
    
      @Override
     public void ucitaj() {
        DefaultListModel<Kupac> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBudzet = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnObrisi1 = new javax.swing.JButton();
        txtBrojtelefona = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Budžet");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        jLabel4.setText("Broj telefona");

        btnObrisi1.setText("Obriši");
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Uvjet (dio imena ili prezimena)");

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtIme)
                            .addComponent(jLabel2)
                            .addComponent(txtPrezime)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnPromjena))
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnObrisi1)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBudzet, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrojtelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodaj)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnPromjena))
                        .addGap(3, 3, 3)
                        .addComponent(txtBudzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnObrisi1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBrojtelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }
        
        obrada.setEntitet(lstPodaci.getSelectedValue());
        
        popuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    
    
    
    
    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Kupac());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (AutokucaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
               
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
         if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        obrada.setEntitet(e);
        popuniModel();
        
        try {
            obrada.update();
            ucitaj();
        } catch(AutokucaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
        
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        
        if (JOptionPane.showConfirmDialog(getRootPane(), e.getIme(), "Sigurno obrisati?",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION){
            return;
        }
        
        obrada.setEntitet(e);
        
        try {
            obrada.delete();
            ucitaj();
        } catch (AutokucaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisi1ActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        btnTraziActionPerformed(null);
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed

        DefaultListModel<Kupac> m = new DefaultListModel<>();
        m.addAll(obrada.read(txtUvjet.getText()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();

        
    }//GEN-LAST:event_btnTraziActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Kupac> lstPodaci;
    private javax.swing.JTextField txtBrojtelefona;
    private javax.swing.JTextField txtBudzet;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void popuniModel() {
        var e=obrada.getEntitet();
        
         e.setIme(txtIme.getText());
         e.setPrezime(txtPrezime.getText());
         try {
           e.setBudzet(BigDecimal.valueOf(df.parse(txtBudzet.getText()).doubleValue()));   
        } catch (Exception ex) {
            e.setBudzet(null);
           
        }
         
         e.setBroj_telefona(txtBrojtelefona.getText());
         
         
    }

    @Override
    public void popuniView() {
        
           var e = obrada.getEntitet();
           
           txtIme.setText(e.getIme());
           txtPrezime.setText(e.getPrezime());
        try {
            txtBudzet.setText(df.format(e.getBudzet()));
        } catch (Exception ex) {
            txtBudzet.setText(df.format(0));
        }
        
            txtBrojtelefona.setText(e.getBroj_telefona());
          
           
           
    }

    
}
