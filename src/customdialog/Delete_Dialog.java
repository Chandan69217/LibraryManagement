package customdialog;

import components.Custom_Button;
import components.Custom_Combo_Box;
import database.Connect_DBMS;
import form.Dashboard;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import main.Main;
import modelclass.Books_Details;

public class Delete_Dialog extends javax.swing.JDialog implements ActionListener{

    private final Custom_Button cancel_btn,delete_btn;
    private final Custom_Combo_Box serialNo;
    
    public Delete_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        cancel_btn = delete1.getCancel_btn();
        cancel_btn.addActionListener((ActionListener)this);
        
        delete_btn = delete1.getDelete_btn();
        delete_btn.addActionListener((ActionListener)this);
        
        serialNo = delete1.getSerialNo();
        serialNo.addActionListener((ActionListener)this);
        serialNo.setSelectedItem("Enter serial no");
       
        for(Books_Details data : Dashboard.getBooksDetails()){
            serialNo.addItem(data.getSerialNo());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete1 = new form.deshboard.Delete();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(255,255,255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(330, 190));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(delete1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); 
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.deshboard.Delete delete1;
    // End of variables declaration//GEN-END:variables


    @Override
    public void actionPerformed(ActionEvent e) {
       
     if (e.getSource() == delete_btn && !serialNo.getSelectedItem().toString().equalsIgnoreCase("Enter serial no")){     
          this.setVisible(false);
          
          Confirm_Dialog confirmDialog = new Confirm_Dialog(Main.getInstence(),true);
          confirmDialog.setDialogIcon("Delete");
          confirmDialog.setDialogMessage("Are you sure to delete ?");
          confirmDialog.show();
          
          int flag = confirmDialog.getResponse();
             
         switch (flag) {
             case 0 -> {
                 dispose();
                 try {
                     Connect_DBMS.getInstence().deleteRecord(serialNo.getSelectedItem().toString());
                 } catch (ClassNotFoundException | SQLException ex) {}
                 Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(), true);
                 dialog.setDialogLogo("delete1");
                 dialog.setDialogMess("Record deleted sucessfully !!!");
                 dialog.show();
                 try {
                     Dashboard.retrieveData();
                 } catch (SQLException | ClassNotFoundException ex) {
                     
                 }
             }
             case 1 -> dispose();
             case 3 -> this.setVisible(true);
             default -> {
             }
         }
        } else if(e.getSource() == cancel_btn){
            dispose();
        }
          
      }
    }

