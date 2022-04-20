public class Special_Ticket {
    private int price;
    private int quantity;
    private double discount;

    public Special_Ticket ( int price , int quantity , double discount ){
        setPrice(price);
        setQuantity(quantity);
        setDiscount(discount);
    }

    public void setPrice(int price){ this.price = price; }
    public int getPrice(){ return price; }

    public void setQuantity(int quantity){ this.quantity = quantity; }
    public int getQuantity(){ return quantity; }

    public void setDiscount(double discount){ this.discount = discount; }
    public double getDiscount(){ return discount; }

    public void sales(int quantity){
        this.quantity+=quantity;
    }

    public String toString(){
        return "Special ticket 累積銷售金額達 " + getPrice() * getQuantity() * getDiscount() + " 元";
    }

}
