package form;

import components.ScrollBar;
import components.Table;
import customdialog.Show_Message_Dialog;
import database.Connect_DBMS;
import header.Header;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.Main;
import modelclass.Books_Details;
import modelclass.Card_Model;



public class Dashboard extends javax.swing.JPanel {

    private static int totalStocks=0;
    private static int numIssueBooks=0;
    private static int numAvailableBooks=0;
    private static int serialNo=0;

   
    public static int getSerialNo() {
        return serialNo;
    }
    
    private static ArrayList<Books_Details> booksDetails,searchByTagBooks;
    private static JTextField searchText;

    public static ArrayList<Books_Details> getBooksDetails() {
        return booksDetails;
    }
    
    public Dashboard() {
        
           Header header = Main_Panel.getDashboardSearch();
           
        try {
            initComponents();
            retrieveData();
            
                       // Searching 
            searchText = header.getSearchedText();
            searchText.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    
                }

                @Override
                public void keyPressed(KeyEvent e) {
                   if(e.getKeyCode()==10&&!searchText.getText().isEmpty()){
                       int flag = 0;
                       int index = 0;
                       String searchedText = searchText.getText();
                       searchByTagBooks = new ArrayList<>();
                       for(Books_Details data : booksDetails){
                           index++;
                           
                           if(searchedText.equalsIgnoreCase(String.valueOf(data.getSerialNo()))) {
                              flag = 1;
                              break;
                          }else if(data.getTags().equalsIgnoreCase(searchedText.trim())){
                              if(flag == 0 && !searchByTagBooks.isEmpty()){
                                  searchByTagBooks.removeAll(booksDetails);
                              }
                              flag = 2;
                              searchByTagBooks.add(data);
                          }
                       }
                       
                       switch (flag) {
                           case 1 ->{
//                                   Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
//                                   dialog.setDialogLogo("lock");
//                                   dialog.setDialogMess("one record fund");
//                                   dialog.show();
                                   
                                   ((DefaultTableModel) listTable.getModel()).setRowCount(0);
                       
                                   for(Books_Details row : booksDetails){
                                   listTable.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
                                   }
                                   listTable.setRowSelectionInterval(index-1, index-1);
                                   listTable.scrollRectToVisible(listTable.getCellRect(index-1, index-1, true));
                                   break;
                               }
                           case 2 ->{
                                   Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
                                   dialog.setDialogLogo("list");
                                   dialog.setDialogMess("List of all " + searchText.getText() + " books");
                                   dialog.show();
                                   
                                   ((DefaultTableModel) listTable.getModel()).setRowCount(0);
                                   
                                   for(Books_Details row : searchByTagBooks){
                                   listTable.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
                                   }
                             break; 
                           }
                           default ->{
                                   Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
                                   dialog.setDialogLogo("notfound");
                                   dialog.setDialogMess("No records found");
                                   dialog.show();
                                   
                                   ((DefaultTableModel) listTable.getModel()).setRowCount(0);
                                   
                                   for(Books_Details row : booksDetails){
                                   listTable.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
                                   }
                                   break;
                               }

                       }
                             
                       
                   } else if(e.getKeyCode()==10 && searchText.getText().isEmpty()){
                       ((DefaultTableModel) listTable.getModel()).setRowCount(0);
                       
                       for(Books_Details row : booksDetails){
                       listTable.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
                       }
                  }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    
                }
            });
            
            scrollPanel.setVerticalScrollBar(new ScrollBar());
            scrollPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        } catch (SQLException | ClassNotFoundException ex) {
           
        }
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JLayeredPane();
        card1 = new components.card();
        card2 = new components.card();
        tag_Card2 = new components.Tag_Card();
        panelBorder1 = new components.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        listTable = new components.Table();

        setPreferredSize(new java.awt.Dimension(625, 625));

        Panel.setPreferredSize(new java.awt.Dimension(625, 100));
        Panel.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        Panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        Panel.add(card2);
        Panel.add(tag_Card2);

        jLabel1.setFont(new java.awt.Font("Fira Code SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("List of Books");

        scrollPanel.setBorder(null);

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL NO", "DATE", "TITLE", "PUBLISHER", "EDITION", "COST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanel.setViewportView(listTable);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Panel;
    private static components.card card1;
    private static components.card card2;
    private javax.swing.JLabel jLabel1;
    private static components.Table listTable;
    private components.PanelBorder panelBorder1;
    private javax.swing.JScrollPane scrollPanel;
    private components.Tag_Card tag_Card2;
    // End of variables declaration//GEN-END:variables

  
    public static void retrieveData() throws SQLException, ClassNotFoundException {
        booksDetails = new ArrayList<>();
        Books_Details data;
        totalStocks = 0;
        numAvailableBooks = 0;
        numIssueBooks = 0;
        ResultSet resultSet = Connect_DBMS.getInstence().getResultSet("SELECT * FROM books_details");
        
        while(resultSet.next()){
            data = new Books_Details();
            data.setDate(resultSet.getString(1));
            data.setSerialNo(resultSet.getInt(2));
            data.setTitle(resultSet.getString(3));
            data.setPublisher(resultSet.getString(4));
            data.setEdition(resultSet.getString(5));
            data.setCost(resultSet.getInt(6));
            data.setFlag(resultSet.getInt(7));
            data.setTags(resultSet.getString(8));
            
            totalStocks++;
            if(data.getFlag()==1){
                numAvailableBooks++;
            }else{
                numIssueBooks++;
            }
            booksDetails.add(data);
            
            // serial no 
            
            if(serialNo < data.getSerialNo()){
                serialNo = data.getSerialNo();
            }
            
        }
        ((DefaultTableModel) listTable.getModel()).setRowCount(0);
        for(Books_Details row : booksDetails){
            listTable.addRow(new Object[]{row.getSerialNo(),row.getDate(),row.getTitle(),row.getPublisher(),row.getEdition(),row.getCost()});
        }
         card1.setData(new Card_Model("stock","Total Stock",String.valueOf(totalStocks),"","books are in library"));
         card2.setData(new Card_Model("Issue","Issue Books",String.valueOf(numIssueBooks),"Available Books",String.valueOf(numAvailableBooks)));  
    }

    public static Table getListTable() {
        return listTable;
    }
}
