package cgwac.main;

import cgwac.readandwrite.WriteStudent;
import cgwac.encapsulation.Colleges;
import cgwac.encapsulation.Student;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RegisterForm extends javax.swing.JFrame { 
    
    private String username;
    
    public RegisterForm(String username) {
        this.username = username;
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        initComponents();
    }
    
     public static String generateStudentID() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder studentNumber = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            studentNumber.append(characters.charAt(index));
        }
        return studentNumber.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbSex = new javax.swing.JComboBox<>();
        jtxLastName = new javax.swing.JTextField();
        jtxAge = new javax.swing.JTextField();
        jtxBirthdate = new javax.swing.JTextField();
        jbtSubmit = new javax.swing.JButton();
        jcbMajor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jtxSports = new javax.swing.JTextField();
        jcbOrganization = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxStudentNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcbCollege = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jcbYearLevel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("College");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("RegisterFrame"); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(780, 614));

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        jtxFirstName.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxFirstName.setBorder(null);
        jtxFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Birthdate");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("College");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Major");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sex");

        jcbSex.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcbSex.setSelectedItem(jcbCollege.getAncestorListeners());
        jcbSex.setBorder(null);

        jtxLastName.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxLastName.setBorder(null);
        jtxLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxLastNameActionPerformed(evt);
            }
        });

        jtxAge.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxAge.setBorder(null);
        jtxAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxAgeActionPerformed(evt);
            }
        });

        jtxBirthdate.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxBirthdate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxBirthdate.setBorder(null);
        jtxBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxBirthdateActionPerformed(evt);
            }
        });

        jbtSubmit.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtSubmit.setText("Submit");
        jbtSubmit.setBorder(null);
        jbtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSubmitActionPerformed(evt);
            }
        });
        jbtSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtSubmitKeyPressed(evt);
            }
        });

        jcbMajor.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbMajor.setBorder(null);
        jcbMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMajorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Year Level");

        jtxSports.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxSports.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxSports.setBorder(null);
        jtxSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxSportsActionPerformed(evt);
            }
        });

        jcbOrganization.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbOrganization.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jcbOrganization.setBorder(null);
        jcbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrganizationActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sports");

        jtxStudentNumber.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jtxStudentNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxStudentNumber.setBorder(null);
        jtxStudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxStudentNumberActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Student Number");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Organization");

        jcbCollege.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "College of Arts and Social Sciences", "College of Architecture and Fine Arts", "College of Business and Accountancy", "College of Computer Studies", "College of Criminal Justice Education", "College of Education", "College of Engineering", "College of Industrial Technology", "College of Public Administration and Governance ", "College of Science", "School of Law" }));
        jcbCollege.setSelectedItem(getBackground());
        jcbCollege.setBorder(null);
        jcbCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCollegeActionPerformed(evt);
            }
        });

        jcbYearLevel.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbYearLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Freshman", "Sophomore", "Junior", "Senior" }));
        jcbYearLevel.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtxBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(459, 459, 459))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jtxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxSports, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbYearLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jbtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbYearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(jcbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxSports, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(434, 434, 434))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxFirstNameActionPerformed

    }//GEN-LAST:event_jtxFirstNameActionPerformed

    private void jtxLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxLastNameActionPerformed

    }//GEN-LAST:event_jtxLastNameActionPerformed

    private void jtxAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxAgeActionPerformed

    }//GEN-LAST:event_jtxAgeActionPerformed

    private void jtxBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxBirthdateActionPerformed

    }//GEN-LAST:event_jtxBirthdateActionPerformed

    private void jbtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSubmitActionPerformed

        
    if (isFieldsEmpty(jPanel2)) {
         JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        String firstName = jtxFirstName.getText();
        String lastName = jtxLastName.getText();
        String birthdate = jtxBirthdate.getText();
        String age = jtxAge.getText();
        String sex = (String) jcbSex.getSelectedItem();
        String studentNumber = jtxStudentNumber.getText();
        String yearLevel = (String) jcbYearLevel.getSelectedItem();
        String college = (String) jcbCollege.getSelectedItem();
        String major = (String) jcbMajor.getSelectedItem();
        String organization = jcbOrganization.getText();
        String sports = jtxSports.getText();
        String studentID = generateStudentID();

        Student student = new Student(firstName, lastName, birthdate, age, sex, studentNumber, yearLevel, college, organization, major, sports,studentID);
        WriteStudent.writeStudentToExcel(student,username);

        dispose();
        setVisible(false);
        Main dashboard = new Main(username);
        dashboard.setVisible(true);
}

    }//GEN-LAST:event_jbtSubmitActionPerformed

    private void jcbMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMajorActionPerformed
    }//GEN-LAST:event_jcbMajorActionPerformed

    private void jcbCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCollegeActionPerformed
        String selectedCollege = (String) jcbCollege.getSelectedItem();
        Colleges college = new Colleges(selectedCollege);
        ArrayList<String> departments = college.setPrograms();
        
        jcbMajor.removeAllItems();
        for (String major : departments) {
            jcbMajor.addItem(major); 
        }
        
        jcbMajor.repaint();
        jcbMajor.revalidate();
    }//GEN-LAST:event_jcbCollegeActionPerformed

    private void jtxSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxSportsActionPerformed

    }//GEN-LAST:event_jtxSportsActionPerformed

    private void jcbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrganizationActionPerformed

    }//GEN-LAST:event_jcbOrganizationActionPerformed

    private void jtxStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxStudentNumberActionPerformed

    }//GEN-LAST:event_jtxStudentNumberActionPerformed

    private void jbtSubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtSubmitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSubmitKeyPressed

    public static boolean isFieldsEmpty(Component container) {
        Component[] components = ((java.awt.Container) container).getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                if (textField.getText().trim().isEmpty()) {
                    return true; // Empty JTextField found
                }
            } else if (component instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) component;
                if (comboBox.getSelectedItem() == null) {
                    return true; // Null selection in JComboBox found
                }
            }
        }
        return false; // No empty fields found
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //Student student = new Student(firstName,lastName,birthdate,age,sex,college,organization,major);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtSubmit;
    private javax.swing.JComboBox<String> jcbCollege;
    private javax.swing.JComboBox<String> jcbMajor;
    private javax.swing.JTextField jcbOrganization;
    private javax.swing.JComboBox<String> jcbSex;
    private javax.swing.JComboBox<String> jcbYearLevel;
    private javax.swing.JTextField jtxAge;
    private javax.swing.JTextField jtxBirthdate;
    private javax.swing.JTextField jtxFirstName;
    private javax.swing.JTextField jtxLastName;
    private javax.swing.JTextField jtxSports;
    private javax.swing.JTextField jtxStudentNumber;
    // End of variables declaration//GEN-END:variables

    private void If(boolean fieldsEmpty) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
