package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorCell extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (table.getValueAt(row, column).toString().equals("No aplica")) {
            setBackground(Color.red);
            setForeground(Color.white);

        } else {
            setBackground(Color.white);
            setForeground(Color.black);

        }

       

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    }
}
