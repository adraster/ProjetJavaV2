/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Mission;
import API.Person;
import API.Requirement;
import API.Skill;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author corentin
 */
public class MissionDetail extends javax.swing.JPanel {

    /**
     * Creates new form MissionDetail
     */
    private Mission myMission;
    
    public MissionDetail(Mission myMission) {
        this.myMission = myMission;
        initComponents();
        jTextFieldNameMission.setText(myMission.getMissionName());
        jFormattedTextFieldFireDate.setValue(myMission.getStartDate());
        jTextFieldDurationMission.setText(""+myMission.getMissionDuration());
        jTextFieldNbPersonMission.setText(""+myMission.getNbTotalPerson());
        jTextFieldStateMission.setText(""+myMission.getEtat());
        jProgressBar1.setBorderPainted(true);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(Color.lightGray));
        jProgressBar1.setUI(new BasicProgressBarUI() {
            protected Color getSelectionBackground() { return Color.black; }
            protected Color getSelectionForeground() { return Color.black; }
        });
        switch(myMission.getEtat()){
            case enPreparation:
                jProgressBar1.setValue(25);
                jProgressBar1.setForeground(new Color(255,102,102));
                jProgressBar1.setBackground(Color.white);
                break;
            case plannifiee:
                jProgressBar1.setValue(50);
                jProgressBar1.setForeground(new Color(255,255,153));
                jProgressBar1.setBackground(Color.white);
                break;
            case enCours:
                jProgressBar1.setValue(75);
                jProgressBar1.setForeground(new Color(229,255,204));
                jProgressBar1.setBackground(Color.white);
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContainerMission = new javax.swing.JPanel();
        jPanelLeftDetail = new javax.swing.JPanel();
        jLabelNameMission = new javax.swing.JLabel();
        jLabelFireDateMission = new javax.swing.JLabel();
        jLabelDurationMission = new javax.swing.JLabel();
        jLabelNbPersonMission = new javax.swing.JLabel();
        jLabelStateMission = new javax.swing.JLabel();
        jTextFieldNameMission = new javax.swing.JTextField();
        jTextFieldDurationMission = new javax.swing.JTextField();
        jTextFieldNbPersonMission = new javax.swing.JTextField();
        jTextFieldStateMission = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelProgression = new javax.swing.JLabel();
        jFormattedTextFieldFireDate = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelRightDetail = new javax.swing.JPanel();
        jLabelSkill = new javax.swing.JLabel();
        jLabelnbPeronSkill = new javax.swing.JLabel();
        jTextFieldNbPersonSkill = new javax.swing.JTextField();
        jLabelPerson = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        int elt = 0;
        jListPerson = new javax.swing.JList<Person>();
        DefaultComboBoxModel<Skill> skillModel = new DefaultComboBoxModel();
        jComboBoxSkill = new javax.swing.JComboBox<Skill>();
        jPanelHeader2 = new javax.swing.JPanel();
        jLabelTitle2 = new javax.swing.JLabel();
        jLabelReturn2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));

        jPanelContainerMission.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContainerMission.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelLeftDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLeftDetail.setPreferredSize(new java.awt.Dimension(280, 424));

        jLabelNameMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNameMission.setText("Nom de la mission :");

        jLabelFireDateMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFireDateMission.setText("Date de début :");

        jLabelDurationMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDurationMission.setText("Durée :");

        jLabelNbPersonMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNbPersonMission.setText("Nombre de personnes :");

        jLabelStateMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelStateMission.setText("Etat de la mission :");

        jTextFieldNameMission.setEditable(false);

        jTextFieldDurationMission.setEditable(false);

        jTextFieldNbPersonMission.setEditable(false);

        jTextFieldStateMission.setEditable(false);

        jLabelProgression.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProgression.setText("Avancement :");

        jFormattedTextFieldFireDate.setEditable(false);
        jFormattedTextFieldFireDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        javax.swing.GroupLayout jPanelLeftDetailLayout = new javax.swing.GroupLayout(jPanelLeftDetail);
        jPanelLeftDetail.setLayout(jPanelLeftDetailLayout);
        jPanelLeftDetailLayout.setHorizontalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addComponent(jLabelProgression)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNbPersonMission)
                            .addComponent(jLabelStateMission)
                            .addComponent(jLabelDurationMission)
                            .addComponent(jLabelFireDateMission)
                            .addComponent(jLabelNameMission))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNameMission)
                            .addComponent(jTextFieldDurationMission)
                            .addComponent(jTextFieldStateMission)
                            .addComponent(jTextFieldNbPersonMission)
                            .addComponent(jFormattedTextFieldFireDate))))
                .addContainerGap())
        );
        jPanelLeftDetailLayout.setVerticalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameMission)
                    .addComponent(jTextFieldNameMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFireDateMission)
                    .addComponent(jFormattedTextFieldFireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDurationMission)
                    .addComponent(jTextFieldDurationMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNbPersonMission)
                    .addComponent(jTextFieldNbPersonMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStateMission)
                    .addComponent(jTextFieldStateMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabelProgression))
                    .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanelRightDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRightDetail.setPreferredSize(new java.awt.Dimension(280, 280));

        jLabelSkill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSkill.setText("Compétences :");

        jLabelnbPeronSkill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelnbPeronSkill.setText("<html> <p>Nombre de personnes </p> <p>     requises  :</p></html>");

        HashMap<Integer, Requirement> requirementsListNb = myMission.getRequirements();
        Requirement requirement = requirementsListNb.get(1);
        jTextFieldNbPersonSkill.setText(""+requirement.getNbTotalPersonnes());
        jTextFieldNbPersonSkill.setEditable(false);

        jLabelPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPerson.setText("Personnes Attribuées :");

        //Creation du model personne
        DefaultListModel<Person> modelPerson = new DefaultListModel();

        // Recuperer les personnes sur un besoins
        HashMap<Integer, Requirement> requirementsList = myMission.getRequirements();
        Requirement requirementSelected = requirementsList.get(elt+1);

        List<Person> personList = requirementSelected.getListPersonnes();
        jListPerson.setModel(modelPerson);
        jListPerson.setCellRenderer(new GUI.NouvelleInterface.PersonRenderer());
        jListPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Iterator it = personList.iterator();
        for (Person personList1 : personList) {
            modelPerson.addElement(personList1);
        }
        jListPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListPerson);

        jComboBoxSkill.setMaximumRowCount(20);
        jComboBoxSkill.setModel(skillModel);
        jComboBoxSkill.setRenderer(new GUI.NouvelleInterface.SkillRenderer());

        HashMap<Integer,Requirement> mySkillList= myMission.getRequirements();

        Set entrySetSkill = mySkillList.entrySet();
        Iterator itSkill = entrySetSkill.iterator();

        while (itSkill.hasNext()) {

            Map.Entry me = (Map.Entry)itSkill.next();
            Skill myskill = mySkillList.get(me.getKey()).getRequiredSkill();
            skillModel.addElement(myskill);
        }
        jComboBoxSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSkillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRightDetailLayout = new javax.swing.GroupLayout(jPanelRightDetail);
        jPanelRightDetail.setLayout(jPanelRightDetailLayout);
        jPanelRightDetailLayout.setHorizontalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addComponent(jLabelPerson)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSkill)
                            .addComponent(jLabelnbPeronSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNbPersonSkill)
                            .addComponent(jComboBoxSkill, 0, 154, Short.MAX_VALUE)))))
        );
        jPanelRightDetailLayout.setVerticalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSkill)
                    .addComponent(jComboBoxSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnbPeronSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNbPersonSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addComponent(jLabelPerson)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
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
            .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
            .addComponent(jPanelRightDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelHeader2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitle2.setFont(new java.awt.Font("Roboto", 0, 40));
        jLabelTitle2.setForeground(new java.awt.Color(48, 51, 58));
        jLabelTitle2.setText("Accueil");

        jLabelReturn2.setFont(new java.awt.Font("Roboto", 0, 20));
        jLabelReturn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ic_arrow_back_black_48dp.png"))); // NOI18N
        jLabelReturn2.setText("Retours");

        javax.swing.GroupLayout jPanelHeader2Layout = new javax.swing.GroupLayout(jPanelHeader2);
        jPanelHeader2.setLayout(jPanelHeader2Layout);
        jPanelHeader2Layout.setHorizontalGroup(
            jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeader2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(jLabelTitle2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeader2Layout.setVerticalGroup(
            jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeader2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle2)
                    .addComponent(jLabelReturn2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addComponent(jPanelHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSkillActionPerformed
        //Recuperer l'id de l'element selectioné
        int elt = jComboBoxSkill.getSelectedIndex();
        //Creation du model personne
        DefaultListModel<Person> modelPerson = new DefaultListModel();
        // Recuperer les personnes sur un besoins
        HashMap<Integer, Requirement> requirementsList = myMission.getRequirements();

        Requirement requirementSelected = requirementsList.get(elt+1);

        List<Person> personList = requirementSelected.getListPersonnes();
        int nbPerson = requirementSelected.getNbTotalPersonnes();
        jTextFieldNbPersonSkill.setText(""+nbPerson);
        jListPerson.setModel(modelPerson);
        jListPerson.setCellRenderer(new GUI.NouvelleInterface.PersonRenderer());
        jListPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Iterator it = personList.iterator();

        for (Person personList1 : personList) {
            modelPerson.addElement(personList1);
        }

        jScrollPane1.setViewportView(jListPerson);
    }//GEN-LAST:event_jComboBoxSkillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Skill> jComboBoxSkill;
    private javax.swing.JFormattedTextField jFormattedTextFieldFireDate;
    public javax.swing.JLabel jLabelAdd;
    public javax.swing.JLabel jLabelAdd1;
    private javax.swing.JLabel jLabelDurationMission;
    private javax.swing.JLabel jLabelFireDateMission;
    private javax.swing.JLabel jLabelNameMission;
    private javax.swing.JLabel jLabelNbPersonMission;
    private javax.swing.JLabel jLabelPerson;
    private javax.swing.JLabel jLabelProgression;
    public javax.swing.JLabel jLabelReturn;
    public javax.swing.JLabel jLabelReturn1;
    public javax.swing.JLabel jLabelReturn2;
    private javax.swing.JLabel jLabelSkill;
    private javax.swing.JLabel jLabelStateMission;
    public javax.swing.JLabel jLabelTitle;
    public javax.swing.JLabel jLabelTitle1;
    public javax.swing.JLabel jLabelTitle2;
    private javax.swing.JLabel jLabelnbPeronSkill;
    private javax.swing.JList<Person> jListPerson;
    private javax.swing.JPanel jPanelContainerMission;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelHeader1;
    private javax.swing.JPanel jPanelHeader2;
    private javax.swing.JPanel jPanelLeftDetail;
    private javax.swing.JPanel jPanelRightDetail;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldDurationMission;
    private javax.swing.JTextField jTextFieldNameMission;
    private javax.swing.JTextField jTextFieldNbPersonMission;
    private javax.swing.JTextField jTextFieldNbPersonSkill;
    private javax.swing.JTextField jTextFieldStateMission;
    // End of variables declaration//GEN-END:variables
}
