package pack;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

class MyModel extends AbstractTableModel {
    private final String[] columnNames = {"Назва фільма", "Ваша оцінка фільму", "Віковий рейтинг фільма","Жанр Фільма",
            "Дата запису фільма в список","Опис фільма"};
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
