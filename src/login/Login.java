package login;

import form.Main_Panel;
import customdialog.Show_Message_Dialog;
import database.Connect_DBMS;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.*;
import java.util.ArrayList;
import main.Main;
import modelclass.Login_Details;


public class Login extends javax.swing.JPanel {
    
    public Login() {
        initComponents();
        setOpaque(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        PassContainer = new javax.swing.JPanel();
        password = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();
        eyeLabel = new javax.swing.JLabel();
        UserContainer = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();

        setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background/splashBackground.gif"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new Color(255,255,255,220)
        );
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Bebas", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("wELCOME");
        Left.add(jLabel5);
        jLabel5.setBounds(10, 380, 380, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo/library books.png"))); // NOI18N
        Left.add(jLabel6);
        jLabel6.setBounds(30, 10, 340, 350);

        jLabel7.setFont(new java.awt.Font("Fira Code Light", 0, 11)); // NOI18N
        jLabel7.setText("to e-library management system");
        Left.add(jLabel7);
        jLabel7.setBounds(105, 423, 220, 15);

        jPanel1.add(Left);
        Left.setBounds(0, 0, 400, 500);
        Left.getAccessibleContext().setAccessibleName("Left");

        Right.setBackground(new Color(255,255,255,50));
        Right.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo/user.png"))); // NOI18N
        Right.add(jLabel1);
        jLabel1.setBounds(135, 70, 126, 126);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        Right.add(jLabel3);
        jLabel3.setBounds(50, 200, 70, 18);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("FiraCode Nerd Font Mono Med", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        Right.add(jLabel4);
        jLabel4.setBounds(50, 280, 70, 18);

        LoginBtn.setBackground(Color.decode("#40E0D0")
        );
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.setPreferredSize(new java.awt.Dimension(72, 80));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginBtnKeyPressed(evt);
            }
        });
        Right.add(LoginBtn);
        LoginBtn.setBounds(145, 390, 100, 30);

        ExitBtn.setBackground(new Color(0,102,102,0));
        ExitBtn.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(null);
        ExitBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        Right.add(ExitBtn);
        ExitBtn.setBounds(362, 2, 30, 27);

        PassContainer.setBackground(new Color(255,255,255,50));
        PassContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 2, true));
        PassContainer.setPreferredSize(new java.awt.Dimension(300, 40));

        password.setBackground(new Color(255,255,255,0));
        password.setOpaque(false);
        password.setPreferredSize(new java.awt.Dimension(300, 40));
        password.setLayout(null);

        PasswordField.setBackground(new Color(255,255,255,0));
        PasswordField.setColumns(15);
        PasswordField.setFont(new java.awt.Font("Fira Code SemiBold", 0, 14)); // NOI18N
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.setBorder(null);
        PasswordField.setEchoChar('*');
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });
        password.add(PasswordField);
        PasswordField.setBounds(0, 0, 265, 40);

        eyeLabel.setBackground(new Color(255,255,255,0));
        eyeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/eye close.png"))); // NOI18N
        eyeLabel.setOpaque(true);
        eyeLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        eyeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eyeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eyeLabelMouseExited(evt);
            }
        });
        password.add(eyeLabel);
        eyeLabel.setBounds(265, 0, 40, 40);

        javax.swing.GroupLayout PassContainerLayout = new javax.swing.GroupLayout(PassContainer);
        PassContainer.setLayout(PassContainerLayout);
        PassContainerLayout.setHorizontalGroup(
            PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PassContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PassContainerLayout.setVerticalGroup(
            PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PassContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Right.add(PassContainer);
        PassContainer.setBounds(50, 300, 300, 40);

        UserContainer.setBackground(new Color(255,255,255,50));
        UserContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 2, true));
        UserContainer.setPreferredSize(new java.awt.Dimension(300, 40));

        Username.setBackground(new Color(0,0,0,0));
        Username.setColumns(15);
        Username.setFont(new java.awt.Font("Fira Code SemiBold", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(51, 51, 51));
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username.setBorder(null);
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout UserContainerLayout = new javax.swing.GroupLayout(UserContainer);
        UserContainer.setLayout(UserContainerLayout);
        UserContainerLayout.setHorizontalGroup(
            UserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(UserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UserContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        UserContainerLayout.setVerticalGroup(
            UserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(UserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UserContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Right.add(UserContainer);
        UserContainer.setBounds(50, 220, 300, 40);

        jPanel1.add(Right);
        Right.setBounds(400, 0, 400, 500);

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
      System.exit(1);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void eyeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeLabelMouseEntered
        PasswordField.setEchoChar('\u0000');
        eyeLabel.removeAll();
        eyeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/eye open.png")));
    }//GEN-LAST:event_eyeLabelMouseEntered

    private void eyeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeLabelMouseExited
        PasswordField.setEchoChar('*');
        eyeLabel.removeAll();
        eyeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/eye close.png")));
    }//GEN-LAST:event_eyeLabelMouseExited

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        initLogin();  
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyPressed
      
        if(!(Username.getText().isBlank()) && evt.getKeyCode()==10 && evt.getSource()==Username){
            PasswordField.requestFocus();
        }
    }//GEN-LAST:event_UsernameKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
       
        if(!(PasswordField.getText().isBlank()) && evt.getKeyCode()==10 && evt.getSource()==PasswordField){
           initLogin();
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
          initLogin();  
    }//GEN-LAST:event_LoginBtnKeyPressed
 
    private void showDialog(String Message,String Icons){
         Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
            dialog.setDialogMess(Message);
            dialog.setDialogLogo(Icons);
            dialog.setVisible(true);
    }
    
    private void initLogin(){
        
      //  showDialog("Logged in Successfully...","lock");
        ArrayList<Login_Details> ArrLoginDetails = new  ArrayList<Login_Details>();
        ResultSet rs = null;
        String username = Username.getText();
       
        ArrLoginDetails.removeAll(ArrLoginDetails);
        
        if(!(username.isBlank())){
            
            try {
                //javax.swing.JOptionPane.showMessageDialog(this,"ok");
            rs = Connect_DBMS.getInstence().getResultSet("SELECT * FROM Login");
            
            while(rs.next()){
                Login_Details loginDetails = new Login_Details();
                loginDetails.setUsername(rs.getString(1));
                loginDetails.setPassword(rs.getString(2));
                ArrLoginDetails.add(loginDetails);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        if((Username.getText()).trim().equalsIgnoreCase(ArrLoginDetails.get(0).getUsername())){
            
            if(PasswordField.getText().equals(ArrLoginDetails.get(0).getPassword())){
                /*      do your code here                 */
                showDialog("Logged in Successfully...","lock");
                Main.getInstence().remove(this);
                Main.getInstence().setBounds(50,20,1180,620);
                Main_Panel mainPanel = new Main_Panel();
                mainPanel.setSize(1180,620);
                Main.getInstence().add(mainPanel);
                Main.getInstence().revalidate();
                Main.getInstence().repaint();
                
            }else{
                showDialog("Please Enter Valid Password","complain");
            }
            
        }else{
            showDialog("Please Enter Valid Username","complain");
        }
      } else {
           showDialog("enter valid username & password","complain");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15,15);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel PassContainer;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel UserContainer;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel eyeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel password;
    // End of variables declaration//GEN-END:variables
}
