package com.collegegwacalculator.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
        setOpaque(false);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(0, 102, 102));

        pnlMoving.setBackground(new java.awt.Color(118, 171, 174));
        pnlMoving.setForeground(new java.awt.Color(153, 0, 0));
        pnlMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tarlac State University - GWA Calculator");

        javax.swing.GroupLayout pnlMovingLayout = new javax.swing.GroupLayout(pnlMoving);
        pnlMoving.setLayout(pnlMovingLayout);
        pnlMovingLayout.setHorizontalGroup(
            pnlMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovingLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(641, Short.MAX_VALUE))
        );
        pnlMovingLayout.setVerticalGroup(
            pnlMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMovingLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        //GradientPaint g = new GradientPaint(0, 0, Color.decode("#cc5333"), 0, getHeight(),Color.decode("#23074d"));
        //.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(getWidth() -20, 0, getWidth(),getHeight());
        super.paintChildren(grphcs); 
    }
    private int x;
    private int y;
    
    public void initMoving(JFrame frame){
        pnlMoving.addMouseListener(new MouseAdapter(){  
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
        });
        pnlMoving.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() -x,me.getYOnScreen() -y);
            }
            
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlMoving;
    // End of variables declaration//GEN-END:variables
}
