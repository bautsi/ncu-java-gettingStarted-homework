public class Regular_Ticket {
    private int price;
    private int quantity;

    public Regular_Ticket ( int price , int quantity){
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(int price){ this.price = price; }
    public int getPrice(){ return price; }

    public void setQuantity(int quantity){ this.quantity = quantity; }
    public int getQuantity(){ return quantity; }

    public void sales(int quantity){
        this.quantity+=quantity;
    }

    public String toString(){
        return "Regular ticket 累積銷售金額達 " + getPrice() * getQuantity() + " 元";
    }

    
}
