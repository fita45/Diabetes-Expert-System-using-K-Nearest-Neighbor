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

/**
 *
 * @author Rizka
 */
public class gejala extends javax.swing.JFrame {

    /**
     * Creates new form gejala
     */
    public gejala() {
        initComponents();
    }
    double f[] = new double[8]; 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lf1 = new javax.swing.JLabel();
        lf2 = new javax.swing.JLabel();
        lf3 = new javax.swing.JLabel();
        lf5 = new javax.swing.JLabel();
        lf4 = new javax.swing.JLabel();
        lf6 = new javax.swing.JLabel();
        lf7 = new javax.swing.JLabel();
        lf8 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        f7 = new javax.swing.JTextField();
        f8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        tombolProses = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GEJALA PASIEN");

        jLabel1.setText("Gejala:");

        jLabel2.setText("Nama Pasien");

        jLabel3.setText("ID Pasien");

        lf1.setText("Number of times pregnant");

        lf2.setText("Plasma glucose concentration");

        lf3.setText("Diastolic blood pressure");

        lf5.setText("2-Hour serum insulin ");

        lf4.setText("Triceps skin fold thickness");

        lf6.setText("Body mass index");

        lf7.setText("Diabetes pedigree function");

        lf8.setText("Age (years)");

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

        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });

        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });

        jLabel6.setText("Hasil");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tombolSimpan))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tombolProses))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lf7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f1)
                            .addComponent(lf1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lf3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lf4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lf5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lf6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lf7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lf8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolProses)
                    .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        
    }//GEN-LAST:event_f5ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        
    }//GEN-LAST:event_f6ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        
    }//GEN-LAST:event_f7ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed
        
    }//GEN-LAST:event_f8ActionPerformed

    private void tombolProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolProsesActionPerformed
        f[0] = Double.parseDouble(f1.getText());
        f[1] = Double.parseDouble(f2.getText());
        f[2] = Double.parseDouble(f3.getText());
        f[3] = Double.parseDouble(f4.getText());
        f[4] = Double.parseDouble(f5.getText());
        f[5] = Double.parseDouble(f6.getText());
        f[6] = Double.parseDouble(f7.getText());
        f[7] = Double.parseDouble(f8.getText());
        BacaDataTraining();
    }//GEN-LAST:event_tombolProsesActionPerformed

    static double[][] instances;
    static double[][] test;
    static String[][] type;

    static void BacaDataTraining() {
        String alamat = "E:\\Users\\user\\Documents\\NetBeansProjects\\knn\\data/dataset training.xls";
        File x = new File(alamat);

        try {
            Workbook dt = jxl.Workbook.getWorkbook(x);
            Sheet[] data = dt.getSheets();
            int jumlahbaris = data[0].getRows();
            int jumlahkolom = data[0].getColumns();

            instances = new double[jumlahbaris][jumlahkolom - 1];
            type = new String[jumlahbaris][jumlahkolom];
            System.out.println("Data Training\n");
            for (int i = 0; i < jumlahbaris; i++) {
                for (int j = 0; j < jumlahkolom - 1; j++) {
                    instances[i][j] = Double.parseDouble(data[0].getCell(j, i).getContents());
                    System.out.print(instances[i][j] + "  ");
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
    
//    static void BacaDataTesting() {
//        String alamat = "D:\\Data Rizka (2)\\1. Semester 6\\sispak\\KODINGAN BUAT SISPAK\\KNN\\data/Test.xls";
//        File x = new File(alamat);
//
//        try {
//            Workbook ilpd = jxl.Workbook.getWorkbook(x);
//            Sheet[] dataUji = ilpd.getSheets();
//            int jumlahbaris = dataUji[0].getRows();
//            int jumlahkolom = dataUji[0].getColumns();
//
//            test = new double[jumlahbaris][jumlahkolom - 1];
//            System.out.println("Data Uji\n");
//            for (int i = 0; i < jumlahbaris; i++) {
//                for (int j = 0; j < jumlahkolom - 1; j++) {
//                    test[i][j] = Double.parseDouble(dataUji[0].getCell(j, i).getContents());
//                    //System.out.print(test[i][j] + "  ");
//                }
//                //System.out.println("");
//            }
//        } catch (Exception ex) {
//            System.out.println("ERROR" + ex.getMessage());
//        }
//    }
    
    private static String findMajorityClass(String[] array) {
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
    public static void hitungJarak() {
        BacaDataTraining();
        //BacaDataTesting();
        System.out.println();
        int k = 15;
        {
            List<Diabetes> diabetesList = new ArrayList<Diabetes>();
            List<Testing> testingList = new ArrayList<Testing>();
            List<Hasil> hasilList = new ArrayList<Hasil>();
            for (int i = 0; i < instances.length; i++) {
                diabetesList.add(new Diabetes(instances[i], type[i][8]));
            }
            for (int i = 0; i < test.length; i++) {
                testingList.add(new Testing(test[i], type[i][8]));
            }
            for (Testing diabetes : testingList) {
                for (int j = 0; j < diabetes.testingAttributes.length; j++) {
                    System.out.print(" " + diabetes.testingAttributes[j]);
                }
                System.out.println();
            }
            System.out.println();

            //testing
            for (Testing dataPasien: testingList ) {
                for (Diabetes diabet : diabetesList) {
                    double dist = 0.0;
                    for (int j = 0; j < diabet.diabetesAttributes.length; j++) {
                        dist += Math.pow(diabet.diabetesAttributes[j] - dataPasien.testingAttributes[j], 2);
                        System.out.print(dataPasien.testingAttributes[j] + " ");
                    }
                    double jarak = Math.sqrt(dist);
                    hasilList.add(new Hasil(jarak, diabet.diabetesName));
                    System.out.println(jarak);
                }
                Collections.sort(hasilList, new DistanceComparator());
                String[] str = new String[k];
                for (int x = 0; x < k; x++) {
                    System.out.println(hasilList.get(x).diabetesType + "...." + hasilList.get(x).jarak);
                    str[x] = hasilList.get(x).diabetesType;
                }
                String majClass = findMajorityClass(str);
                System.out.println("Class of new instance is " + majClass);
            }
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

        double[] testingAttributes;
        String testingName;

        public Testing(double[] testingAttributes, String testingType) {
            this.testingAttributes = testingAttributes;
            this.testingName = testingType;
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
            java.util.logging.Logger.getLogger(gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gejala().setVisible(true);
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
    private javax.swing.JLabel hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lf1;
    private javax.swing.JLabel lf2;
    private javax.swing.JLabel lf3;
    private javax.swing.JLabel lf4;
    private javax.swing.JLabel lf5;
    private javax.swing.JLabel lf6;
    private javax.swing.JLabel lf7;
    private javax.swing.JLabel lf8;
    private javax.swing.JButton tombolProses;
    private javax.swing.JButton tombolSimpan;
    // End of variables declaration//GEN-END:variables
}
