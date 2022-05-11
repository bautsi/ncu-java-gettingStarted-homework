public class Club {
    private Member enrollment [] = new Member[20];
    private int numofs;
    private int total;
    private int fees;
    
    public Club() {
     setFee(fees);
     numofs = 0;
    }

    public void setFee(int fee) {fee = fees;}
    public int getFee() {return fees;}
    
    public int totalFees() {
     total+=fees;
     return total;
    }
   
    public void addMember(Member m) {
     
    
     if (numofs<20) {
      enrollment [numofs++]= m;
     }
     
    }
    
    public String getMember() {
     String output="";
     for (int i = 0 ;i <=19; i++) {
      if (enrollment[i]!=null){
       output += enrollment[i] + "\n";
      }
     }
     return output;
     
    }
    public String toString() {
     return getMember();
    }
   }