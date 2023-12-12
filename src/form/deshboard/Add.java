package form.deshboard;

import components.RoundedBorder;
import customdialog.Show_Message_Dialog;
import database.Connect_DBMS;
import form.Dashboard;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import main.Main;
import modelclass.Books_Details;


public class Add extends javax.swing.JPanel implements KeyListener {

      private Books_Details data;

    public Add() {
        initComponents();
        this.setOpaque(false);
        date_tf.setEditable(true);
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/YYYY");
        String date = ft.format(new Date());
        date_tf.setText(date);
        serial_tf.setEditable(true);
       
        if(Dashboard.getSerialNo() == 0 ){
            serial_tf.setText("65400");
        }else{
           serial_tf.setText(String.valueOf(Dashboard.getSerialNo()+1)); 
        }
        
        title_tf.requestFocus();
        title_tf.addKeyListener(this);
        publisher_tf.addKeyListener(this);
        edition_tf.addKeyListener(this);
        cost_tf.addKeyListener(this);
        tag_tf.addKeyListener(this);
        add_btn.addKeyListener(this);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date_tf = new components.Custom_JTextField();
        jLabel3 = new javax.swing.JLabel();
        serial_tf = new components.Custom_JTextField();
        jLabel2 = new javax.swing.JLabel();
        title_tf = new components.Custom_JTextField();
        jLabel4 = new javax.swing.JLabel();
        publisher_tf = new components.Custom_JTextField();
        jLabel6 = new javax.swing.JLabel();
        edition_tf = new components.Custom_Combo_Box();
        jLabel5 = new javax.swing.JLabel();
        cost_tf = new components.Custom_JTextField();
        jLabel7 = new javax.swing.JLabel();
        tag_tf = new components.Custom_Combo_Box();
        jLabel8 = new javax.swing.JLabel();
        cancel_btn = new components.Custom_Button();
        add_btn = new components.Custom_Button();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(625, 375));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(4, 4, 5, 20));

        jLabel1.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");
        jPanel1.add(jLabel1);

        date_tf.setBorder(null);
        date_tf.setForeground(new java.awt.Color(255, 255, 255));
        date_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        date_tf.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 12)); // NOI18N
        date_tf.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(date_tf);

        jLabel3.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serial no");
        jPanel1.add(jLabel3);

        serial_tf.setBorder(null);
        serial_tf.setForeground(new java.awt.Color(255, 255, 255));
        serial_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serial_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        serial_tf.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 12)); // NOI18N
        serial_tf.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(serial_tf);

        jLabel2.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");
        jPanel1.add(jLabel2);

        title_tf.setBorder(null);
        title_tf.setForeground(new java.awt.Color(255, 255, 255));
        title_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        title_tf.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 12)); // NOI18N
        title_tf.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(title_tf);

        jLabel4.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher");
        jPanel1.add(jLabel4);

        publisher_tf.setBorder(null);
        publisher_tf.setForeground(new java.awt.Color(255, 255, 255));
        publisher_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        publisher_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        publisher_tf.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 12)); // NOI18N
        publisher_tf.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(publisher_tf);

        jLabel6.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edition");
        jPanel1.add(jLabel6);

        edition_tf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT....", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH" }));
        jPanel1.add(edition_tf);

        jLabel5.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cost");
        jPanel1.add(jLabel5);

        cost_tf.setBorder(null);
        cost_tf.setForeground(new java.awt.Color(255, 255, 255));
        cost_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cost_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cost_tf.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 12)); // NOI18N
        cost_tf.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(cost_tf);

        jLabel7.setFont(new java.awt.Font("Fira Code SemiBold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tag");
        jPanel1.add(jLabel7);

        tag_tf.setForeground(new java.awt.Color(255, 255, 255));
        tag_tf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT TAG", "C", "OS", "DS", "C++", "JAVA", "DBMS", "RDBMS", "PYTHON", "NETWORKING", "ARCHITECTURE", "FUNDAMENTAL" }));
        jPanel1.add(tag_tf);

        jLabel8.setFont(new java.awt.Font("Fira Code SemiBold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Details");

        cancel_btn.setBackground(new Color(255,255,255,0));
        cancel_btn.setBorder(null);
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        add_btn.setBorder(new RoundedBorder(20));
        add_btn.setText("Save");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
    }// </editor-fold>//GEN-END:initComponents
     public JButton getCancelBtn(){
         return this.cancel_btn;
     }
    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
               
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        addRecords();
         title_tf.setText("");
         publisher_tf.setText("");
         edition_tf.setSelectedIndex(0);
         cost_tf.setText("");
         tag_tf.setSelectedIndex(0);
         serial_tf.setText(String.valueOf(Integer.parseInt(serial_tf.getText())+1));
    }//GEN-LAST:event_add_btnActionPerformed

   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g; 
        GradientPaint paint = new GradientPaint(0,0,Color.decode("#1CB5E0"),getWidth(),getHeight(),Color.decode("#000046"));
        g2.setPaint(paint);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20,20);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Custom_Button add_btn;
    private components.Custom_Button cancel_btn;
    private components.Custom_JTextField cost_tf;
    private components.Custom_JTextField date_tf;
    private components.Custom_Combo_Box edition_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private components.Custom_JTextField publisher_tf;
    private components.Custom_JTextField serial_tf;
    private components.Custom_Combo_Box tag_tf;
    private components.Custom_JTextField title_tf;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if(e.getSource() == title_tf && !title_tf.getText().equals("") && e.getKeyCode() == 10){
           publisher_tf.requestFocus();
       }else if(e.getSource() == publisher_tf && !publisher_tf.getText().equals("") && e.getKeyCode() == 10){
          edition_tf.requestFocus();
       }else if(e.getSource() == edition_tf && ! edition_tf.getSelectedItem().toString().equalsIgnoreCase("SELECT TAG") && e.getKeyCode() == 10){
           cost_tf.requestFocus();
       }else if(e.getSource() == cost_tf && ! cost_tf.getText().equals("") && e.getKeyCode() == 10){
           tag_tf.requestFocus();
       }else if(e.getSource() == tag_tf && !tag_tf.getSelectedItem().toString().equalsIgnoreCase("SELECT")&& e.getKeyCode() == 10){
           add_btn.requestFocus();
       }else if(e.getSource() == add_btn && e.getKeyCode() == 10){
           addRecords();
           title_tf.setText("");
           publisher_tf.setText("");
           edition_tf.setSelectedIndex(0);
           cost_tf.setText("");
           tag_tf.setSelectedIndex(0);
           serial_tf.setText(String.valueOf(Integer.parseInt(serial_tf.getText())+1));
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
    private void addRecords(){
        if(!(tag_tf.getSelectedItem().toString().equalsIgnoreCase("SELECT TAG"))){
        data = new Books_Details();
        data.setDate(date_tf.getText());
        data.setSerialNo(Integer.parseInt(serial_tf.getText()));
        data.setTitle(title_tf.getText());
        data.setPublisher(publisher_tf.getText());
        data.setEdition(edition_tf.getSelectedItem().toString().toLowerCase()+" edition");
        data.setCost(Integer.parseInt(cost_tf.getText()));
        data.setTags(tag_tf.getSelectedItem().toString());
        data.setFlag(1);
                
          try {
              Connect_DBMS.getInstence().addRecords(data);
              Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
                  Dashboard.retrieveData();
                     dialog.setDialogMess("Saved Successfully...");
                     dialog.setDialogLogo("check");
                     dialog.show();
                     
                      
          } catch (ClassNotFoundException | SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(Main.getInstence(), ex);
          }
          
          try {
                Dashboard.retrieveData();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }else {
                     Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
            try {
                Dashboard.retrieveData();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }
                     dialog.setDialogMess("Please enter book tag");
                     dialog.setDialogLogo("list");
                     dialog.show();
        }
       
    }
}
