/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author adesuryansyah
 */
public class ViewDesktop extends javax.swing.JFrame {

    ViewPengguna opengguna;
    ViewDiagnosa odiagnosa;
    ViewPemeriksaan opemeriksaan;
    ViewTarget otarget;
    ViewLearning olearning;
    /**
     * Creates new form desktop
     */
    public ViewDesktop() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        opengguna = new ViewPengguna();
        odiagnosa = new ViewDiagnosa();
        opemeriksaan = new ViewPemeriksaan();
        otarget = new ViewTarget();
        olearning = new ViewLearning();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnPengguna = new javax.swing.JButton();
        btnLearning = new javax.swing.JButton();
        btnTarget = new javax.swing.JButton();
        btnPemeriksaan = new javax.swing.JButton();
        btnDiagnosa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        mainDesktop.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM PAKAR DIAGNOSA PENYAKIT IKAN BAWAL BINTANG");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnPengguna.setBackground(new java.awt.Color(255, 153, 51));
        btnPengguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPengguna.setForeground(new java.awt.Color(255, 255, 255));
        btnPengguna.setText("PENGGUNA");
        btnPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenggunaActionPerformed(evt);
            }
        });

        btnLearning.setBackground(new java.awt.Color(255, 153, 51));
        btnLearning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLearning.setForeground(new java.awt.Color(255, 255, 255));
        btnLearning.setText("DATA LEARNING");
        btnLearning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearningActionPerformed(evt);
            }
        });

        btnTarget.setBackground(new java.awt.Color(255, 153, 51));
        btnTarget.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTarget.setForeground(new java.awt.Color(255, 255, 255));
        btnTarget.setText("DATA TARGET");
        btnTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTargetActionPerformed(evt);
            }
        });

        btnPemeriksaan.setBackground(new java.awt.Color(255, 153, 51));
        btnPemeriksaan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPemeriksaan.setForeground(new java.awt.Color(255, 255, 255));
        btnPemeriksaan.setText("DATA PEMERIKSAAN");
        btnPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemeriksaanActionPerformed(evt);
            }
        });

        btnDiagnosa.setBackground(new java.awt.Color(255, 153, 51));
        btnDiagnosa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDiagnosa.setForeground(new java.awt.Color(255, 255, 255));
        btnDiagnosa.setText("DIAGNOSA");
        btnDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPemeriksaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTarget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDiagnosa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnPemeriksaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTarget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLearning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainDesktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenggunaActionPerformed
       if(!opengguna.getVisible() && !opengguna.isShowing()){
           opengguna = new ViewPengguna();
           mainDesktop.add(opengguna);
           Dimension parentSize = mainDesktop.getSize();
           Dimension childSize = odiagnosa.getSize();
           opengguna.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
           opengguna.setVisible(true);
       }else{
           try {
               opengguna.setSelected(true);
               opengguna.getDesktopPane().getDesktopManager().deiconifyFrame(opengguna);
               opengguna.getDesktopPane().getDesktopManager().maximizeFrame(opengguna);
               opengguna.getDesktopPane().getDesktopManager().minimizeFrame(opengguna);
               opengguna.moveToFront();
           } catch (PropertyVetoException e) {
               Logger.getLogger(ViewDesktop.class.getName()).log(Level.SEVERE, null, e);
           }
       }
    }//GEN-LAST:event_btnPenggunaActionPerformed

    private void btnDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosaActionPerformed
        if(!odiagnosa.getVisible() && !odiagnosa.isShowing()){
           odiagnosa = new ViewDiagnosa();
           mainDesktop.add(odiagnosa);
           Dimension parentSize = mainDesktop.getSize();
           Dimension childSize = odiagnosa.getSize();
           odiagnosa.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
           odiagnosa.setVisible(true);
       }else{
           try {
               odiagnosa.setSelected(true);
               odiagnosa.getDesktopPane().getDesktopManager().deiconifyFrame(odiagnosa);
               odiagnosa.getDesktopPane().getDesktopManager().maximizeFrame(odiagnosa);
               odiagnosa.getDesktopPane().getDesktopManager().minimizeFrame(odiagnosa);
               odiagnosa.moveToFront();     
           } catch (PropertyVetoException e) {
               Logger.getLogger(ViewDesktop.class.getName()).log(Level.SEVERE, null, e);
           }
       }
    }//GEN-LAST:event_btnDiagnosaActionPerformed

    private void btnTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTargetActionPerformed
        if(!otarget.getVisible() && !otarget.isShowing()){
           otarget = new ViewTarget();
           mainDesktop.add(otarget);
           Dimension parentSize = mainDesktop.getSize();
           Dimension childSize = otarget.getSize();
           otarget.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
           otarget.setVisible(true);
       }else{
           try {
               otarget.setSelected(true);
               otarget.getDesktopPane().getDesktopManager().deiconifyFrame(otarget);
               otarget.getDesktopPane().getDesktopManager().maximizeFrame(otarget);
               otarget.getDesktopPane().getDesktopManager().minimizeFrame(otarget);
               otarget.moveToFront();
              
           } catch (PropertyVetoException e) {
               Logger.getLogger(ViewDesktop.class.getName()).log(Level.SEVERE, null, e);
           }
       }
    }//GEN-LAST:event_btnTargetActionPerformed

    private void btnPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemeriksaanActionPerformed
        if(!opemeriksaan.getVisible() && !opemeriksaan.isShowing()){
           opemeriksaan = new ViewPemeriksaan();
           mainDesktop.add(opemeriksaan);
           Dimension parentSize = mainDesktop.getSize();
           Dimension childSize = opemeriksaan.getSize();
           opemeriksaan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
           opemeriksaan.setVisible(true);
       }else{
           try {
               opemeriksaan.setSelected(true);
               opemeriksaan.getDesktopPane().getDesktopManager().deiconifyFrame(opemeriksaan);
               opemeriksaan.getDesktopPane().getDesktopManager().maximizeFrame(opemeriksaan);
               opemeriksaan.getDesktopPane().getDesktopManager().minimizeFrame(opemeriksaan);
               opemeriksaan.moveToFront();
              
           } catch (PropertyVetoException e) {
               Logger.getLogger(ViewDesktop.class.getName()).log(Level.SEVERE, null, e);
           }
       }
    }//GEN-LAST:event_btnPemeriksaanActionPerformed

    private void btnLearningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearningActionPerformed
        if(!olearning.getVisible() && !olearning.isShowing()){
           olearning = new ViewLearning();
           mainDesktop.add(olearning);
           Dimension parentSize = mainDesktop.getSize();
           Dimension childSize = olearning.getSize();
           olearning.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
           olearning.setVisible(true);
       }else{
           try {
               olearning.setSelected(true);
               olearning.getDesktopPane().getDesktopManager().deiconifyFrame(olearning);
               olearning.getDesktopPane().getDesktopManager().maximizeFrame(olearning);
               olearning.getDesktopPane().getDesktopManager().minimizeFrame(olearning);
               olearning.moveToFront();
              
           } catch (PropertyVetoException e) {
               Logger.getLogger(ViewDesktop.class.getName()).log(Level.SEVERE, null, e);
           }
       }
    }//GEN-LAST:event_btnLearningActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnosa;
    private javax.swing.JButton btnLearning;
    private javax.swing.JButton btnPemeriksaan;
    private javax.swing.JButton btnPengguna;
    private javax.swing.JButton btnTarget;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane mainDesktop;
    // End of variables declaration//GEN-END:variables
}