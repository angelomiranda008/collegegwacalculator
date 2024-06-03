package cgwac.panels;

import cgwac.readandwrite.ReadStudent;
import cgwac.encapsulation.Student;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProfilePanel extends javax.swing.JPanel {
    
    private final Student student;
    private final String username;

    public ProfilePanel(String username) {
        this.username = username;
        initComponents();
        student = ReadStudent.retrieveStudentData(username);
        displayData();        
        
        jlbImage.setPreferredSize(new java.awt.Dimension(800, 200));
        setImageLabel(jlbImage, "C:\\JavaProjects\\NetbeansProjects\\Image.png");
    }
    
    private void setImageLabel(JLabel jlbImage, String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        // Ensure JLabel has a size before scaling
        jlbImage.setSize(jlbImage.getPreferredSize());
        Image image = icon.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_SMOOTH);
        jlbImage.setIcon(new ImageIcon(image));
    }
    
    private void displayData() {
        if (student != null) {
            jlbStudent.setText("Student: "+student.getStudentFirstName() + " " + student.getStudentLastName());
            jlbProgram.setText("Program: "+student.getMajor());
            jlbCollege.setText("College: "+student.getCollege());
            jlbStudentNumber.setText("Student Number: "+student.getStudentNumber());
            jlbStudentID.setText("Student ID: "+student.getStudentID());
            jlbSports.setText("Sports: "+student.getSports());
            jlbOrgnization.setText("Organization: "+student.getOrganization());
        }else{

        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbStudent4 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jlbStudentNumber = new javax.swing.JLabel();
        jlbStudent = new javax.swing.JLabel();
        jlbStudentID = new javax.swing.JLabel();
        jlbProgram = new javax.swing.JLabel();
        jlbCollege = new javax.swing.JLabel();
        jlbOrgnization = new javax.swing.JLabel();
        jlbSports = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));

        jlbStudent4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlbStudent4.setText("Profile");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jlbStudentNumber.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbStudentNumber.setText("Student Number");

        jlbStudent.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbStudent.setText("Student");

        jlbStudentID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbStudentID.setText("Student ID");

        jlbProgram.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbProgram.setText("Program");

        jlbCollege.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbCollege.setText("College");

        jlbOrgnization.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbOrgnization.setText("Organization");

        jlbSports.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbSports.setText("Sports");

        jLayeredPane2.setLayer(jlbStudentNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbStudent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbStudentID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbProgram, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbCollege, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbOrgnization, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbSports, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbSports)
                    .addComponent(jlbOrgnization)
                    .addComponent(jlbCollege)
                    .addComponent(jlbProgram)
                    .addComponent(jlbStudentNumber)
                    .addComponent(jlbStudentID)
                    .addComponent(jlbStudent))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbStudentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbStudentNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbCollege)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbOrgnization)
                .addGap(18, 18, 18)
                .addComponent(jlbSports)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jlbStudent4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlbStudent4)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCollege;
    private javax.swing.JLabel jlbImage;
    private javax.swing.JLabel jlbOrgnization;
    private javax.swing.JLabel jlbProgram;
    private javax.swing.JLabel jlbSports;
    private javax.swing.JLabel jlbStudent;
    private javax.swing.JLabel jlbStudent4;
    private javax.swing.JLabel jlbStudentID;
    private javax.swing.JLabel jlbStudentNumber;
    // End of variables declaration//GEN-END:variables
}
