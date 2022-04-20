public class Ticket1{
    private int price;
    private String date;
    private String name;

    public Ticket1 ( String date , int price){
        setDate(date);
        setPrice(price);
    }

    public Ticket1 ( String date , String name){
        setDate(date);
        setName(name);
    }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setDate(String date){ this.date = date; }
    public String getDate(){ return date; }

    public void setPrice(int price){ this.price = price; }
    public int getPrice(){ return price; }

    public String sales(){
        return  getDate() + (( getName() != null ) ? "送出一張票。" : "售出一張票。")  + (( getName() != null ) ? "貴賓 : " + getName() : "票價 : " + getPrice() );
    }
}