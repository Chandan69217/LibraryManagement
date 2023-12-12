package customdialog;

import components.Custom_Button;
import components.Custom_Combo_Box;
import form.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Main;
import modelclass.Books_Details;

public class Search_Dialog extends javax.swing.JDialog implements ActionListener{

  private final Custom_Button cancel_btn,update_btn;
  private final Custom_Combo_Box serialNo;
    
    public Search_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        cancel_btn = search1.getCancel_btn();
        cancel_btn.addActionListener((ActionListener)this);
        
        update_btn = search1.getUpdate_btn();
        update_btn.addActionListener((ActionListener)this);
        
        serialNo = search1.getSerialNo();
        serialNo.addActionListener((ActionListener)this);
        serialNo.setSelectedItem("select serial no");
        
        for(Books_Details data : Dashboard.getBooksDetails()){
         serialNo.addItem(data.getSerialNo());
        }
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == update_btn && !serialNo.getSelectedItem().toString().equalsIgnoreCase("select serial no")){
               Update_Dialog update = new Update_Dialog(Main.getInstence(),true);
              
               for(Books_Details data : Dashboard.getBooksDetails()){
                   if(serialNo.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(data.getSerialNo()))){
                      
                       update.setDate(data.getDate());
                       update.setTitle_tf(data.getTitle());
                       update.setSerialNo(String.valueOf(data.getSerialNo()));
                       update.setPublisher(data.getPublisher());
                       update.setCost(String.valueOf(data.getCost()));
                       update.setEdition(data.getEdition());
                       update.setTag(data.getTags());
                   }
               }
               dispose();
               update.show();
               
           }else if(e.getSource() == cancel_btn){
               dispose();
           }
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search1 = new form.deshboard.Search();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(search1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.deshboard.Search search1;
    // End of variables declaration//GEN-END:variables
}
