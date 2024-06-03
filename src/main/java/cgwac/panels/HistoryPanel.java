package cgwac.panels;

import cgwac.universal.CenteredTableCellRenderer;
import cgwac.encapsulation.AddSemester;
import cgwac.encapsulation.Semester;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class HistoryPanel extends javax.swing.JPanel {

    Semester sem;
    DefaultTableModel tableModel;
    private final String username;
    private AddSemester addSem;

    public HistoryPanel(String username) {
        this.username = username;
        initComponents();
        applyCustomRenderers(); 
    }

    private void applyCustomRenderers() {
        CenteredTableCellRenderer renderer = new CenteredTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
    }

    public void addSemester(Semester semester) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Add a new row with the new semester's data
    model.addRow(new Object[]{
        semester.getYearLevel(),
        semester.getTerm(),
        semester.getStartOfTerm(),
        semester.getEndOfTerm()
    });

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtAddSemester = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("History");

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year Level", "Term", "Start of Term", "End of Term"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbtAddSemester.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtAddSemester.setText("Add Semester");
        jbtAddSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddSemesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbtAddSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jbtAddSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddSemesterActionPerformed
        //AddSemester addSem = new AddSemester(username);
        //addSem.setVisible(true);
        JDialog addSemesterDialog = new JDialog((Frame) null, "Add Semester", true);
        AddSemester addSemesterPanel = new AddSemester(username);
        addSemesterPanel.setHistoryPanel(this); // Set HistoryPanel reference in AddSemester
        addSemesterDialog.getContentPane().add(addSemesterPanel);
        addSemesterDialog.pack();
        addSemesterDialog.setLocationRelativeTo(this);
        addSemesterDialog.setVisible(true);
    }//GEN-LAST:event_jbtAddSemesterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtAddSemester;
    // End of variables declaration//GEN-END:variables
}
