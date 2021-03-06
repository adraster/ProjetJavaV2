/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Interface;

import API.Company;
import API.Person;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author corentin
 */
public class PersonList extends javax.swing.JPanel {

    /**
     * Creates new form PersonList
     */
    Company myCompany;
    home myFrame;
    public PersonList(Company myCompany, home myFrame) {
        this.myCompany=myCompany;
        this.myFrame=myFrame;
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

        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArrayList<Person> PersonList = new ArrayList<Person>(myCompany.listePerson.values());
        jTablePerson = new javax.swing.JTable();

        setBackground(new java.awt.Color(246, 246, 246));

        jPanelHeader.setBackground(new java.awt.Color(101, 105, 138));

        jLabelTitle.setFont(new java.awt.Font("Roboto", 0, 40));
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Liste des personnes");

        jLabelAdd.setBackground(java.awt.Color.lightGray);
        jLabelAdd.setFont(new java.awt.Font("Roboto", 0, 20));
        jLabelAdd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add_circle.png"))); // NOI18N
        jLabelAdd.setText("Ajouter Personne");
        jLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAddMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jLabelAdd)
                .addGap(41, 41, 41))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdd)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 402));

        PersonTableModel modelPerson = new PersonTableModel(PersonList);
        jTablePerson.setModel(modelPerson);
        jTablePerson.setAutoCreateRowSorter(false);
        jTablePerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonMouseClicked
        PersonTableModel model = (PersonTableModel) jTablePerson.getModel();
        int row = jTablePerson.getSelectedRow();
        int col = jTablePerson.columnAtPoint(evt.getPoint());

        if (col == 3) { //Click sur Details 
            Person personSelected = model.personList.get(row);
            PersonDetail pd = new PersonDetail(personSelected,myCompany,myFrame);
            myFrame.jPanelContainer.removeAll();
            myFrame.jPanelContainer.add(pd);
            myFrame.repaint();
            myFrame.revalidate();
        }
    }//GEN-LAST:event_jTablePersonMouseClicked

    private void jLabelAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddMouseReleased
            myFrame.jPanelContainer.removeAll();
            myFrame.jPanelContainer.add(new AddPerson(myCompany,myFrame));
            myFrame.repaint();
            myFrame.revalidate();
    }//GEN-LAST:event_jLabelAddMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePerson;
    // End of variables declaration//GEN-END:variables
}
