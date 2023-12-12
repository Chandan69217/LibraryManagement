package menu;

import customdialog.Add_Dialog;
import customdialog.Delete_Dialog;
import customdialog.Search_Dialog;
import customdialog.Sort_Dialog;
import customdialog.Update_Dialog;
import form.deshboard.Search;
import header.Header;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import main.Main;
import modelclass.Menu_Model;

public class Sub_Menu_List<E extends Object> extends JList {
    
    private static DefaultListModel model;
    private int SelectedIndex = -1;
    private Sort_Dialog sort=null;
    
    
    public Sub_Menu_List(){
        model = new DefaultListModel();
        setModel(model);
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                     
                    int index = locationToIndex(e.getPoint());
                    Object obj = model.getElementAt(index);
                    if(obj instanceof Menu_Model){
                        Menu_Model Menu = (Menu_Model) obj;
                        if(Menu.getType()==Menu_Model.MenuType.MENU){
                            SelectedIndex = index;
                         if(index == 1){ 
                              
                               Add_Dialog addBox = new Add_Dialog(Main.getInstence(),true);
                               addBox.show();
                         }else if(index == 4){
                             Delete_Dialog deleteDialog = new Delete_Dialog(Main.getInstence(),true);
                             deleteDialog.show();
                         }else if(index == 3){
                             if(sort==null){
                                 sort = new Sort_Dialog(Main.getInstence(),true);
                                 sort.show();
                             }else{
                                 sort.getSortPanel().setVisible(true);
                             }
                             
                         }else if(index == 2){
                             
                             Search_Dialog updateDialog = new Search_Dialog(Main.getInstence(),true);
                             updateDialog.show();
                         }
                        }
                    }else {
                        SelectedIndex = index;
                    }
                }
            }
            
        });
        
    }
    public static DefaultListModel getSubMenuModel(){
        return Sub_Menu_List.model;
    }
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        
        return new  DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Menu_Model data;
                if(value instanceof Menu_Model){
                    data = (Menu_Model) value;
                }else{
                    data = new Menu_Model("","",Menu_Model.MenuType.EMPTY);
                }
                Menu_Item item = new Menu_Item(data);
                item.setSelected(SelectedIndex == index);
                return item;
            }
            
        };
                
    }
        
    void addItem(Menu_Model data) {
        model.addElement(data);
    }
    
}
