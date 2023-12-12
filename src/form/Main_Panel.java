package form;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Main_Panel extends javax.swing.JPanel {

   private static Students students;
   private static Issue_Books issueBooks;
   private static About about;
   private static header.Header DashboardSearch,StudentSearch,IssueSearch;
   
   public static  Dashboard getDashbordInstence(){
       if(dashboard == null){
           dashboard = new Dashboard();
       }
       HeaderPanel.removeAll();
       HeaderPanel.add(getDashboardSearch());
       return dashboard;
   }
   
   public static header.Header getDashboardSearch(){
       if(DashboardSearch == null){
           DashboardSearch = new header.Header();
       }
       return DashboardSearch;
   }
   
   
   public static  Students getStudentsInstence(){
       if(students == null){
           students = new Students();
       }
       HeaderPanel.removeAll();
       HeaderPanel.add(getStudentSearch());
       HeaderPanel.revalidate();
       HeaderPanel.repaint();
       return students;
   }
   public static header.Header getStudentSearch(){
       if(StudentSearch == null){
           StudentSearch = new header.Header();
       }
       return StudentSearch;
   }
   
   public static Issue_Books getIssueBookInstence(){
       if(issueBooks == null){
           issueBooks = new Issue_Books();
       }
       HeaderPanel.removeAll();
       HeaderPanel.add(getIssueSearch());
       HeaderPanel.revalidate();
       HeaderPanel.repaint();
       return issueBooks;
   }
   
   public static header.Header getIssueSearch(){
       if(IssueSearch == null){
           IssueSearch = new header.Header();
       }
       return IssueSearch;
   }
   
   public static About getAboutInstence(){
       if(about == null){
           about = new About();
       }
       HeaderPanel.removeAll();
       HeaderPanel.revalidate();
       HeaderPanel.repaint();
       return about;
   }
   
   
    public Main_Panel() {
        initComponents();
        setOpaque(false);
        HeaderPanel.removeAll();
        HeaderPanel.add(getDashboardSearch());
        HeaderPanel.revalidate();
        HeaderPanel.repaint();
    }

    public static javax.swing.JPanel getContainer(){
        return container;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new menu.Menu();
        HeaderPanel = new javax.swing.JPanel();
        header1 = new header.Header();
        container = new javax.swing.JPanel();
        dashboard = new form.Dashboard();

        setBackground(new java.awt.Color(237, 237, 237));
        setPreferredSize(new java.awt.Dimension(1180, 620));

        HeaderPanel.setOpaque(false);
        HeaderPanel.setPreferredSize(new java.awt.Dimension(625, 50));
        HeaderPanel.setLayout(new java.awt.GridLayout(1, 0));

        header1.setPreferredSize(new java.awt.Dimension(625, 50));
        HeaderPanel.add(header1);

        container.setOpaque(false);
        container.setPreferredSize(new java.awt.Dimension(625, 625));
        container.setLayout(new java.awt.GridLayout(1, 0));
        container.add(dashboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
 @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20,20);
        super.paintComponent(g); 
    }

    public static JPanel getHeaderPanel() {
        if(HeaderPanel == null){
            javax.swing.JOptionPane.showMessageDialog(null, "ok");
        }
        return HeaderPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel HeaderPanel;
    private static javax.swing.JPanel container;
    private static form.Dashboard dashboard;
    private header.Header header1;
    private menu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
