/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autokuca.view;

import autokuca.controller.ObradaKupac;
import autokuca.controller.ObradaProdavac;
import autokuca.controller.ObradaRacun;
import autokuca.controller.ObradaVozilo;
import autokuca.model.Kupac;
import autokuca.model.Prodavac;
import autokuca.model.Racun;
import autokuca.model.Vozilo;
import autokuca.util.Alati;
import autokuca.util.AutokucaException;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author petar
 */
public class ProzorRacun extends javax.swing.JFrame implements AutokucaViewSucelje{

    private ObradaRacun obrada;
    
    /**
     * Creates new form ProzorRacun
     */
    public ProzorRacun() {
        initComponents();
        obrada=new ObradaRacun();
        setTitle(Alati.NAZIV_APP + " |RAČUN ");
        ucitajKupca();
        ucitajProdavaca();
        ucitajVozilo();
        definirajDatumPocetka();
        ucitaj();
    }
    
    
     private void definirajDatumPocetka(){
         DatePickerSettings dps = new DatePickerSettings(Locale.of("hr","HR"));
         dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
         dps.setTranslationClear("Očisti");
         dps.setTranslationToday("Danas");
         dtpDatumPocetka.datePicker.setSettings(dps);
         
         TimePickerSettings tps = dtpDatumPocetka.timePicker.getSettings();
    
         tps.setFormatForDisplayTime("HH:mm");
         tps.use24HourClockFormat();
         
         ArrayList<LocalTime> lista = new ArrayList<>();
         for(int i =0;i<24;i++){
             for(int j = 0;j<60;j=j+10){
                 lista.add(LocalTime.of(i,j));
             }
         }
         
         tps.generatePotentialMenuTimes(lista);
         
         
         
     }
    
    

    public ObradaRacun getObradaRacun() {
        return obrada;
    }
    
    private void ucitajVozilo(){
        DefaultComboBoxModel<Vozilo>m= new DefaultComboBoxModel<>();
        
        Vozilo v= new Vozilo();
        v.setSifra(0);
        v.setProizvodac("Odaberite");
        v.setModel("vozilo");
        v.setVIN("");
        m.addElement(v);
        m.addAll(new ObradaVozilo().read());
        
        cmbVozilo.setModel(m);
        cmbVozilo.repaint();
        
        
    }
    
