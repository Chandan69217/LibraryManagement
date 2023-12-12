package form.deshboard;

import components.Custom_Button;
import components.Custom_Combo_Box;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Delete extends javax.swing.JPanel {


    public Delete() {
        initComponents();
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g); 
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint paint = new GradientPaint(0,0,Color.decode("#1CB5E0"),getWidth(),getHeight(),Color.decode("#000046"));
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
    }

    public  Custom_Button getCancel_btn() {
        return this.cancel_btn;
    }

    public  Custom_Button getDelete_btn() {
        return this.delete_btn;
    }

    public  Custom_Combo_Box getSerialNo() {
        return this.serialNo;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel_btn = new components.Custom_Button();
        delete_btn = new components.Custom_Button();
        jLabel1 = new javax.swing.JLabel();
        serialNo = new components.Custom_Combo_Box();

        setPreferredSize(new java.awt.Dimension(330, 190));

        cancel_btn.setBackground(new Color(255,255,255,0));
        cancel_btn.setBorder(null);
        cancel_btn.setText("Cancel");

        delete_btn.setBackground(new Color(255,255,255,0));
        delete_btn.setBorder(null);
        delete_btn.setText("Delete");

        jLabel1.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Serial no :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(serialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Custom_Button cancel_btn;
    private components.Custom_Button delete_btn;
    private javax.swing.JLabel jLabel1;
    private components.Custom_Combo_Box serialNo;
    // End of variables declaration//GEN-END:variables
}
