public class UnderGraduate extends Student{
    private boolean honor = false;
    
    public UnderGraduate(String name, String major, int credits){
        super(name, major, credits);

        setHonor(honor);
    }

    public int tuition(){return(honor==true)?500*getCredits():1000*getCredits();}

    public void setHonor(boolean honor){this.honor=honor;}
    public boolean gerHonor(){return honor;}

    //public String toString(){return "Name: "+getName()+"\tMajor: "+getMajor()+"\tTution: ";}
}
