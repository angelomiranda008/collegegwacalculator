package cgwac.encapsulation;

import cgwac.panels.ProgramPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public final class AddSubject extends javax.swing.JPanel  {

    private ProgramPanel programPanel;
    private final String username;

    public AddSubject(String username) {
        this.username = username;
        initComponents();
    }

    public void setProgramPanel(ProgramPanel programPanel) {
        this.programPanel = programPanel;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtfAcronym = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfCourse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfUnits = new javax.swing.JTextField();
        jtfInstructor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtAddSubject = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 40, 49));
        setName("panelAddSubject"); // NOI18N

        jLayeredPane1.setBackground(new java.awt.Color(34, 40, 49));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane1.setOpaque(true);

        jtfAcronym.setBackground(new java.awt.Color(34, 40, 49));
        jtfAcronym.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfAcronym.setForeground(new java.awt.Color(255, 255, 255));
        jtfAcronym.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course");

        jtfCourse.setBackground(new java.awt.Color(34, 40, 49));
        jtfCourse.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfCourse.setForeground(new java.awt.Color(255, 255, 255));
        jtfCourse.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Acronym");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Units");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instructor");

        jtfUnits.setBackground(new java.awt.Color(34, 40, 49));
        jtfUnits.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfUnits.setForeground(new java.awt.Color(255, 255, 255));
        jtfUnits.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jtfInstructor.setBackground(new java.awt.Color(34, 40, 49));
        jtfInstructor.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfInstructor.setForeground(new java.awt.Color(255, 255, 255));
        jtfInstructor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(49, 54, 63));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Quiz", null},
                {"Attendance", null},
                {"Assignment", null},
                {"Exam", null},
                {"Others", null}
            },
            new String [] {
                "Criteria", "Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 1));
        jTable1.setName("jtbCriteria");
        jTable1.setSelectionBackground(new java.awt.Color(238, 238, 238));
        jTable1.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jLayeredPane1.setLayer(jtfAcronym, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCourse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfUnits, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfInstructor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jtfUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfAcronym, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(77, 77, 77))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAcronym, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jbtAddSubject.setBackground(new java.awt.Color(34, 40, 49));
        jbtAddSubject.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtAddSubject.setForeground(new java.awt.Color(255, 255, 255));
        jbtAddSubject.setText("Add Subject");
        jbtAddSubject.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jbtAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jbtAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddSubjectActionPerformed
        String course = jtfCourse.getText();
        String acronym = jtfAcronym.getText();
        String units = jtfUnits.getText();
        String instructor = jtfInstructor.getText();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String attendance = model.getValueAt(0, 1).toString();
        String quiz = model.getValueAt(1, 1).toString();
        String assignment = model.getValueAt(2, 1).toString();
        String exam = model.getValueAt(3, 1).toString();
        String others = model.getValueAt(4, 1).toString();

        Subjects subject = new Subjects(course, acronym, units, instructor, attendance, quiz, assignment, exam, others);

        if (programPanel != null) {
            programPanel.addSubject(subject);
        }

        jtfCourse.setText("");
        jtfAcronym.setText("");
        jtfUnits.setText("");
        jtfInstructor.setText("");
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt("", i, 1);
        }

        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jbtAddSubjectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtAddSubject;
    private javax.swing.JTextField jtfAcronym;
    private javax.swing.JTextField jtfCourse;
    private javax.swing.JTextField jtfInstructor;
    private javax.swing.JTextField jtfUnits;
    // End of variables declaration//GEN-END:variables
}
