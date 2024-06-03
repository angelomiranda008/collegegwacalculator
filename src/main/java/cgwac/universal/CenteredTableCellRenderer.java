package cgwac.universal;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;

public class CenteredTableCellRenderer extends DefaultTableCellRenderer  {
    private DecimalFormat decimalFormat;
    private Font centuryGothic;

    public CenteredTableCellRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
        decimalFormat = new DecimalFormat("#.00");
        centuryGothic = new Font("Century Gothic", Font.PLAIN, 12);
        setFont(centuryGothic);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Number) {
            value = decimalFormat.format(value);
        }
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        component.setFont(centuryGothic);
        return component;
    }
    
}

