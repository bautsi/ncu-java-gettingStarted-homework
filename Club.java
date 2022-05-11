public class Club {
    private Member people[]=new Member[20];
    private int howmany=0;
    private int total=0;
    private int fees;

    public void addMember(Member m){
        if (howmany<20){
            people [howmany++]= m;
        }
    }
    
    public void setFee(int fee){
        fee = fees;
    }

    public Club(){
        setFee(fees);
    }

    public int getFee(){
        return fees;
    }
    
    public int totalFees(){
        for(Member j:people){
            if(j!=null){
                total+=j.getFee();
            }
        }
        return total;
    }

    public String getMember(){
        String output="";
        for (int i=0 ;i<20;i++){
            if (people[i]!=null){
            output += people[i] + "\n";
            }
        }
    return output;
    }

    public String toString(){
     return getMember();
    }
}