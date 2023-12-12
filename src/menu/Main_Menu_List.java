package menu;

import customdialog.Confirm_Dialog;
import form.Main_Panel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import main.Main;
import modelclass.Menu_Model;

public class Main_Menu_List<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = 0;
    
    
    public Main_Menu_List(){
       model = new DefaultListModel();
       setModel(model); 
      // setSelectedIndex(0);
       
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Menu_Model) {
                        Menu_Model menu = (Menu_Model) o;
                        if (menu.getType() == Menu_Model.MenuType.MENU) {
                            selectedIndex = index;
                         if(index==0){
                             // code here for dashbord
                             Main_Panel.getContainer().removeAll();
                             Main_Panel.getContainer().add(Main_Panel.getDashbordInstence());
                             Main_Panel.getContainer().revalidate();
                             Main_Panel.getContainer().repaint();
                             Sub_Menu_List.getSubMenuModel().removeAllElements();
                             Menu.getSubMenu().addItem(new Menu_Model("","Available Actions",Menu_Model.MenuType.TITLE));
                             Menu.getSubMenu().addItem(new Menu_Model("Add", "Add", Menu_Model.MenuType.MENU));
                             Menu.getSubMenu().addItem(new Menu_Model("update", "Update", Menu_Model.MenuType.MENU));
                             Menu.getSubMenu().addItem(new Menu_Model("Sorting", "Sort", Menu_Model.MenuType.MENU));
                             Menu.getSubMenu().addItem(new Menu_Model("Delete", "Delete", Menu_Model.MenuType.MENU));
                             Menu.getSubMenu().addItem(new Menu_Model("","",Menu_Model.MenuType.EMPTY));
                             Menu.getSubMenu().addItem(new Menu_Model("","",Menu_Model.MenuType.EMPTY));
                             Menu.getSubMenu().addItem(new Menu_Model("","",Menu_Model.MenuType.EMPTY));
                             Menu.getSubMenu().addItem(new Menu_Model("","",Menu_Model.MenuType.EMPTY));
                             Menu.getSubMenu().addItem(new Menu_Model("","",Menu_Model.MenuType.EMPTY));      
                                                        
                         }else if(index==1){
                             // code hare for Students details
                             Main_Panel.getContainer().removeAll();
                             Main_Panel.getContainer().add(Main_Panel.getStudentsInstence());
                             Main_Panel.getContainer().revalidate();
                             Main_Panel.getContainer().repaint();
                             Sub_Menu_List.getSubMenuModel().removeAllElements();
                         }else if(index==2){
                             // code here for issue books
                             Main_Panel.getContainer().removeAll();
                             Main_Panel.getContainer().add(Main_Panel.getIssueBookInstence());
                             Main_Panel.getContainer().revalidate();
                             Main_Panel.getContainer().repaint();
                             Sub_Menu_List.getSubMenuModel().removeAllElements();
                         }else if(index==3){
                             // code here for logout
                             Confirm_Dialog confirmDialog = new Confirm_Dialog(Main.getInstence(),true);
                             confirmDialog.setDialogIcon("4");
                             confirmDialog.setDialogMessage("Do you want to logout...");
                             confirmDialog.show();
                             int response = confirmDialog.getResponse();
                             
                             if(response == 0){
                                 System.exit(0);
                                 Sub_Menu_List.getSubMenuModel().removeAllElements();
                             }
                         }else{
                              // Code here for about us 
                             Main_Panel.getContainer().removeAll();
                             Main_Panel.getContainer().add(Main_Panel.getAboutInstence());
                             Main_Panel.getContainer().revalidate();
                             Main_Panel.getContainer().repaint();
                             Sub_Menu_List.getSubMenuModel().removeAllElements();
                         }
                        
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
       return new DefaultListCellRenderer(){
           @Override
           public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
               Menu_Model data;
               if(value instanceof Menu_Model){
                   data= (Menu_Model) value;
               }else{
                   data = new Menu_Model("", "",Menu_Model.MenuType.EMPTY);
               }
               Menu_Item item = new Menu_Item(data);
               item.setSelected(selectedIndex == index);
               return item;
           }
           
       };
    }

    void addItem(Menu_Model data) {
         model.addElement(data);
    }

}
