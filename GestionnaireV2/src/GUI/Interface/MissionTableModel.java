package GUI.Interface;

import API.Mission;
import API.Mission.Etat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author corentin
 */
public class MissionTableModel extends AbstractTableModel {

    public final List<Mission> missionList;

    private final String[] columnNames = new String[]{
        "Nom", "Date de début", "Durée (en semaines)", "Avancement", "Details"
    };
    private final Class[] columnClass = new Class[]{
       String.class, Date.class, Integer.class, Etat.class,String.class
    };

    public MissionTableModel(List<Mission> missionList) {
        this.missionList = missionList;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return missionList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mission row = missionList.get(rowIndex);
          
        if (0 == columnIndex) {
            return row.getMissionName();
        } else if (1 == columnIndex) {
            return row.getStartDate();
        } else if (2 == columnIndex) {
            return row.getMissionDuration();
        } else if (3 == columnIndex) {
            return row.getEtat();
        }
        else if (4 == columnIndex) {
            return "<html><i><u><b style='color:blue'>Détails</b></u></i></html>";
        }
        return null;
    }
}
 