    private void ucitajProdavaca(){
        DefaultComboBoxModel<Prodavac>m=new DefaultComboBoxModel<>();
        
        Prodavac p=new Prodavac();
        p.setSifra(0);
        p.setIme("Odaberite");
        p.setPrezime("prodavača");
        m.addElement(p);
        
        m.addAll(new ObradaProdavac().read());
        
        cmbProdavac.setModel(m);
        cmbProdavac.repaint();
    }
    private void ucitajKupca(){
        DefaultComboBoxModel<Kupac> m= new DefaultComboBoxModel<>();
        
        Kupac k= new Kupac();
        k.setSifra(0);
        k.setIme("Odaberite");
        k.setPrezime("kupca");
        k.setBroj_telefona("");
        m.addElement(k);
        
        m.addAll(new ObradaKupac().read());
        
        cmbKupac.setModel(m);
        cmbKupac.repaint();
  
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbKupac = new javax.swing.JComboBox<>();
        cmbVozilo = new javax.swing.JComboBox<>();
        cmbProdavac = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnIspisRacuna = new javax.swing.JButton();
        btnPVozilo = new javax.swing.JButton();
        dtpDatumPocetka = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Kupac");

        jLabel2.setText("Pretraži ili odaberi vozilo");

        jLabel3.setText("Prodavač");

        cmbKupac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKupacActionPerformed(evt);
            }
        });

        cmbVozilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVoziloActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

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

        jLabel4.setText("Pretraži");

        btnIspisRacuna.setText("Ispiši račun");
        btnIspisRacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspisRacunaActionPerformed(evt);
            }
        });

        btnPVozilo.setText("Pretraži vozilo");
        btnPVozilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPVoziloActionPerformed(evt);
            }
        });

        jLabel5.setText("Datum i vrijeme");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(btnTrazi)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbKupac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbProdavac, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                        .addComponent(cmbVozilo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPVozilo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dtpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(btnIspisRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnDodaj)
                        .addGap(54, 54, 54)
                        .addComponent(btnObrisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPromjeni)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVozilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPVozilo))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmbProdavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(dtpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi)
                    .addComponent(btnPromjeni))
                .addGap(18, 18, 18)
                .addComponent(btnIspisRacuna)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        popuniView();
        

    }//GEN-LAST:event_lstPodaciValueChanged

    private void cmbKupacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKupacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKupacActionPerformed

    private void cmbVoziloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVoziloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVoziloActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        var e = lstPodaci.getSelectedValue();

        if (JOptionPane.showConfirmDialog(getRootPane(), e , "Sigurno obrisati?",
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

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        var e = lstPodaci.getSelectedValue();

        obrada.setEntitet(e);
        popuniModel();

        try {
            obrada.update();   
            ucitaj();
        } catch (AutokucaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
            obrada.refresh();
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Racun());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (AutokucaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
            
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Racun> m= new DefaultListModel<>();
        m.addAll(obrada.read(txtUvjet.getText()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        btnTraziActionPerformed(null);
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnIspisRacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspisRacunaActionPerformed
       
       var e = obrada.getEntitet();
    if (e == null) {
        return;
    }
        
    XWPFDocument document = new XWPFDocument();
        
    
    XWPFParagraph title = document.createParagraph();
    title.setAlignment(ParagraphAlignment.CENTER);
    XWPFRun titleRun = title.createRun();
    titleRun.setText("Autokuća Import");
    titleRun.setColor("009933");
    titleRun.setBold(true);
    titleRun.setFontFamily("Courier");
    titleRun.setFontSize(20);

    
    XWPFParagraph racun = document.createParagraph();
    XWPFRun racunRun = racun.createRun();
    racunRun.setText("Račun:");
    racunRun.setBold(true);
    racunRun.setFontSize(18);
    
    XWPFParagraph customerInfo = document.createParagraph();
    XWPFRun customerRun = customerInfo.createRun();
    customerRun.setText("Kupac: " + e.getKupac().getIme() + " " + e.getKupac().getPrezime());

    
    XWPFParagraph prodavac=document.createParagraph();
    XWPFRun prodavacRun=prodavac.createRun();
    prodavacRun.setText("Prodavač: " + e.getProdavac().getIme()+ " " +e.getProdavac().getPrezime());
    
    Prodavac odabraniProdavac = (Prodavac) cmbProdavac.getSelectedItem();

       
    if (odabraniProdavac.getProdajnoMjesto() != null && !odabraniProdavac.getProdajnoMjesto().isEmpty()) {
            XWPFParagraph mjesto = document.createParagraph();
            XWPFRun mjestoRun = mjesto.createRun();
            mjestoRun.setText("Prodajno mjesto: " + odabraniProdavac.getProdajnoMjesto().get(0).getNaziv());
        }

    
    XWPFParagraph vozilo=document.createParagraph();
    XWPFRun voziloRun=vozilo.createRun();
    voziloRun.setText("Vozilo: "+ e.getVozilo().getProizvodac()+ " "+e.getVozilo().getModel()+" "+e.getVozilo().getVIN()
        );
    
    XWPFParagraph cijena=document.createParagraph();
    XWPFRun cijenaRun=cijena.createRun();
    cijenaRun.setText("Cijena vozila: "+  e.getVozilo().getCijena()+"€");
    
    XWPFParagraph datum=document.createParagraph();
    XWPFRun datumFRun=datum.createRun();
    datumFRun.setText("Datum izdavanja računa:" + e.getDatumPocetka());

    try {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getFileSystemView().getHomeDirectory());
        jfc.setSelectedFile(new java.io.File("racun.docx"));
        jfc.setFileFilter(new FileNameExtensionFilter("Word datoteka", "docx"));
        int returnValue = jfc.showSaveDialog(getRootPane());

        if (returnValue != JFileChooser.APPROVE_OPTION) {
            return;
        }

        FileOutputStream out = new FileOutputStream(jfc.getSelectedFile());
        document.write(out);
        out.close();
        document.close();

        // Otvorite Word dokument za ispis
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", jfc.getSelectedFile().getAbsolutePath());
        builder.redirectErrorStream(true);
        builder.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnIspisRacunaActionPerformed

    private void btnPVoziloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPVoziloActionPerformed
        new ProzorOdabirVozila(this).setVisible(true);
    }//GEN-LAST:event_btnPVoziloActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIspisRacuna;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPVozilo;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kupac> cmbKupac;
    private javax.swing.JComboBox<Prodavac> cmbProdavac;
    private javax.swing.JComboBox<Vozilo> cmbVozilo;
    private com.github.lgooddatepicker.components.DateTimePicker dtpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Racun> lstPodaci;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ucitaj() {
        DefaultListModel<Racun> m= new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
        
    }

    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        
        e.setKupac((Kupac)cmbKupac.getSelectedItem());
        e.setProdavac((Prodavac)cmbProdavac.getSelectedItem());
        e.setVozilo((Vozilo)cmbVozilo.getSelectedItem());
        
        
        LocalDate ld = dtpDatumPocetka.datePicker.getDate();
        LocalTime lt = dtpDatumPocetka.timePicker.getTime();
        
        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        
        e.setDatumPocetka(java.sql.Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));
        
        
    }
      

    @Override
    public void popuniView() {
        var e = obrada.getEntitet();
        
        cmbKupac.setSelectedItem(e.getKupac());
        cmbProdavac.setSelectedItem(e.getProdavac());
        cmbVozilo.setSelectedItem(e.getVozilo());
        
        if(e.getDatumPocetka()==null){
            dtpDatumPocetka.datePicker.setDate(null);
            dtpDatumPocetka.timePicker.setTime(null);
        }else{
            LocalDate ld = e.getDatumPocetka().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            dtpDatumPocetka.datePicker.setDate(ld);
            
            LocalTime lt = e.getDatumPocetka().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalTime();
            dtpDatumPocetka.timePicker.setTime(lt);
        }
        }
        
        
       
        
    
}
