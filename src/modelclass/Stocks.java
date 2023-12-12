package modelclass;

public class Stocks {
    private int Quantity;
    private String Tags;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public Stocks(){
        
    }
    public Stocks(int Quantity, String Tags) {
        this.Quantity = Quantity;
        this.Tags = Tags;
    }
    
    public static enum getTagsName{
       OS,FUNDAMENTAL,NETWORKING,ARCHITECTURE,DBMS,RDBMS,C,CC,JAVA,PYTHON,VB,DS;
    }
    
}
