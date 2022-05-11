public class MemberManager {
    public static void main(String [] args){
        Members m [] = new Members[5];
        m[0] = new Members("Lee",  50000);
        m[1] = new Members("Wang", 30000);
        m[2] = new Members("Chen", 80000);
        m[3] = new Members("Wu",   40000);
        m[4] = new Members("Lin",  40000);
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