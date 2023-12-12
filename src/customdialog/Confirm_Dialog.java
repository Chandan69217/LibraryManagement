
package customdialog;

import java.awt.Color;
import javax.swing.ImageIcon;


public class Confirm_Dialog extends javax.swing.JDialog {
 
    private String DialogIcon,DialogMessage;
    private int Response;

    public String getDialogIcon() {
        return DialogIcon;
    }

    public void setDialogIcon(String DialogLogo) {
        this.DialogIcon = DialogLogo;
        Logo_lb.setIcon(new ImageIcon(getClass().getResource("/resources/icons/" + this.DialogIcon + ".png")));
    }

    public String getDialogMessage() {
        return DialogMessage;
    }

    public void setDialogMessage(String DialogMessage) {
        this.DialogMessage = DialogMessage;
        Messsage_lb.setText(this.DialogMessage);
    }

    public int getResponse() {
        return Response;
    }

    public void setResponse(int Response) {
        this.Response = Response;
    }
    
    public Confirm_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }



    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel2 = new customdialog.RoundedPanel();
        Logo_lb = new javax.swing.JLabel();
        Messsage_lb = new javax.swing.JLabel();
        cancel_btn = new components.Custom_Button();
        no_btn = new components.Custom_Button();
        yes_btn = new components.Custom_Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Logo_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Delete.png"))); // NOI18N

        Messsage_lb.setText("Show Message Here...");

        cancel_btn.setBorder(null);
        cancel_btn.setText("Cancel");
        cancel_btn.setRadius(15);
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        no_btn.setBorder(null);
        no_btn.setText("No");
        no_btn.setRadius(15);
        no_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_btnActionPerformed(evt);
            }
        });

        yes_btn.setBorder(null);
        yes_btn.setText("Yes");
        yes_btn.setRadius(15);
        yes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Logo_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Messsage_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(no_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Messsage_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(roundedPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        setResponse(3);
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void no_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_btnActionPerformed
        // TODO add your handling code here:
        setResponse(1);
        this.setVisible(false);
    }//GEN-LAST:event_no_btnActionPerformed

    private void yes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_btnActionPerformed
        // TODO add your handling code here:
        setResponse(0);
        this.setVisible(false);
    }//GEN-LAST:event_yes_btnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo_lb;
    private javax.swing.JLabel Messsage_lb;
    private components.Custom_Button cancel_btn;
    private components.Custom_Button no_btn;
    private customdialog.RoundedPanel roundedPanel2;
    private components.Custom_Button yes_btn;
    // End of variables declaration//GEN-END:variables
}
