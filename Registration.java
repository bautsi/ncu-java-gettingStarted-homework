public class Registration{
    public static void main(String [] args){
        UnderGraduate u1 = new UnderGraduate("Mary","MIS",0);
        u1.addCredits(21);
        u1.addCredits(15);
        u1.setHonor(true);
        //u1.setHonor(false);
        //System.out.print(u1);
        System.out.println(u1.tuition());


        //Graduate u2 =new Graduate("Jack", "MIS", 0, "Prof.CYCHEN");
        //u2.addCredits(1);
        //u2.addCredits(1);
        //System.out.print(u2);
        //System.out.println(u2.tuition());
    }
}
