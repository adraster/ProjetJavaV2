/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import API.Company;
import Management.ManageData;
import Management.ManageMission;
import Management.ManagePerson;
import Management.ManageSkill;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

/**
 *
 * @author corentin
 */
public class MyFrame extends javax.swing.JFrame {
    
    ViewAddMission vaddm;
    ViewAllMission vallm;
    ViewAddPerson vaddp;
    ViewAllPerson vallp;
    ViewHome vh;
    /**
     * Creates new form MyFrame
     */
    public MyFrame() {
        loadData();
        initComponents();
        resizeFrame();
        vaddm = new ViewAddMission(this);
        vallm = new ViewAllMission(this);
        vaddp = new ViewAddPerson(this);
        vallp = new ViewAllPerson(this);
        vh = new ViewHome(this);
        this.add(vh);
        this.repaint();
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setPreferredSize(null);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resizeFrame(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        this.setMinimumSize(new Dimension((int)(rect.width)*1/3,500));
    }
    private void loadData() {
        Company myCompany = new Company();
        //Recharger les personnes en premier
        ManageData mPerson = new ManagePerson();
        mPerson.readData(myCompany);
        myCompany.displayPerson();

        //Recharger les competences et les redistribuer correctement
        ManageData mySkill = new ManageSkill();
        mySkill.readData(myCompany);
        //myCompany.displaySkills();

        // Réafecter tous les projets aux bonnes personnes
        ManageData mMission = new ManageMission();
        mMission.readData(myCompany);
        //myCompany.displayMissions();
        //myCompany.displayPerson();

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}