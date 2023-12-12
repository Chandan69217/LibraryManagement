package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import modelclass.Card_Model;

public class Tag_Card extends javax.swing.JPanel {
    
    private Color color1;
    private Color color2;
    
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    public Tag_Card() {
        initComponents();
        this.setOpaque(false);
        color1 = new Color(241,208,62);
        color2 = new Color(211,184,61);
    }
    
    public void setData(Card_Model data){
        icon.setIcon(data.imageToIcon());
        title.setText(data.getTitle());
        values.setText(data.getValue());
        subTitle.setText(data.getSubTitle());
        subValue.setText(data.getSubValue());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        values = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        subValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 237, 237));

        icon.setFont(new java.awt.Font("Fira Code SemiBold", 0, 18)); // NOI18N
        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Tags.png"))); // NOI18N
        icon.setText("Tags");

        title.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("# os,fundamental");

        values.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        values.setForeground(new java.awt.Color(255, 255, 255));
        values.setText("# Networking");

        subTitle.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setText("# architecture,dbms,rdbms");

        subValue.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        subValue.setForeground(new java.awt.Color(255, 255, 255));
        subValue.setText("# c,c++,java,python,vb,ds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(values, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(subValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(values)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subValue)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint paint = new GradientPaint(0,0,color1,getWidth(),getHeight(),color2);
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel subValue;
    private javax.swing.JLabel title;
    private javax.swing.JLabel values;
    // End of variables declaration//GEN-END:variables
}
