/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Company;
import API.Mission;
import API.Person;
import API.Skill;
import Management.ManageMission;
import Management.ManagePerson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author corentin
 */
public class PersonDetail extends javax.swing.JPanel {

    /**
     * Creates new form PersonDetail
     */
    private Company myCompany;
    private home myFrame;
    private Person personSelected;
    public PersonDetail(Person personSelected,Company myCompany,home myFrame) {
        this.personSelected = personSelected;
        this.myCompany=myCompany;
        this.myFrame=myFrame;
        initComponents();
        
        jTextFieldLastName.setText(this.personSelected.getLastName());
        jTextFieldFirstName.setText(this.personSelected.getFirstName());
        jFormattedTextFieldHireDate.setValue(this.personSelected.getDateOfHire());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader5 = new javax.swing.JPanel();
        jLabelTitle5 = new javax.swing.JLabel();
        jLabelReturn5 = new javax.swing.JLabel();
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
        DefaultComboBoxModel<Mission> missionModel = new DefaultComboBoxModel();
        jComboBoxSkill = new javax.swing.JComboBox<>();
        DefaultComboBoxModel<Skill> skillModel = new DefaultComboBoxModel();
        jComboBoxSkill1 = new javax.swing.JComboBox<>();
        jButtonSupprimer = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 246, 246));

        jPanelHeader5.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitle5.setFont(new java.awt.Font("Roboto", 0, 40));
        jLabelTitle5.setForeground(new java.awt.Color(48, 51, 58));
        jLabelTitle5.setText("Détails de la personne");

        jLabelReturn5.setFont(new java.awt.Font("Roboto", 0, 20));
        jLabelReturn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ic_arrow_back_black_48dp.png"))); // NOI18N
        jLabelReturn5.setText("Retour");
        jLabelReturn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelReturn5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeader5Layout = new javax.swing.GroupLayout(jPanelHeader5);
        jPanelHeader5.setLayout(jPanelHeader5Layout);
        jPanelHeader5Layout.setHorizontalGroup(
            jPanelHeader5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeader5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jLabelTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(178, 178, 178))
        );
        jPanelHeader5Layout.setVerticalGroup(
            jPanelHeader5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeader5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeader5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelReturn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        jTextFieldLastName.setEditable(false);

        jTextFieldFirstName.setEditable(false);

        jFormattedTextFieldHireDate.setEditable(false);
        jFormattedTextFieldHireDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        jFormattedTextFieldHireDate.setEditable(false);

        javax.swing.GroupLayout jPanelLeftDetailLayout = new javax.swing.GroupLayout(jPanelLeftDetail);
        jPanelLeftDetail.setLayout(jPanelLeftDetailLayout);
        jPanelLeftDetailLayout.setHorizontalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelHireDate))
                .addGap(31, 31, 31)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jTextFieldFirstName)
                    .addComponent(jFormattedTextFieldHireDate))
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
        jLabelSkill.setText("Compétences : ");

        jLabelOnMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelOnMission.setText("Missions attribuées :");

        jComboBoxSkill.setMaximumRowCount(20);
        jComboBoxSkill.setModel(missionModel);
        jComboBoxSkill.setRenderer(new GUI.NouvelleInterface.MissionRenderer());

        HashMap<Integer,Mission> myMissionList= myCompany.listeMission;

        Set entrySetMission = myMissionList.entrySet();
        Iterator itMission = entrySetMission.iterator();

        while (itMission.hasNext()) {

            Map.Entry me = (Map.Entry)itMission.next();
            Mission myMission = myMissionList.get(me.getKey());

            if(myMission.getPersonOnMission().containsValue(personSelected)){
                missionModel.addElement(myMission);
            }
        }
        jComboBoxSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSkillActionPerformed(evt);
            }
        });

        jComboBoxSkill1.setMaximumRowCount(20);
        jComboBoxSkill1.setModel(skillModel);
        jComboBoxSkill1.setRenderer(new GUI.NouvelleInterface.SkillRenderer());

        HashMap<String,Skill> mySkillList= personSelected.getSkillList();

        Set entrySetSkill = mySkillList.entrySet();
        Iterator itSkill = entrySetSkill.iterator();

        while (itSkill.hasNext()) {

            Map.Entry me = (Map.Entry)itSkill.next();
            Skill myskill = mySkillList.get(me.getKey());
            skillModel.addElement(myskill);
        }
        jComboBoxSkill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSkill1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRightDetailLayout = new javax.swing.GroupLayout(jPanelRightDetail);
        jPanelRightDetail.setLayout(jPanelRightDetailLayout);
        jPanelRightDetailLayout.setHorizontalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSkill)
                    .addComponent(jLabelOnMission))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxSkill1, 0, 154, Short.MAX_VALUE)
                    .addComponent(jComboBoxSkill, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanelRightDetailLayout.setVerticalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOnMission)
                    .addComponent(jComboBoxSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSkill1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSkill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContainerMissionLayout = new javax.swing.GroupLayout(jPanelContainerMission);
        jPanelContainerMission.setLayout(jPanelContainerMissionLayout);
        jPanelContainerMissionLayout.setHorizontalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRightDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelContainerMissionLayout.setVerticalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .addComponent(jPanelRightDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSupprimer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSupprimer)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelReturn5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturn5MouseReleased
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new PersonList(myCompany,myFrame));
        myFrame.repaint();
        myFrame.revalidate();
    }//GEN-LAST:event_jLabelReturn5MouseReleased

    private void jComboBoxSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSkillActionPerformed
        //Recuperer l'id de l'element selectioné
        int elt = jComboBoxSkill.getSelectedIndex();
        //Creation du model de skill
        DefaultListModel<Skill> modelSkill = new DefaultListModel();
        // Recuperer les skills
        HashMap<String, Skill> skillList = personSelected.getSkillList();
        
        //jScrollPane1.setViewportView(modelSkill);
    }//GEN-LAST:event_jComboBoxSkillActionPerformed

    private void jComboBoxSkill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSkill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSkill1ActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        if(personSelected.getNbMissions() == 0){ // SI la personne a des missions attribuées
            myCompany.listePerson.remove(myCompany.getKeyFromValue(myCompany.listePerson, personSelected));
        }
        
        Management.ManagePerson mp = new ManagePerson();
        mp.writeData(myCompany);
        mp.readData(myCompany);
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new PersonList(myCompany,myFrame));
        myFrame.repaint();
        myFrame.revalidate();    }//GEN-LAST:event_jButtonSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JComboBox<Mission> jComboBoxSkill;
    private javax.swing.JComboBox<Skill> jComboBoxSkill1;
    private javax.swing.JFormattedTextField jFormattedTextFieldHireDate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelHireDate;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelOnMission;
    public javax.swing.JLabel jLabelReturn5;
    private javax.swing.JLabel jLabelSkill;
    public javax.swing.JLabel jLabelTitle5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContainerMission;
    private javax.swing.JPanel jPanelHeader5;
    private javax.swing.JPanel jPanelLeftDetail;
    private javax.swing.JPanel jPanelRightDetail;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
