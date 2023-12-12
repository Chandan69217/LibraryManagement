package menu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import modelclass.Menu_Model;


public class Menu extends javax.swing.JPanel {
   
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        sub_Menu_List1.setOpaque(false);
        init();
    }

    public static Sub_Menu_List getSubMenu(){
        return Menu.sub_Menu_List1;
    }
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint paint = new GradientPaint(0,0,Color.decode("#1CB5E0"),0,getHeight(),Color.decode("#000046"));
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20,20);
        g2.fillRect(getWidth()-25, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listMenu1 = new menu.Main_Menu_List<>();
        sub_Menu_List1 = new menu.Sub_Menu_List<>();

        setPreferredSize(new java.awt.Dimension(215, 491));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/icon1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-5, 0, 220, 80);

        jLabel2.setBackground(new Color(0,0,0,0));
        jLabel2.setFont(new java.awt.Font("Fira Code SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGEMENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 110, 210, 29);

        jLabel3.setBackground(new Color(0,0,0,0));
        jLabel3.setFont(new java.awt.Font("Fira Code SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LIBRARY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 80, 210, 29);

        listMenu1.setBorder(null);
        listMenu1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        sub_Menu_List1.setBorder(null);
        sub_Menu_List1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(sub_Menu_List1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sub_Menu_List1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private menu.Main_Menu_List<String> listMenu1;
    private static menu.Sub_Menu_List<String> sub_Menu_List1;
    // End of variables declaration//GEN-END:variables

    private void init() {
        listMenu1.addItem(new Menu_Model("1", "Dashboard", Menu_Model.MenuType.MENU));
        listMenu1.addItem(new Menu_Model("2", "Students", Menu_Model.MenuType.MENU));
        listMenu1.addItem(new Menu_Model("3", "Issue Books", Menu_Model.MenuType.MENU));
        listMenu1.addItem(new Menu_Model("4", "Logout", Menu_Model.MenuType.MENU));
        listMenu1.addItem(new Menu_Model("5","Aboout Us",Menu_Model.MenuType.MENU));
    }
}
