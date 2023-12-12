package database;

import customdialog.Show_Message_Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.Main;
import modelclass.Books_Details;


public class Connect_DBMS {
    
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String Username = "C##Administrator";
    private final String Password = "bcapartthird";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private static Connect_DBMS connectdb=null;
  
    
    private Connect_DBMS() throws ClassNotFoundException, SQLException{
        connect();
    }
    
    public  final Connection connect(){
        
    
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            try {
                this.connection = DriverManager.getConnection(url,Username,Password);
                this.statement = connection.createStatement();
                
            } catch (SQLException ex) {
                   
            Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
            dialog.setDialogMess("Faild to initilize connection with database !!!");
            dialog.setDialogLogo("complain");
            dialog.setVisible(true);
    
            }
            
        } catch (ClassNotFoundException ex) {
            Show_Message_Dialog dialog = new Show_Message_Dialog(Main.getInstence(),true);
            dialog.setDialogMess("Faild to connect with database class !!!");
            dialog.setDialogLogo("complain");
            dialog.setVisible(true);
        }
        return connection;
    }
    
    public static Connect_DBMS getInstence() throws ClassNotFoundException, SQLException{
        if(connectdb==null){
            connectdb = new Connect_DBMS();
        }
        return connectdb;
    }
    
    public ResultSet getResultSet(String query) throws SQLException{
        this.resultSet = statement.executeQuery(query);
        return this.resultSet;
    }
    
    public void addRecords(Books_Details data) throws SQLException{
               
        this.statement.executeQuery("INSERT INTO books_details (data,serial_no,title,publisher,edition,cost,flag,tag)" +
                                      "VALUES ('"+data.getDate()+"','"+data.getSerialNo()+"','"+data.getTitle()+ "','"+data.getPublisher()+"','"+data.getEdition()+"','"+data.getCost()+"','"+data.getFlag()+"','"+data.getTags()+"')");
        
        this.statement.executeQuery("commit"); 
    }
    
    
    public void updateRecords(Books_Details data) throws SQLException{
        
        this.statement.executeQuery("Update books_details "  +
                                     "set " + " data = '" + data.getDate()+"', title = '"+data.getTitle()+"' , publisher = '"+data.getPublisher()+"' , edition = '"+data.getEdition()+"' , cost = '"+data.getCost()+"' , tag = '"+data.getTags()+"' "
        + " where serial_no = '"+data.getSerialNo()+"' ");
      
       this.statement.executeQuery("commit");
    }
    
    public void deleteRecord(String serialNo) throws SQLException{
        this.statement.executeQuery("DELETE FROM books_details WHERE serial_no = " + serialNo);
        this.statement.executeQuery("commit");
    }
}
