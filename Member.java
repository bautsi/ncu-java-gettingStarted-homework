public class Member {
    private String name;
    private int fee;
    
    
    public Member(String name, int fee) {
     setName(name);
     setFee(fee);
     
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String toString(){
        return getName() + " Membership fee:" + getFee();
    } 
   }