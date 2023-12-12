package customdialog;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Show_Message_Dialog extends javax.swing.JDialog {

    public void setDialogLogo(String Icons) {
        this.DialogLogo.setIcon(new ImageIcon(getClass().getResource("/resources/icons/"+Icons+".png")));
    }

    public void setDialogMess(String Message) {
        this.DialogMess.setText(Message);
    }
    
    public Show_Message_Dialog(java.awt.Frame parent,boolean modal) {
        super(parent,modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new customdialog.RoundedPanel();
        DialogLogo = new javax.swing.JLabel();
        DialogMess = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(0,0,0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(330, 225));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        roundedPanel1.setLayout(null);

        DialogLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/lock.png"))); // NOI18N
        DialogLogo.setPreferredSize(new java.awt.Dimension(330, 225));
        roundedPanel1.add(DialogLogo);
        DialogLogo.setBounds(120, 10, 80, 90);

        DialogMess.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 12)); // NOI18N
        DialogMess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DialogMess.setText("show message here");
        DialogMess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedPanel1.add(DialogMess);
        DialogMess.setBounds(18, 115, 300, 30);

        jButton1.setBackground(new Color(201,214,255,100));
        jButton1.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 12)); // NOI18N
        jButton1.setText("Ok");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        roundedPanel1.add(jButton1);
        jButton1.setBounds(130, 170, 75, 30);

        getContentPane().add(roundedPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       dispose();
    }//GEN-LAST:event_jButton1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DialogLogo;
    private javax.swing.JLabel DialogMess;
    private javax.swing.JButton jButton1;
    private customdialog.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
