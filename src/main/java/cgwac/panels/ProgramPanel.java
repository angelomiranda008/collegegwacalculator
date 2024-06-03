package cgwac.panels;

import cgwac.encapsulation.AddSubject;
import cgwac.universal.CenteredTableCellRenderer;
import cgwac.encapsulation.Subjects;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class ProgramPanel extends javax.swing.JPanel {  

 private final String username;

    public ProgramPanel(String username) {
        this.username = username;
        initComponents();
        applyCustomRenderers();
    }

    public void addSubject(Subjects subject) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            subject.getCourse(),
            subject.getAcronym(),
            subject.getUnits(),
            subject.getInstructor(),
            subject.getAttendance(),
            subject.getQuiz(),
            subject.getAssignment(),
            subject.getExam(),
            subject.getOthers(),
            subject.calculateTotal()
        });
    }

    private void applyCustomRenderers() {
        CenteredTableCellRenderer renderer = new CenteredTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(960, 514));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Program");

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Acronym", "Units", "Instructor", "Attendance", "Quiz", "Assignment", "Exam", "Others", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton1.setText("Add Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog addSubjectDialog = new JDialog((Frame) null, "Add Subject", true);
        AddSubject addSubjectPanel = new AddSubject(username);
        addSubjectPanel.setProgramPanel(this);
        addSubjectDialog.getContentPane().add(addSubjectPanel);
        addSubjectDialog.pack();
        addSubjectDialog.setLocationRelativeTo(this);
        addSubjectDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
