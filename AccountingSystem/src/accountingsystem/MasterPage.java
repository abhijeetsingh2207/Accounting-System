/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package accountingsystem;
import java.util.*;

/**
 *
 * @author Acer
 */
public class MasterPage extends javax.swing.JFrame {

    /**
     * Creates new form MasterPage
     */
    public MasterPage() {
        initComponents();
        setSize(500, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cmaster = new javax.swing.JMenu();
        pm = new javax.swing.JMenuItem();
        cm = new javax.swing.JMenuItem();
        puform = new javax.swing.JMenu();
        pform = new javax.swing.JMenuItem();
        sform = new javax.swing.JMenu();
        sforms = new javax.swing.JMenuItem();
        StockForm = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Rathore's Mart");

        cmaster.setText("Master Forms");
        cmaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmasterActionPerformed(evt);
            }
        });

        pm.setText("Product Master");
        pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmActionPerformed(evt);
            }
        });
        cmaster.add(pm);

        cm.setText("Customer Master");
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });
        cmaster.add(cm);

        jMenuBar1.add(cmaster);

        puform.setText("Purchase Forms");
        puform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puformActionPerformed(evt);
            }
        });

        pform.setText("PurchaseForm");
        pform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pformActionPerformed(evt);
            }
        });
        puform.add(pform);

        jMenuBar1.add(puform);

        sform.setText("Sales Forms");
        sform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sformActionPerformed(evt);
            }
        });

        sforms.setText("SellForm");
        sforms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sformsActionPerformed(evt);
            }
        });
        sform.add(sforms);

        jMenuBar1.add(sform);

        StockForm.setText("Stocks Report");

        jMenuItem1.setText("StockForm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        StockForm.add(jMenuItem1);

        jMenuBar1.add(StockForm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmActionPerformed
      
                    this.setVisible(false);
             ProductMaster.main(new String[2]);
           
                          
    }//GEN-LAST:event_pmActionPerformed

    private void cmasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmasterActionPerformed
       
        this.setVisible(false);
        CustomerMaster.main(new String[2]);
        
    }//GEN-LAST:event_cmasterActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    CustomerMaster.main(new String[2]);
    }//GEN-LAST:event_cmActionPerformed

    private void pformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pformActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PurchaseForm.main(new String[2]);
    }//GEN-LAST:event_pformActionPerformed

    private void puformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puformActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_puformActionPerformed

    private void sformsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sformsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SellForm.main(new String[2]);
     
    }//GEN-LAST:event_sformsActionPerformed

    private void sformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sformActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu StockForm;
    private javax.swing.JMenuItem cm;
    private javax.swing.JMenu cmaster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem pform;
    private javax.swing.JMenuItem pm;
    private javax.swing.JMenu puform;
    private javax.swing.JMenu sform;
    private javax.swing.JMenuItem sforms;
    // End of variables declaration//GEN-END:variables
}
