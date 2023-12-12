package modelclass;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Card_Model {
    
    private String icon;
    private String title;
    private String value;
    private String subTitle;
    private String subValue;

    
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    

    public Card_Model(String icon,String title,String value,String subTitle,String subValue){
        this.icon = icon;
        this.title = title;
        this.value = value;
        this.subTitle = subTitle;
        this.subValue = subValue;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String Value) {
        this.value = Value;
    }

    public String getSubValue() {
        return subValue;
    }

    public void setSubValue(String subValue) {
        this.subValue = subValue;
    }
    public Icon imageToIcon(){
        return new ImageIcon(getClass().getResource("/resources/Icons/"+ icon +".png"));
    }
}
