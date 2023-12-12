package modelclass;

public class Books_Details {
    private String Date;
    private int SerialNo;
    private String Title;
    private String Publisher;
    private String Edition;
    private String Tags;
    private int Cost;
    private int flag;

    public Books_Details() {
       
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Books_Details(String Date, int SerialNo, String Title, String Publisher, String Edition, String Tags, int Cost, int flag) {
        this.Date = Date;
        this.SerialNo = SerialNo;
        this.Title = Title;
        this.Publisher = Publisher;
        this.Edition = Edition;
        this.Tags = Tags;
        this.Cost = Cost;
        this.flag = flag;
    }
    
    public static  enum getTagsName{
        OS,FUNDAMENTAL,NETWORKING,ARCHITECTURE,DBMS,RDBMS,C,CC,JAVA,PYTHON,VB,DS;
    }
}
