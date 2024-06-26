package cgwac.main;

import cgwac.universal.BackgroundTask;
import cgwac.panels.SummaryPanel;
import com.formdev.flatlaf.FlatLightLaf;
import cgwac.panels.GradesPanel;
import cgwac.panels.HistoryPanel;
import cgwac.panels.NotebookPanel;
import cgwac.panels.ProfilePanel;
import cgwac.panels.ProgramPanel;
import cgwac.panels.SettingsPanel;

import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {
    
    private final String username;
    public Main(String username) {
        this.username = username;
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        initComponents();
        pnlContainer.setDoubleBuffered(true); // Enable double buffering for pnlContainer
        BackgroundTask backgroundTask = new BackgroundTask();
        backgroundTask.execute();
        // Add panels to pnlContainer
        pnlContainer.setLayout(new CardLayout());
        ProfilePanel profile = new ProfilePanel(username);
        GradesPanel grades = new GradesPanel();
        HistoryPanel history = new HistoryPanel(username);
        NotebookPanel notebook = new NotebookPanel();
        SettingsPanel settings = new SettingsPanel();
        ProgramPanel program = new ProgramPanel(username);
        SummaryPanel summary = new SummaryPanel();

        pnlContainer.add(profile, "UC_Profile");
        pnlContainer.add(grades, "UC_Grades");
        pnlContainer.add(history, "UC_History");
        pnlContainer.add(notebook, "UC_Notebook");
        pnlContainer.add(settings, "UC_Settings");
        pnlContainer.add(program, "UC_Program");
        pnlContainer.add(summary, "UC_Summary");
    }
    
    private void displayPanel(String panelName) {
        CardLayout cl = (CardLayout) pnlContainer.getLayout();
        cl.show(pnlContainer, panelName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        btnProgram = new javax.swing.JButton();
        btnGrades = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnNotebook = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("DashboardFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setPreferredSize(new java.awt.Dimension(960, 514));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnProfile.setBackground(new java.awt.Color(49, 54, 63));
        btnProfile.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(238, 238, 238));
        btnProfile.setText("Profile");
        btnProfile.setToolTipText("");
        btnProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnProfile);

        btnProgram.setBackground(new java.awt.Color(49, 54, 63));
        btnProgram.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnProgram.setForeground(new java.awt.Color(238, 238, 238));
        btnProgram.setText("Program");
        btnProgram.setToolTipText("");
        btnProgram.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramActionPerformed(evt);
            }
        });
        jPanel2.add(btnProgram);

        btnGrades.setBackground(new java.awt.Color(49, 54, 63));
        btnGrades.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGrades.setForeground(new java.awt.Color(238, 238, 238));
        btnGrades.setText("Grades");
        btnGrades.setToolTipText("");
        btnGrades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGrades.setPreferredSize(new java.awt.Dimension(54, 19));
        btnGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradesActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrades);

        btnHistory.setBackground(new java.awt.Color(49, 54, 63));
        btnHistory.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(238, 238, 238));
        btnHistory.setText("History");
        btnHistory.setToolTipText("");
        btnHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });
        jPanel2.add(btnHistory);

        btnSummary.setBackground(new java.awt.Color(49, 54, 63));
        btnSummary.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSummary.setForeground(new java.awt.Color(238, 238, 238));
        btnSummary.setText("Summary");
        btnSummary.setToolTipText("");
        btnSummary.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });
        jPanel2.add(btnSummary);

        btnSettings.setBackground(new java.awt.Color(49, 54, 63));
        btnSettings.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(238, 238, 238));
        btnSettings.setText("Settings");
        btnSettings.setToolTipText("");
        btnSettings.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jPanel2.add(btnSettings);

        btnNotebook.setBackground(new java.awt.Color(49, 54, 63));
        btnNotebook.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnNotebook.setForeground(new java.awt.Color(238, 238, 238));
        btnNotebook.setText("Notebook");
        btnNotebook.setToolTipText("");
        btnNotebook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotebookActionPerformed(evt);
            }
        });
        jPanel2.add(btnNotebook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        displayPanel("UC_Summary");
    }//GEN-LAST:event_btnSummaryActionPerformed

    private void btnGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradesActionPerformed
        displayPanel("UC_Grades");
    }//GEN-LAST:event_btnGradesActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        displayPanel("UC_History");
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        displayPanel("UC_Profile");
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramActionPerformed
        displayPanel("UC_Program");
    }//GEN-LAST:event_btnProgramActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        displayPanel("UC_Settings");
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotebookActionPerformed
        displayPanel("UC_Notebook");
    }//GEN-LAST:event_btnNotebookActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Main(username).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrades;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnNotebook;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnProgram;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnSummary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
