package pack;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

class ModelSerialWatched extends AbstractTableModel {
    private final String[] columnNames = {"Назва серіала",
            "Дата запису серіала в список","Кількість сезонів","Статус серіала","Жанр серіала","Ваша оцінка"
            ,"Віковий рейтинг","Опис серіала"};
    private ArrayList<String[]> Data = new ArrayList<String[]>();

    public void AddCSVData(ArrayList<String[]> DataIn) {
        this.Data = DataIn;
        this.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;// length;
    }

    @Override
    public int getRowCount() {
        return Data.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return Data.get(row)[col];
    }
}
