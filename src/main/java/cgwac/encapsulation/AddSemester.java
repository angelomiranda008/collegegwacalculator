package cgwac.encapsulation;

import cgwac.panels.HistoryPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AddSemester extends javax.swing.JPanel{

    private HistoryPanel historyPanel;
    private final String username;
    public AddSemester(String username) {
        this.username = username;
        initComponents();
    }

    public void setHistoryPanel(HistoryPanel historyPanel) {
        this.historyPanel = historyPanel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfYearLevel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfStartOfTerm = new javax.swing.JTextField();
        jtfEndOfTerm = new javax.swing.JTextField();
        jcbTerm = new javax.swing.JComboBox<>();
        btnAddSemester = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 40, 49));

        jLayeredPane1.setBackground(new java.awt.Color(34, 40, 49));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 0, 51))); // NOI18N
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Year Level");

        jtfYearLevel.setBackground(new java.awt.Color(34, 40, 49));
        jtfYearLevel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfYearLevel.setForeground(new java.awt.Color(255, 255, 255));
        jtfYearLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Term");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start of Term");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End of Term");

        jtfStartOfTerm.setBackground(new java.awt.Color(34, 40, 49));
        jtfStartOfTerm.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfStartOfTerm.setForeground(new java.awt.Color(255, 255, 255));
        jtfStartOfTerm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jtfEndOfTerm.setBackground(new java.awt.Color(34, 40, 49));
        jtfEndOfTerm.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtfEndOfTerm.setForeground(new java.awt.Color(255, 255, 255));
        jtfEndOfTerm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jcbTerm.setBackground(new java.awt.Color(34, 40, 49));
        jcbTerm.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jcbTerm.setForeground(new java.awt.Color(255, 255, 255));
        jcbTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester" }));
        jcbTerm.setOpaque(true);

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfYearLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfStartOfTerm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfEndOfTerm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbTerm, javax.swing.JLayeredPane.DRAG_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfStartOfTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtfEndOfTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfYearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(184, 184, 184))
                            .addComponent(jcbTerm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfYearLevel)
                    .addComponent(jcbTerm, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEndOfTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfStartOfTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnAddSemester.setBackground(new java.awt.Color(34, 40, 49));
        btnAddSemester.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAddSemester.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSemester.setText("Add Semester");
        btnAddSemester.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnAddSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSemesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnAddSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAddSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSemesterActionPerformed
        String yearLevel = jtfYearLevel.getText();
        String term = (String) jcbTerm.getSelectedItem();
        String startOfTerm = jtfStartOfTerm.getText();
        String endOfTerm = jtfEndOfTerm.getText();

        int confirmResult = JOptionPane.showConfirmDialog(this,
            "Do you want to add a new semester? This will archive the previous semester with a closed status.",
            "Confirm Semester Addition",
            JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION) {
            Semester semester = new Semester(yearLevel, term, startOfTerm, endOfTerm);
            historyPanel.addSemester(semester);

            jtfYearLevel.setText("");
            jtfStartOfTerm.setText("");
            jtfEndOfTerm.setText("");

            SwingUtilities.getWindowAncestor(this).dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Semester addition cancelled.");
        }
    }//GEN-LAST:event_btnAddSemesterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JComboBox<String> jcbTerm;
    private javax.swing.JTextField jtfEndOfTerm;
    private javax.swing.JTextField jtfStartOfTerm;
    private javax.swing.JTextField jtfYearLevel;
    // End of variables declaration//GEN-END:variables
}
