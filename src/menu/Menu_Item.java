package menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import modelclass.Menu_Model;


public class Menu_Item extends javax.swing.JPanel {
    
    private boolean Selected;
    
    public Menu_Item(Menu_Model data) {
        initComponents();
        setOpaque(false);
        
        if(data.getType()==Menu_Model.MenuType.MENU){
             lbIcon.setIcon(data.toIcon());
             lbName.setText(data.getName());
            
        }else if(data.getType()==Menu_Model.MenuType.TITLE){
            lbIcon.setText(data.getName());
            lbName.setVisible(false);
        }else{
            lbIcon.setText(" ");
        }
    }

    public void setSelected(boolean Selected) {
        this.Selected = Selected;
        repaint();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(110, 30));

        lbIcon.setBackground(new java.awt.Color(214, 217, 223));
        lbIcon.setFont(new java.awt.Font("Fira Code SemiBold", 0, 14)); // NOI18N
        lbIcon.setForeground(new java.awt.Color(255, 255, 255));

        lbName.setBackground(new java.awt.Color(214, 217, 223));
        lbName.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setPreferredSize(new java.awt.Dimension(66, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        if(Selected){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255,255,255,80));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        }
        super.paintComponent(g); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
