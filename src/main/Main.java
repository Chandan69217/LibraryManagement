package main;

import form.Main_Panel;
import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import splashscreen.Splash_Screen;

public class Main extends javax.swing.JFrame {
    private static Main mainFrame;
    private Point press;
    
    public Main() {
    initComponents();
    setBackground(new Color(0,0,0,0));
    
      //////////////////////// Temporary  Code //////////////////
//      this.remove(login11);;
//      this.setBounds(115,50,1050,580);
//      this.setBounds(50,20,1180,620);
//      Main_Panel mainPanel = new Main_Panel();
//      mainPanel.setSize(1180,620);
//      this.add(mainPanel);
//      this.revalidate();
//      this.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login11 = new login.Login();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/Icons/icon.png"))
        );
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setState(1);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().add(login11, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        Point drag = SwingUtilities.convertPoint(this, evt.getPoint(), this);
        this.setLocation((int) Math.round(this.getLocation().getX() + drag.getX() - press.getX()), (int) Math.round(this.getLocation().getY() + drag.getY() - press.getY()));
      
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       press = SwingUtilities.convertPoint(this, evt.getPoint(), this);
    }//GEN-LAST:event_formMousePressed

    public static void main(String args[]){     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Splash_Screen(null,true).setVisible(true);
                mainFrame = new Main();
                mainFrame.setVisible(true);
            }
        });

    }
    
    public static Main getInstence(){
        return mainFrame;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.Login login11;
    // End of variables declaration//GEN-END:variables


}

