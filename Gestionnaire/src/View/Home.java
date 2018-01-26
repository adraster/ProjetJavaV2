/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.ManageData;
import Controler.ManageMission;
import Controler.ManagePerson;
import Controler.ManageSkill;
import Model.Company;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author corentin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPrincipal = new javax.swing.JPanel();
        Entete = new javax.swing.JPanel();
        nameApplication = new javax.swing.JLabel();
        Corps = new javax.swing.JPanel();
        Cards = new javax.swing.JPanel();
        cardPerson = new javax.swing.JPanel();
        imageCardPerson = new javax.swing.JLabel();
        cardSkill = new javax.swing.JPanel();
        cardMission = new javax.swing.JPanel();
        viewAddPerson = new javax.swing.JPanel();
        EnteteAddPerson = new javax.swing.JPanel();
        labelAddPerson = new javax.swing.JLabel();
        corpAddPerson = new javax.swing.JPanel();
        addAllinput = new javax.swing.JPanel();
        allButtons = new javax.swing.JPanel();
        jPanelReturn = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Entete.setBackground(new java.awt.Color(45, 118, 232));

        nameApplication.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        nameApplication.setForeground(java.awt.Color.white);
        nameApplication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameApplication.setText("Gestionnaire");

        javax.swing.GroupLayout EnteteLayout = new javax.swing.GroupLayout(Entete);
        Entete.setLayout(EnteteLayout);
        EnteteLayout.setHorizontalGroup(
            EnteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EnteteLayout.setVerticalGroup(
            EnteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Corps.setBackground(java.awt.Color.white);

        Cards.setBackground(java.awt.Color.white);

        cardPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardPersonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardPersonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardPersonMouseExited(evt);
            }
        });

        imageCardPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cardPersonLayout = new javax.swing.GroupLayout(cardPerson);
        cardPerson.setLayout(cardPersonLayout);
        cardPersonLayout.setHorizontalGroup(
            cardPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageCardPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardPersonLayout.setVerticalGroup(
            cardPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageCardPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardSkill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardSkillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardSkillMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cardSkillLayout = new javax.swing.GroupLayout(cardSkill);
        cardSkill.setLayout(cardSkillLayout);
        cardSkillLayout.setHorizontalGroup(
            cardSkillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        cardSkillLayout.setVerticalGroup(
            cardSkillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        cardMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMissionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cardMissionLayout = new javax.swing.GroupLayout(cardMission);
        cardMission.setLayout(cardMissionLayout);
        cardMissionLayout.setHorizontalGroup(
            cardMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        cardMissionLayout.setVerticalGroup(
            cardMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CardsLayout = new javax.swing.GroupLayout(Cards);
        Cards.setLayout(CardsLayout);
        CardsLayout.setHorizontalGroup(
            CardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardsLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(cardPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(cardSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(cardMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        CardsLayout.setVerticalGroup(
            CardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardsLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(CardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout CorpsLayout = new javax.swing.GroupLayout(Corps);
        Corps.setLayout(CorpsLayout);
        CorpsLayout.setHorizontalGroup(
            CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CorpsLayout.setVerticalGroup(
            CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ViewPrincipalLayout = new javax.swing.GroupLayout(ViewPrincipal);
        ViewPrincipal.setLayout(ViewPrincipalLayout);
        ViewPrincipalLayout.setHorizontalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Corps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewPrincipalLayout.setVerticalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addComponent(Entete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Corps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewAddPerson.setBackground(java.awt.Color.white);

        EnteteAddPerson.setBackground(new java.awt.Color(45, 118, 232));

        labelAddPerson.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        labelAddPerson.setForeground(java.awt.Color.white);
        labelAddPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPerson.setText("Ajouter une personne");

        javax.swing.GroupLayout EnteteAddPersonLayout = new javax.swing.GroupLayout(EnteteAddPerson);
        EnteteAddPerson.setLayout(EnteteAddPersonLayout);
        EnteteAddPersonLayout.setHorizontalGroup(
            EnteteAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        EnteteAddPersonLayout.setVerticalGroup(
            EnteteAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        corpAddPerson.setBackground(java.awt.Color.white);

        addAllinput.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout addAllinputLayout = new javax.swing.GroupLayout(addAllinput);
        addAllinput.setLayout(addAllinputLayout);
        addAllinputLayout.setHorizontalGroup(
            addAllinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        addAllinputLayout.setVerticalGroup(
            addAllinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        allButtons.setBackground(java.awt.Color.white);

        jPanelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelReturnMouseExited(evt);
            }
        });

        jLabelReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelReturnLayout = new javax.swing.GroupLayout(jPanelReturn);
        jPanelReturn.setLayout(jPanelReturnLayout);
        jPanelReturnLayout.setHorizontalGroup(
            jPanelReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReturnLayout.setVerticalGroup(
            jPanelReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReturnLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabelReturn)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout allButtonsLayout = new javax.swing.GroupLayout(allButtons);
        allButtons.setLayout(allButtonsLayout);
        allButtonsLayout.setHorizontalGroup(
            allButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        allButtonsLayout.setVerticalGroup(
            allButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout corpAddPersonLayout = new javax.swing.GroupLayout(corpAddPerson);
        corpAddPerson.setLayout(corpAddPersonLayout);
        corpAddPersonLayout.setHorizontalGroup(
            corpAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpAddPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAllinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        corpAddPersonLayout.setVerticalGroup(
            corpAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpAddPersonLayout.createSequentialGroup()
                .addComponent(addAllinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout viewAddPersonLayout = new javax.swing.GroupLayout(viewAddPerson);
        viewAddPerson.setLayout(viewAddPersonLayout);
        viewAddPersonLayout.setHorizontalGroup(
            viewAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EnteteAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(corpAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewAddPersonLayout.setVerticalGroup(
            viewAddPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAddPersonLayout.createSequentialGroup()
                .addComponent(EnteteAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corpAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(viewAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(viewAddPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardPersonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPersonMouseEntered
        evt.getComponent().setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_cardPersonMouseEntered

    private void cardPersonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPersonMouseExited
        evt.getComponent().setBackground(new Color(224,224,224));
    }//GEN-LAST:event_cardPersonMouseExited

    private void cardSkillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSkillMouseEntered
        evt.getComponent().setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_cardSkillMouseEntered

    private void cardSkillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSkillMouseExited
        evt.getComponent().setBackground(new Color(224,224,224));
    }//GEN-LAST:event_cardSkillMouseExited

    private void cardMissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardMissionMouseEntered
        evt.getComponent().setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_cardMissionMouseEntered

    private void cardMissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardMissionMouseExited
        evt.getComponent().setBackground(new Color(224,224,224));
    }//GEN-LAST:event_cardMissionMouseExited

    private void cardPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPersonMouseClicked
        this.setContentPane(viewAddPerson);
        this.invalidate();
        this.validate();    
    }//GEN-LAST:event_cardPersonMouseClicked

    private void jPanelReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReturnMouseEntered
        evt.getComponent().setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jPanelReturnMouseEntered

    private void jPanelReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReturnMouseExited
       evt.getComponent().setBackground(new Color(224,224,224));
    }//GEN-LAST:event_jPanelReturnMouseExited

    private void jPanelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReturnMouseClicked
        this.setContentPane(ViewPrincipal);
        this.invalidate();
        this.validate(); 
    }//GEN-LAST:event_jPanelReturnMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                Company myCompany = new Company();
                //Recharger les personnes en premier
                ManageData mPerson = new ManagePerson();
                mPerson.readData(myCompany);
                //myCompany.displayPerson();

                //Recharger les competences et les redistribuer correctement
                ManageData mySkill = new ManageSkill();
                mySkill.readData(myCompany);
                //myCompany.displaySkills();

                // Réafecter tous les projets aux bonnes personnes
                ManageData mMission = new ManageMission();
                mMission.readData(myCompany);
                myCompany.displayMissions();
                //myCompany.displayPerson();
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cards;
    private javax.swing.JPanel Corps;
    private javax.swing.JPanel Entete;
    private javax.swing.JPanel EnteteAddPerson;
    private javax.swing.JPanel ViewPrincipal;
    private javax.swing.JPanel addAllinput;
    private javax.swing.JPanel allButtons;
    private javax.swing.JPanel cardMission;
    private javax.swing.JPanel cardPerson;
    private javax.swing.JPanel cardSkill;
    private javax.swing.JPanel corpAddPerson;
    private javax.swing.JLabel imageCardPerson;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelReturn;
    private javax.swing.JLabel labelAddPerson;
    private javax.swing.JLabel nameApplication;
    private javax.swing.JPanel viewAddPerson;
    // End of variables declaration//GEN-END:variables
}
