/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Interface;

import API.Company;
import API.Mission;
import API.Person;
import API.Requirement;
import API.Skill;
import GUI.Interface.SkillRenderer;
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

    public PersonDetail(Person personSelected, Company myCompany, home myFrame) {
        this.personSelected = personSelected;
        this.myCompany = myCompany;
        this.myFrame = myFrame;
        initComponents();

        jTextFieldLastName.setText(this.personSelected.getLastName());
        jTextFieldFirstName.setText(this.personSelected.getFirstName());
        jFormattedTextFieldHireDate.setValue(this.personSelected.getDateOfHire());
        jLabelErr.setText("");
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
        jList1 = new javax.swing.JList();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        DefaultListModel<Skill> skillModel = new DefaultListModel<Skill>();
        jListSkill = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        DefaultListModel<Mission> missionModel = new DefaultListModel<Mission>();
        jListMission = new javax.swing.JList<>();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabelErr = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(246, 246, 246));

        jPanelHeader5.setBackground(new java.awt.Color(101, 105, 138));

        jLabelTitle5.setFont(new java.awt.Font("Roboto", 0, 40));
        jLabelTitle5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle5.setText("Détails de la personne");

        jLabelReturn5.setFont(new java.awt.Font("Roboto", 0, 20));
        jLabelReturn5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/back_icon.png"))); // NOI18N
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
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextFieldFirstName)
                    .addComponent(jFormattedTextFieldHireDate))
                .addContainerGap())
        );
        jPanelLeftDetailLayout.setVerticalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addGap(107, 107, 107)
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
                .addContainerGap())
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanelRightDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRightDetail.setPreferredSize(new java.awt.Dimension(280, 280));

        jLabelSkill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSkill.setText("Compétences : ");

        jLabelOnMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelOnMission.setText("Missions attribuées :");

        jListSkill.setModel(skillModel);
        jListSkill.setCellRenderer(new SkillRenderer());

        HashMap<String,Skill> mySkillList= personSelected.getSkillList();

        Set entrySetSkill = mySkillList.entrySet();
        Iterator itSkill = entrySetSkill.iterator();

        while (itSkill.hasNext()) {

            Map.Entry me = (Map.Entry)itSkill.next();
            Skill myskill = mySkillList.get(me.getKey());
            skillModel.addElement(myskill);
        }
        jListSkill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSkill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListSkillMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jListSkill);

        jListMission.setModel(missionModel);
        jListMission.setCellRenderer(new MissionRenderer());
        jListMission.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListMission);

        javax.swing.GroupLayout jPanelRightDetailLayout = new javax.swing.GroupLayout(jPanelRightDetail);
        jPanelRightDetail.setLayout(jPanelRightDetailLayout);
        jPanelRightDetailLayout.setHorizontalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOnMission)
                    .addComponent(jLabelSkill))
                .addGap(18, 18, 18)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanelRightDetailLayout.setVerticalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSkill)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOnMission)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelContainerMissionLayout = new javax.swing.GroupLayout(jPanelContainerMission);
        jPanelContainerMission.setLayout(jPanelContainerMissionLayout);
        jPanelContainerMissionLayout.setHorizontalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRightDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelContainerMissionLayout.setVerticalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addComponent(jPanelRightDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addGap(32, 32, 32))
        );

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Modifier");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabelErr.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelErr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEdit)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSupprimer)
                    .addComponent(jButtonEdit)
                    .addComponent(jLabelErr))
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
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelReturn5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturn5MouseReleased
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new PersonList(myCompany, myFrame));
        myFrame.repaint();
        myFrame.revalidate();
    }//GEN-LAST:event_jLabelReturn5MouseReleased

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        if (personSelected.getNbMissions() == 0) { // SI la personne n'a pas de mission attribuée
            myCompany.listePerson.remove(myCompany.getKeyFromValue(myCompany.listePerson, personSelected));
        } else {
            jLabelErr.setText("Erreur : Impossible de supprimer une personne tant qu'elle a des missions attribuées.");
        }

        Management.ManagePerson mp = new ManagePerson();
        mp.writeData(myCompany);
        mp.readData(myCompany);
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new PersonList(myCompany, myFrame));
        myFrame.repaint();
        myFrame.revalidate();    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jListSkillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSkillMouseReleased

        Skill skillSelected = jListSkill.getSelectedValue();
        DefaultListModel<Mission> modelMission = (DefaultListModel<Mission>) jListMission.getModel();
        
        modelMission.removeAllElements();
        for (Map.Entry<Integer, Mission> entrySetM : myCompany.listeMission.entrySet()) { //Pour chaque mission
            Integer key = entrySetM.getKey();
            Mission m = entrySetM.getValue();

            HashMap<Integer, Requirement> listRequirement = m.getRequirements();

            if (m.getPersonOnMission().containsValue(personSelected)) { // SI la personne participe à la mission

                for (Map.Entry<Integer, Requirement> entrySetR : listRequirement.entrySet()) {
                    Integer keyR = entrySetR.getKey();
                    Requirement r = entrySetR.getValue();
                    if (r.getListPersonnes().contains(personSelected) && skillSelected.equals(r.getRequiredSkill())) { // on l'ajoute
                        modelMission.addElement(m);
                    }
                }
            }
        }
    }//GEN-LAST:event_jListSkillMouseReleased

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new EditPerson(personSelected,myCompany, myFrame));
        myFrame.repaint();
        myFrame.revalidate();
    }//GEN-LAST:event_jButtonEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JFormattedTextField jFormattedTextFieldHireDate;
    private javax.swing.JLabel jLabelErr;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelHireDate;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelOnMission;
    public javax.swing.JLabel jLabelReturn5;
    private javax.swing.JLabel jLabelSkill;
    public javax.swing.JLabel jLabelTitle5;
    private javax.swing.JList jList1;
    private javax.swing.JList<Mission> jListMission;
    private javax.swing.JList<Skill> jListSkill;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContainerMission;
    private javax.swing.JPanel jPanelHeader5;
    private javax.swing.JPanel jPanelLeftDetail;
    private javax.swing.JPanel jPanelRightDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
