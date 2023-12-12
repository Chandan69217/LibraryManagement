package splashscreen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

public class Splash_Screen extends javax.swing.JDialog {

   
    public Splash_Screen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(new Color(210,210,210));
    }

    
    public void showStatus(String Details,int Progress,int flag) throws Exception {
       
        switch (flag) {
            case 0 -> {
                Status.setText(Details);
                TeamDetails.setText("");
                Thread.sleep(700);
            }
            case 1 -> {
                Status.setFont(new Font("Bebas",Font.BOLD,18));
                Status.setText("Designing Team:");
                TeamDetails.setText(Details);
                Thread.sleep(1000);
            }
            case 2 -> {
                Status.setText("Logical/Coding Team:");
                TeamDetails.setText(Details);
                Thread.sleep(1000);
            }
            case 3 -> {
                Status.setText("Documentation/PPT Team:");
                TeamDetails.setText(Details);
                Thread.sleep(1000);
            } 
        }
        ProgressBar.setValue(Progress);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new splashscreen.Curves_Panel();
        Logo = new javax.swing.JLabel();
        ProgressBar = new splashscreen.ProgressBar_Custom();
        TeamDetails = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo/logo.png"))); // NOI18N
        Logo.setToolTipText("");

        TeamDetails.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        TeamDetails.setForeground(new java.awt.Color(191, 191, 191));
        TeamDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeamDetails.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Status.setFont(new java.awt.Font("Bebas", 1, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(191, 191, 191));
        Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TeamDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(Status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(210, 210, 210))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TeamDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    showStatus("Loading.",2,0);
                    showStatus("Loading..",7,0);
                    showStatus("Loading...",12,0);
                    showStatus("Loading....",17,0);
                    showStatus("Loading.....",21,0);
                    showStatus("Connecting to database.",23,0);
                    showStatus("Connecting to database..",25,0);
                    showStatus("Connecting to database...",30,0);
                    showStatus("Connecting to database....",35,0);
                    showStatus("Connecting to database.....",40,0);
                    showStatus("Connected to database sucessfully!!",42,0);
                    showStatus("Loading modules.",50,0);
                    showStatus("Loading modules..",65,0);
                    showStatus("Loading modules...",75,0);
                    showStatus("Loading modules....",85,0);
                    showStatus("Loading modules.....",95,0);
                                // Names & Roll No
                                
                                     //   Designing Team:
//                     showStatus("Aditya Kumar || Roll no:- 81",46,1);
//                     showStatus("Insha Jabeen || Roll no:- 23",50,1);
//                     showStatus("Soumya Sinha || Roll no:- 243",54,1);
//                     showStatus("Himanshu Kumar || Roll no:- 199",58,1);
//                     showStatus("Chandan Sharma || Roll no:- 24",62,1);
                                                                               
                                     //  Logical/coding Team:
//                     showStatus("Sonali Kumari|| Roll no:- 15",66,2);
//                     showStatus("Sejal Kumari|| Roll no:- 21",70,2);
//                     showStatus("Shah Srishti || Roll no:- 16",74,2);
//                     showStatus("Chandan Sharma || Roll no:- 24",78,2);
//                     showStatus("Abhitesh Ranjan || Roll no:- 106",82,2);
//                     showStatus("Ritika Kumari || Roll no:- 09",86,2);
//                     showStatus("Anjali Sharma || Roll no:- 290",88,2);
//                     showStatus("Simran Kumari || Roll no:- 204",90,2);
                                    
                                     //  Documentation/ppt Team:     
//                     showStatus("Abhilasha Kumari || Roll no:- 170",93,3);
//                     showStatus("Stuti Upadhyay || Roll no:- 03",95,3);
//                     showStatus("Shivani Kumari || Roll no:- 199",96,3); 
//                     showStatus("Shah Srishti || Roll no:- 16",98,3);
//                     showStatus("Anjali Sharma || Roll no:- 290",98,3);
                     
                     showStatus("WELLCOME",100,0);
                             
                     dispose();
                     Curves_Panel curvepanel1 = new Curves_Panel();
                     curvepanel1.stop();
                }catch (Exception ex) {
                    Logger.getLogger(Splash_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }).start();    
    }//GEN-LAST:event_formWindowOpened

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Splash_Screen dialog = new Splash_Screen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public void paintComponents(Graphics g) {
        Graphics2D g2 = (Graphics2D) g ;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 100, 100);
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 100, 100);
        super.paintComponents(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private splashscreen.ProgressBar_Custom ProgressBar;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel TeamDetails;
    private splashscreen.Curves_Panel curvesPanel1;
    // End of variables declaration//GEN-END:variables
}
