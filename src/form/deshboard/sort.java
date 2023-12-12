package form.deshboard;

import components.Custom_RadioButton;
import components.Table;
import form.Dashboard;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Stack;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import main.Main;
import modelclass.Books_Details;


public class sort extends javax.swing.JPanel implements MouseListener {
   
    private final Table TableList ;
   // private final ArrayList<Books_Details> data ; 
    public sort() {
        initComponents();
        Serial_rb.addMouseListener(this);
        cost_rb.addMouseListener(this);
        tags_rb.addMouseListener(this);
        name_rb.addMouseListener(this);
        date_rb.addMouseListener(this);
        edition_rb.addMouseListener(this);
        setOpaque(false);
        ButtonGroup group = new ButtonGroup();
        group.add(cost_rb);
        group.add(cost_rb);
        group.add(tags_rb);
        group.add(name_rb);
        group.add(date_rb);
        group.add(edition_rb);
        group.add(Serial_rb);
        TableList = Dashboard.getListTable();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name_rb = new components.Custom_RadioButton();
        date_rb = new components.Custom_RadioButton();
        cost_rb = new components.Custom_RadioButton();
        tags_rb = new components.Custom_RadioButton();
        edition_rb = new components.Custom_RadioButton();
        Serial_rb = new components.Custom_RadioButton();

        setPreferredSize(new java.awt.Dimension(250, 230));
        setLayout(new java.awt.GridLayout(7, 0, 10, 5));

        jLabel1.setFont(new java.awt.Font("Fira Code SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sort by");
        add(jLabel1);

        name_rb.setBackground(new java.awt.Color(245, 1, 41));
        name_rb.setBorder(null);
        name_rb.setForeground(new java.awt.Color(255, 255, 255));
        name_rb.setText("Name");
        name_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(name_rb);

        date_rb.setBackground(new java.awt.Color(0, 255, 242));
        date_rb.setBorder(null);
        date_rb.setForeground(new java.awt.Color(255, 255, 255));
        date_rb.setText("Date");
        date_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(date_rb);

        cost_rb.setBackground(new java.awt.Color(105, 248, 0));
        cost_rb.setBorder(null);
        cost_rb.setForeground(new java.awt.Color(255, 255, 255));
        cost_rb.setText("Cost");
        cost_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(cost_rb);

        tags_rb.setBackground(new java.awt.Color(239, 5, 228));
        tags_rb.setBorder(null);
        tags_rb.setForeground(new java.awt.Color(255, 255, 255));
        tags_rb.setText("Tags");
        tags_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(tags_rb);

        edition_rb.setBackground(new java.awt.Color(192, 0, 255));
        edition_rb.setBorder(null);
        edition_rb.setForeground(new java.awt.Color(255, 255, 255));
        edition_rb.setText("Edition");
        edition_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(edition_rb);

        Serial_rb.setBorder(null);
        Serial_rb.setForeground(new java.awt.Color(255, 255, 255));
        Serial_rb.setText("Serial No");
        Serial_rb.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 0, 14)); // NOI18N
        add(Serial_rb);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new GradientPaint(0,0,Color.decode("#1CB5E0"),getWidth(),getHeight(),Color.decode("#000046")));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.setColor(new Color(255,255,255,150));
        g2.fillRoundRect(5, 27, getWidth()-10, 2, 5, 5);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Custom_RadioButton Serial_rb;
    private components.Custom_RadioButton cost_rb;
    private components.Custom_RadioButton date_rb;
    private components.Custom_RadioButton edition_rb;
    private javax.swing.JLabel jLabel1;
    private components.Custom_RadioButton name_rb;
    private components.Custom_RadioButton tags_rb;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Custom_RadioButton buttonChoosen = (Custom_RadioButton) e.getSource();
        if(buttonChoosen == Serial_rb && Serial_rb.isEnabled()){
            this.setVisible(false);
            sortBySerialNo();
        }else if(buttonChoosen == cost_rb && cost_rb.isEnabled()){
            this.setVisible(false);
            sortByCost();
        }else if(buttonChoosen == tags_rb && tags_rb.isEnabled()){
            this.setVisible(false);
            sortByTag();
        }else if(buttonChoosen == name_rb && name_rb.isEnabled()){
            this.setVisible(false);
            sortByName();
        }else if(buttonChoosen == edition_rb && edition_rb.isEnabled()){
            this.setVisible(false);
            sortByEdition();
        }else if(buttonChoosen == date_rb && date_rb.isEnabled()){
            this.setVisible(false);
            try {
                sortByDate();
            } catch (ParseException ex) {
               javax.swing.JOptionPane.showMessageDialog(Main.getInstence(), ex);
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
  
    }

    @Override
    public void mouseExited(MouseEvent e) {
 
    }

    
    
    private void sortBySerialNo() {
              
        for(int i = Dashboard.getBooksDetails().size()-1;i>=1;i--){
            for(int j = 0 ; j<i;j++){
                if(Dashboard.getBooksDetails().get(j).getSerialNo() > Dashboard.getBooksDetails().get(j+1).getSerialNo()){
                
                    Collections.swap(Dashboard.getBooksDetails(), j, j+1);
                }
            }
        }
        
       ((DefaultTableModel)TableList.getModel()).setRowCount(0);
        for (Books_Details row : Dashboard.getBooksDetails()) {
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
            
    }

    
    
    private void sortByCost() {
        // Insertion Sort
        int j,i;
        for( i = 1;i<Dashboard.getBooksDetails().size();i++){
            Books_Details TempBook = Dashboard.getBooksDetails().get(i);
            for( j = i-1;j>=0;j--){
                if(Dashboard.getBooksDetails().get(j).getCost()>TempBook.getCost()){
                    Dashboard.getBooksDetails().set(j+1, Dashboard.getBooksDetails().get(j));
                }else{
                    break;
                }
            }
            Dashboard.getBooksDetails().set(j+1, TempBook);
        }
        
         ((DefaultTableModel)  TableList.getModel()).setRowCount(0);
        for(Books_Details row : Dashboard.getBooksDetails()){
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
    }

    
    
    private void sortByName() {
        
        // Selection Sort
        
      for(int i=0;i<(Dashboard.getBooksDetails().size()-1);i++){
            for(int j=i+1;j<Dashboard.getBooksDetails().size();j++){
              
                if(Dashboard.getBooksDetails().get(i).getTitle().compareToIgnoreCase(Dashboard.getBooksDetails().get(j).getTitle())>0){

                    Collections.swap(Dashboard.getBooksDetails(), i, j);
            
                }
                
            }
        }  
        ((DefaultTableModel)  TableList.getModel()).setRowCount(0);
        for(Books_Details row : Dashboard.getBooksDetails()){
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        } 
    }

    
    
    private void sortByEdition() {
        
       Stack<String> stack = new Stack<>();
       
       stack.push("second edition");
       stack.push("third edition");
       stack.push("fourth edition");
       stack.push("fifth edition");
       stack.push("sixth edition");
       stack.push("seventh edition");
       stack.push("eight edition");
       stack.push("ninth edition");
       stack.push("tenth edition");
       
       int next = 0;
       
       while(!stack.empty()){
           String popedValue = stack.pop();
           
           for(int i = next ; i < Dashboard.getBooksDetails().size();i++){
               if(Dashboard.getBooksDetails().get(i).getEdition().equalsIgnoreCase(popedValue)){
                   Collections.swap(Dashboard.getBooksDetails(), next, i);
                   next++;
               }
           }
       }
        
         ((DefaultTableModel)  TableList.getModel()).setRowCount(0);
        for(Books_Details row : Dashboard.getBooksDetails()){
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
    }
    
    
    
    
    private void sortByTag() {
       Stack<String> stack = new Stack<>();
       
       stack.push("vs");
       stack.push("python");
       stack.push("java");
       stack.push("c++");
       stack.push("c");
       stack.push("rdbms");
       stack.push("dbms");
       stack.push("architecture");
       stack.push("networking");
       stack.push("fundamental");
       stack.push("os");
       
       int next = 0;
       
       while(!stack.empty()){
           String popedValue = stack.pop();
           
           for(int i = next ; i < Dashboard.getBooksDetails().size();i++){
               if(Dashboard.getBooksDetails().get(i).getTags().equalsIgnoreCase(popedValue)){
                   Collections.swap(Dashboard.getBooksDetails(), next, i);
                   next++;
               }
           }
       }
        
         ((DefaultTableModel)  TableList.getModel()).setRowCount(0);
        for(Books_Details row : Dashboard.getBooksDetails()){
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
    
    }

    
    
    
    private void sortByDate() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        
        //      Selection Sort 
        
        for(int i=0;i<(Dashboard.getBooksDetails().size()-1);i++){
            for(int j=i+1;j<Dashboard.getBooksDetails().size();j++){
              
                if(df.parse(Dashboard.getBooksDetails().get(i).getDate()).before(df.parse(Dashboard.getBooksDetails().get(j).getDate()))){

                    Collections.swap(Dashboard.getBooksDetails(), i, j);
                }
                
            }
        }  
        ((DefaultTableModel)  TableList.getModel()).setRowCount(0);
        for(Books_Details row : Dashboard.getBooksDetails()){
            TableList.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
    }
    
    
}
