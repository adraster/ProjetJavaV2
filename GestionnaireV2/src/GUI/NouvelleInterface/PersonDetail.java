/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Requirement;
import API.Skill;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author corentin
 */
public class PersonDetail extends javax.swing.JPanel {

    /**
     * Creates new form PersonDetail
     */
    public PersonDetail() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanelContainerMission = new javax.swing.JPanel();
        jPanelLeftDetail = new javax.swing.JPanel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelHireDate = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jFormattedTextFieldHireDate = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelRightDetail = new javax.swing.JPanel();
        jLabelSkill = new javax.swing.JLabel();
        jLabelOnMission = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));

        jPanelContainerMission.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContainerMission.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelLeftDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLeftDetail.setPreferredSize(new java.awt.Dimension(280, 424));

        jLabelLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLastName.setText("Nom :");

        jLabelHireDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHireDate.setText("Date d'embauche :");

        jLabelFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFirstName.setText("Prénom :");

        jFormattedTextFieldHireDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        javax.swing.GroupLayout jPanelLeftDetailLayout = new javax.swing.GroupLayout(jPanelLeftDetail);
        jPanelLeftDetail.setLayout(jPanelLeftDetailLayout);
        jPanelLeftDetailLayout.setHorizontalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirstName)
                            .addComponent(jLabelLastName))
                        .addGap(91, 91, 91)
                        .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLastName)
                            .addComponent(jTextFieldFirstName)))
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addComponent(jLabelHireDate)
                        .addGap(51, 51, 51)
                        .addComponent(jFormattedTextFieldHireDate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLeftDetailLayout.setVerticalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHireDate)
                    .addComponent(jFormattedTextFieldHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanelRightDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRightDetail.setPreferredSize(new java.awt.Dimension(280, 280));

        jLabelSkill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSkill.setText("Compétences");

        jLabelOnMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelOnMission.setText("Sur Missions :");

        javax.swing.GroupLayout jPanelRightDetailLayout = new javax.swing.GroupLayout(jPanelRightDetail);
        jPanelRightDetail.setLayout(jPanelRightDetailLayout);
        jPanelRightDetailLayout.setHorizontalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelSkill)
                .addGap(0, 239, Short.MAX_VALUE))
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOnMission)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelRightDetailLayout.setVerticalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabelSkill)
                .addGap(102, 102, 102)
                .addComponent(jLabelOnMission)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContainerMissionLayout = new javax.swing.GroupLayout(jPanelContainerMission);
        jPanelContainerMission.setLayout(jPanelContainerMissionLayout);
        jPanelContainerMissionLayout.setHorizontalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRightDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelContainerMissionLayout.setVerticalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addComponent(jPanelRightDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldHireDate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelHireDate;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelOnMission;
    private javax.swing.JLabel jLabelSkill;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContainerMission;
    private javax.swing.JPanel jPanelLeftDetail;
    private javax.swing.JPanel jPanelRightDetail;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
