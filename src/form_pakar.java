
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class form_pakar extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public form_pakar() {
        initComponents();
    }

    static String f[] = new String[8];
    static String id_pasien;
    static String nama_pasien;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        f5 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        lf7 = new javax.swing.JLabel();
        lf8 = new javax.swing.JLabel();
        lf4 = new javax.swing.JLabel();
        lf6 = new javax.swing.JLabel();
        f7 = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        f8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        tombolProses = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lf5 = new javax.swing.JLabel();
        lf1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lf3 = new javax.swing.JLabel();
        lf2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelHasil = new javax.swing.JScrollPane();
        textAreaHasil = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pakar");
        setResizable(false);

        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        lf7.setText("Diabetes pedigree function");

        lf8.setText("Age (years)");

        lf4.setText("Triceps skin fold thickness");

        lf6.setText("Body mass index");

        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });

        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });

        jLabel6.setText("Hasil");

        hasil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tombolProses.setText("PROSES");
        tombolProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolProsesActionPerformed(evt);
            }
        });

        tombolSimpan.setText("SIMPAN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INPUT NILAI GEJALA PASIEN");

        jLabel2.setText("Nama Pasien");

        jLabel3.setText("Gejala:");

        lf5.setText("2-Hour serum insulin ");

        lf1.setText("Number of times pregnant");

        jLabel4.setText("ID Pasien");

        lf3.setText("Diastolic blood pressure");

        lf2.setText("Plasma glucose concentration");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("0 : Tidak Diabetes");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("1 : Diabetes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tombolSimpan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tombolProses))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lf7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(108, 108, 108))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f1)
                            .addComponent(lf1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lf4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolProses)
                            .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Identifikasi", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Gejala", jPanel2);

        panelHasil.setWheelScrollingEnabled(false);

        textAreaHasil.setColumns(20);
        textAreaHasil.setRows(5);
        panelHasil.setViewportView(textAreaHasil);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHasil, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHasil, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hasil", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Pengguna", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Keluar", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed

    }//GEN-LAST:event_f5ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed

    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed

    }//GEN-LAST:event_f4ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed

    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed

    }//GEN-LAST:event_f2ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed

    }//GEN-LAST:event_f7ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed

    }//GEN-LAST:event_f6ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed

    }//GEN-LAST:event_f8ActionPerformed
        
    static void simpanDataGejala(String f0, String f1, String f2, String f3, String f4, String f5, String f6, String f7){
        try {
            WritableWorkbook w = Workbook.createWorkbook(new File("data testing.xls"));
            WritableSheet s = w.createSheet("Testing", 0);             
                s.addCell(new Label(0, 0, f0));
                s.addCell(new Label(1, 0, f1));
                s.addCell(new Label(2, 0, f2));
                s.addCell(new Label(3, 0, f3));
                s.addCell(new Label(4, 0, f4));
                s.addCell(new Label(5, 0, f5));
                s.addCell(new Label(6, 0, f6));
                s.addCell(new Label(7, 0, f7));
            //Menuliskan pada file XLS
            w.write();
            //Menutup sambungan
            w.close();
            //i++;
        } catch (Exception aoEx) {
            System.err.print(aoEx);
        }
    }
    
    private void tombolProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolProsesActionPerformed
        //id_pasien = 1+"";
        //nama_pasien = nama.getText();
        f[0] = f1.getText();
        f[1] = f2.getText();
        f[2] = f3.getText();
        f[3] = f4.getText();
        f[4] = f5.getText();
        f[5] = f6.getText();
        f[6] = f7.getText();
        f[7] = f8.getText();
        simpanDataGejala(f[0],f[1],f[2],f[3],f[4],f[5],f[6],f[7]);
        prosesKNN();
    }//GEN-LAST:event_tombolProsesActionPerformed
    
    static double[][] instances;
    static double[][] test;
    static String[][] type;
    
    static void BacaDataTraining() {
        String alamat = "E:\\Users\\user\\Documents\\NetBeansProjects\\knn\\dataset training.xls";
        File x = new File(alamat);

        try {
            Workbook dt = jxl.Workbook.getWorkbook(x);
            Sheet[] data = dt.getSheets();
            int jumlahbaris = data[0].getRows();
            int jumlahkolom = data[0].getColumns();
            
            instances = new double[jumlahbaris][jumlahkolom - 1];
            type = new String[jumlahbaris][jumlahkolom];
            System.out.println("Data Training\n");
            //panelHasil.("Data Training\n");
            for (int i = 0; i < jumlahbaris; i++) {
                for (int j = 0; j < jumlahkolom - 1; j++) {
                    instances[i][j] = Double.parseDouble(data[0].getCell(j, i).getContents());
                    System.out.print(instances[i][j] + "  ");
                    //textAreaHasil.setText(instances[i][j] + "  ");
                }
                System.out.println("");
            }
            for (int i = 0; i < jumlahbaris; i++) {
                type[i][jumlahkolom - 1] = data[0].getCell(jumlahkolom - 1, i).getContents();
            }

        } catch (Exception ex) {
            System.out.println("ERROR" + ex.getMessage());
        }
    }
    
    static void BacaDataTesting() {
        String alamat = "E:\\Users\\user\\Documents\\NetBeansProjects\\knn\\data testing.xls";
        File x = new File(alamat);

        try {
            Workbook dtTesting = jxl.Workbook.getWorkbook(x);
            Sheet[] dataUji = dtTesting.getSheets();
            int jumlahbaris = dataUji[0].getRows();
            int jumlahkolom = dataUji[0].getColumns();

            test = new double[jumlahbaris][jumlahkolom];
            System.out.println("Data Uji\n");
            for (int i = 0; i < jumlahbaris; i++) {
                for (int j = 0; j < jumlahkolom - 1; j++) {
                    test[i][j] = Double.parseDouble(dataUji[0].getCell(j, i).getContents());
                }
            }
        } catch (Exception ex) {
            System.out.println("ERROR" + ex.getMessage());
        }
    }
    
    private static String cariTetanggaTerbanyak(String[] array) {
        Set<String> h = new HashSet<String>(Arrays.asList(array));
        String[] uniqueValues = h.toArray(new String[0]);
        int[] counts = new int[uniqueValues.length];
        for (int i = 0; i < uniqueValues.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(uniqueValues[i])) {
                    counts[i]++;
                }
            }
        }

        for (int i = 0; i < uniqueValues.length; i++) {
            System.out.println(" " + uniqueValues[i] + " : " + counts[i]);
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }

        int max = counts[0];
        for (int counter = 1; counter < counts.length; counter++) {
            if (counts[counter] > max) {
                max = counts[counter];
            }
        }
        System.out.println("Max # of occurences : " + max);

        //how many time max appears
        int freq = 0;
        for (int counter = 0; counter < counts.length; counter++) {
            if (counts[counter] == max) {
                freq++;
            }
        }

        //index of most freq value if we have only one mode
        int index = -1;
        if (freq == 1) {
            for (int counter = 0; counter < counts.length; counter++) {
                if (counts[counter] == max) {
                    index = counter;
                    break;
                }
            }
            return uniqueValues[index];
        } else {// we have multiple modes
            int[] ix = new int[freq];//array of indices of modes (size freq)
            System.out.println("multiple majority classes : " + freq + " classes");
            int ixi = 0;
            for (int counter = 0; counter < counts.length; counter++) {
                if (counts[counter] == max) {
                    ix[ixi] = counter;
                    ixi++;
                }
            }

            for (int counter = 0; counter < ix.length; counter++) {
                System.out.println("class index: " + ix[counter]);
            }

            //now choose one at random
            Random generator = new Random();
            //get random 0 <= rIndex < size of ix
            int rIndex = generator.nextInt(ix.length);
            System.out.println("random Index: " + rIndex);
            int nIndex = ix[rIndex];
            return uniqueValues[nIndex];
        }
    }
    public static void prosesKNN() {
        BacaDataTraining();
        BacaDataTesting();
        System.out.println();
        int k = 15;
        
        List<Diabetes> diabetesList = new ArrayList<Diabetes>();
        List<Testing> testingList = new ArrayList<Testing>();
        List<Hasil> hasilList = new ArrayList<Hasil>();
        for (int i = 0; i < instances.length; i++) {
            diabetesList.add(new Diabetes(instances[i], type[i][8]));
        }
        for (int i = 0; i < test.length; i++) {
            testingList.add(new Testing(test[i], type[i][8]));
        }

        for (Testing testing : testingList) {
            for (int j = 0; j < testing.diabetesAttributes.length; j++) {
                System.out.print(" " + testing.diabetesAttributes[j]);
            }
            System.out.println();
        }
        System.out.println();

        //testing
        for (Testing dataPasien : testingList) {
            for (Diabetes diabet : diabetesList) {
                double dist = 0.0;
                for (int j = 0; j < diabet.diabetesAttributes.length; j++) {
                    dist += Math.pow(diabet.diabetesAttributes[j] - dataPasien.diabetesAttributes[j], 2);
                    System.out.print(diabet.diabetesAttributes[j] + " ");
                }
                double jarak = Math.sqrt(dist);
                hasilList.add(new Hasil(jarak, diabet.diabetesName));
                System.out.println(jarak);
            }
            Collections.sort(hasilList, new DistanceComparator());
            String[] str = new String[k];
            System.out.println("\nUrutan " + k + " data dengan distance terkecil");
            for (int x = 0; x < k; x++) {
                System.out.println(hasilList.get(x).jarak + "\t--->\t" + hasilList.get(x).diabetesType);
                str[x] = hasilList.get(x).diabetesType;
            }
            System.out.println("\n Total tiap kelas");
            String kelasTerbanyak = cariTetanggaTerbanyak(str);
            System.out.println("Data uji masuk ke kelas " + kelasTerbanyak);

            hasil.setText(kelasTerbanyak);
        }
    }
    
    static class Diabetes {

        double[] diabetesAttributes;
        String diabetesName;

        public Diabetes(double[] diabetesAttributes, String diabetesType) {
            this.diabetesAttributes = diabetesAttributes;
            this.diabetesName = diabetesType;
        }
    }

    static class Testing {

        double[] diabetesAttributes;
        String diabetesName;

        public Testing(double[] diabetesAttributes, String diabetesType) {
            this.diabetesAttributes = diabetesAttributes;
            this.diabetesName = diabetesType;
        }
    }

    static class Hasil {

        double jarak;
        String diabetesType;

        public Hasil(double jarak, String diabetesName) {
            this.jarak = jarak;
            this.diabetesType = diabetesName;
        }
    }

    static class DistanceComparator implements Comparator<Hasil> {

        public int compare(Hasil a, Hasil b) {
            return a.jarak < b.jarak ? -1 : a.jarak == b.jarak ? 0 : 1;
        }

    }
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pakar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JTextField f6;
    private javax.swing.JTextField f7;
    private javax.swing.JTextField f8;
    private static javax.swing.JLabel hasil;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lf1;
    private javax.swing.JLabel lf2;
    private javax.swing.JLabel lf3;
    private javax.swing.JLabel lf4;
    private javax.swing.JLabel lf5;
    private javax.swing.JLabel lf6;
    private javax.swing.JLabel lf7;
    private javax.swing.JLabel lf8;
    private javax.swing.JLabel nama;
    private static javax.swing.JScrollPane panelHasil;
    private static javax.swing.JTextArea textAreaHasil;
    private javax.swing.JButton tombolProses;
    private javax.swing.JButton tombolSimpan;
    // End of variables declaration//GEN-END:variables
}
