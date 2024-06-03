package cgwac.panels;

import cgwac.universal.CenteredTableCellRenderer;
import java.awt.Font;
import javax.swing.JOptionPane;

public class GradesPanel extends javax.swing.JPanel {

    public GradesPanel() {
        initComponents();
        applyCustomRenderers();
    }

    private void calculateGWA() {
        int rowCount = jTable1.getRowCount();

        double totalUnits = 0;
        double totalWeightedGrades = 0;

        for (int i = 0; i < rowCount; i++) {
            try {
                if (jTable1.getValueAt(i, 1) != null && jTable1.getValueAt(i, 2) != null) {
                    double grade = Double.parseDouble(jTable1.getValueAt(i, 1).toString());
                    double units = Double.parseDouble(jTable1.getValueAt(i, 2).toString());

                    totalUnits += units;
                    totalWeightedGrades += units * grade;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values for units and grades.");
                return;
            }
        }

        if (totalUnits > 0) {
            double gwa = totalWeightedGrades / totalUnits;
            jtxGWA.setText(String.format("%.2f", gwa));
            jtxLetter.setText(getLetterGrade(gwa));
            jtxQuality.setText(getRemarks(gwa));
        } else {
            jtxGWA.setText("0.00");
            jtxLetter.setText("Incomplete");
            jtxQuality.setText("Inc");
        }
    }

    private String getRemarks(double gwa) {
        if (gwa >= 1.00 && gwa <= 1.24) {
            return "Excellent";
        } else if (gwa >= 1.25 && gwa <= 1.49) {
            return "Very Good";
        } else if (gwa >= 1.50 && gwa <= 1.74) {
            return "Very Good";
        } else if (gwa >= 1.75 && gwa <= 1.99) {
            return "Good";
        } else if (gwa >= 2.00 && gwa <= 2.24) {
            return "Good";
        } else if (gwa >= 2.25 && gwa <= 2.49) {
            return "Satisfactory";
        } else if (gwa >= 2.50 && gwa <= 2.74) {
            return "Satisfactory";
        } else if (gwa >= 2.75 && gwa <= 2.99) {
            return "Passing";
        } else if (gwa >= 3.00 && gwa <= 3.99) {
            return "Passing";
        } else if (gwa >= 4.00 && gwa <= 4.99) {
            return "Conditional Failure";
        } else if (gwa >= 5.00) {
            return "Failing";
        } else {
            return "Incomplete";
        }
    }

    private String getLetterGrade(double gwa) {
        if (gwa >= 1.00 && gwa <= 1.24) {
            return "A+";
        } else if (gwa >= 1.25 && gwa <= 1.49) {
            return "A";
        } else if (gwa >= 1.50 && gwa <= 1.74) {
            return "A-";
        } else if (gwa >= 1.75 && gwa <= 1.99) {
            return "B+";
        } else if (gwa >= 2.00 && gwa <= 2.24) {
            return "B";
        } else if (gwa >= 2.25 && gwa <= 2.49) {
            return "B-";
        } else if (gwa >= 2.50 && gwa <= 2.74) {
            return "C+";
        } else if (gwa >= 2.75 && gwa <= 2.99) {
            return "C";
        } else if (gwa >= 3.00 && gwa <= 3.99) {
            return "C-";
        } else if (gwa >= 4.00 && gwa <= 4.99) {
            return "CF";
        } else if (gwa >= 5.00) {
            return "F";
        } else {
            return "Inc";
        }
    }

    private void applyCustomRenderers() {
        CenteredTableCellRenderer renderer = new CenteredTableCellRenderer();
        jTable1.getColumnModel().getColumn(0).setCellRenderer(renderer); // Course column
        jTable1.getColumnModel().getColumn(1).setCellRenderer(renderer); // Grades column
        jTable1.getColumnModel().getColumn(2).setCellRenderer(renderer); // Units column
        jTable1.setRowHeight(25); // Set your desired row height
        jTable1.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
    }

    private void findWeakestSubject() {
        int rowCount = jTable1.getRowCount();
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(this, "No subjects available to evaluate.");
            return;
        }

        double minGrade = Double.MAX_VALUE;
        String weakestSubject = "";
        for (int i = 0; i < rowCount; i++) {
            if (jTable1.getValueAt(i, 1) != null && !jTable1.getValueAt(i, 1).toString().isEmpty()) {
                try {
                    double grade = Double.parseDouble(jTable1.getValueAt(i, 1).toString());
                    if (grade < minGrade) {
                        minGrade = grade;
                        weakestSubject = jTable1.getValueAt(i, 0).toString();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter valid numeric values for grades.");
                }
            }
        }

        if (!weakestSubject.isEmpty()) {
            jtxNeedImprovement.setText(weakestSubject + ": " + minGrade);
        } else {
            jtxNeedImprovement.setText("Unable to determine");
        }
    }

    private void findStrongestSubject() {
        int rowCount = jTable1.getRowCount();
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(this, "No subjects available to evaluate.");
            return;
        }

        double maxGrade = Double.MIN_VALUE;
        String strongestSubject = "";
        for (int i = 0; i < rowCount; i++) {
            if (jTable1.getValueAt(i, 1) != null && !jTable1.getValueAt(i, 1).toString().isEmpty()) {
                try {
                    double grade = Double.parseDouble(jTable1.getValueAt(i, 1).toString());
                    if (grade > maxGrade) {
                        maxGrade = grade;
                        strongestSubject = jTable1.getValueAt(i, 0).toString();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter valid numeric values for grades.");
                }
            }
        }

        if (!strongestSubject.isEmpty()) {
            jtxExcelled.setText(strongestSubject + ": " + maxGrade);
        } else {
            jtxExcelled.setText("Unable to determine");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtCalculate = new javax.swing.JButton();
        jtxExcelled = new javax.swing.JTextField();
        jtxNeedImprovement = new javax.swing.JTextField();
        jtxGWA = new javax.swing.JTextField();
        jtxQuality = new javax.swing.JTextField();
        jtxLetter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(987, 462));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Grades");

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SY. 2023-2024", "SY. 2022-2023" }));
        jComboBox1.setToolTipText("School Year");
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(49, 54, 63));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course", "Grade", "Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 1));
        jTable1.setName(""); // NOI18N
        jTable1.setSelectionBackground(new java.awt.Color(238, 238, 238));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester" }));
        jComboBox2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jbtCalculate.setBackground(new java.awt.Color(34, 40, 49));
        jbtCalculate.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtCalculate.setForeground(new java.awt.Color(255, 255, 255));
        jbtCalculate.setText("Calculate");
        jbtCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCalculateActionPerformed(evt);
            }
        });

        jtxExcelled.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jtxNeedImprovement.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtxNeedImprovement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNeedImprovementActionPerformed(evt);
            }
        });

        jtxGWA.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jtxQuality.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jtxLetter.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setText("Quality");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Letter Grade");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("GWA");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Need Improvement");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("Excelled");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxExcelled, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtxNeedImprovement, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxGWA, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtxQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxExcelled, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxNeedImprovement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxGWA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jbtCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCalculateActionPerformed
        calculateGWA();
        findStrongestSubject();
        findWeakestSubject();
    }//GEN-LAST:event_jbtCalculateActionPerformed

    private void jtxNeedImprovementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNeedImprovementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNeedImprovementActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtCalculate;
    private javax.swing.JTextField jtxExcelled;
    private javax.swing.JTextField jtxGWA;
    private javax.swing.JTextField jtxLetter;
    private javax.swing.JTextField jtxNeedImprovement;
    private javax.swing.JTextField jtxQuality;
    // End of variables declaration//GEN-END:variables
}
