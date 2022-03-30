public class Member{
    private String name;
    private int income;
    
    public Member(String name, int income){
        this.name=name;
        this.income=income;
    }

    public int payFee(){
        return income/20;
    }

    public String toString(){
        return "Name: "+name+" Income: "+income+" Membership fee: "+payFee();
    }
}
