package customdialog;

import components.Custom_Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Update_Dialog extends javax.swing.JDialog implements ActionListener {
    private final Custom_Button cancel_btn , update_btn;
    public Update_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        cancel_btn = update.getCancelBtn();
        cancel_btn.addActionListener((ActionListener)this);
        
        update_btn = update.getUpdateBtn();
        update_btn.addActionListener((ActionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == cancel_btn){
          dispose();
      }else if(e.getSource() == update_btn){
          dispose();
      }
    }
    
    public void setDate(String date){
        update.getDate_tf().setText(date);
    }
    
    public void setSerialNo(String serial){
        update.getSerial_tf().setText(serial);
    }
    
    public void setTitle_tf(String title){
        update.getTitle_tf().setText(title);
    }
    
    public void setPublisher(String publisher){
        update.getPublisher_tf().setText(publisher);
    }
    
    public void setCost(String cost){
        update.getCost_tf().setText(cost);
    }
    
    public void setEdition(String edition){
        int index = 0;
        if(edition.equalsIgnoreCase("first edition")){
            index = 1;
        }else if(edition.equalsIgnoreCase("second edition")){
            index = 2;
        }else if(edition.equalsIgnoreCase("third edition")){
            index = 3;
        }else if(edition.equalsIgnoreCase("fourth edition")){
            index = 4;
        }else if(edition.equalsIgnoreCase("fifth edition")){
           index = 5; 
        }else if(edition.equalsIgnoreCase("sixth edition")){
            index = 6;
        }else if(edition.equalsIgnoreCase("seventh edition")){
            index = 7;
        }else if(edition.equalsIgnoreCase("eighth edition")){
            index = 8;
        }else if(edition.equalsIgnoreCase("ninth edition")){
            index = 9;
        }else if(edition.equalsIgnoreCase("tenth edition")){
            index = 10;
        }
    
        update.getEdition_tf().setSelectedIndex(index);
    }
    
   
    public void setTag(String tag){
        int index = 0;
        if(tag.equalsIgnoreCase("c")){
            index = 1;
        }else if(tag.equalsIgnoreCase("os")){
            index = 2;
        }else if(tag.equalsIgnoreCase("ds")){
            index = 3;
        }else if(tag.equalsIgnoreCase("c++")){
            index = 4;
        }else if(tag.equalsIgnoreCase("java")){
            index = 5;
        }else if(tag.equalsIgnoreCase("dbms")){
            index = 6;
        }else if(tag.equalsIgnoreCase("rdbms")){
            index = 7;
        }else if(tag.equalsIgnoreCase("python")){
            index = 8;
        }else if(tag.equalsIgnoreCase("networking")){
            index = 9;
        }else if(tag.equalsIgnoreCase("architecture")){
            index = 10;
        }else if(tag.equalsIgnoreCase("fundamental")){
            index = 11;
        }
        
        update.getTag_tf().setSelectedIndex(index);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new form.deshboard.Update();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(update);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.deshboard.Update update;
    // End of variables declaration//GEN-END:variables
}
