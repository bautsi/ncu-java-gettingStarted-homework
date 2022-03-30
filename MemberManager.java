public class MemberManager {
    public static void main(String [] args){
        Member m [] = new Member[5];
        m[0] = new Member("Lee",  50000);
        m[1] = new Member("Wang", 30000);
        m[2] = new Member("Chen", 80000);
        m[3] = new Member("Wu",   40000);
        m[4] = new Member("Lin",  40000);
        for(int i=0;i<=4;i++){
            System.out.println(m[i]);
        }


        double total=0.0;
        
        for(int j=0;j<=4;j++){
            
            total+=m[j].payFee();
        }
        
        System.out.print("The total membership fees are "+total);

    }   
}