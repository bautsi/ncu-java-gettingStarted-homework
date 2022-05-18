public class Graduate extends Student{
    private String advisor;

    public Graduate(String name, String major, int credits, String advisor){
        super(name, major, credits);

        setAdvisor(advisor);
    }

    public int tuition(){return 1500*getCredits();}

    public void setAdvisor(String advisor){this.advisor=advisor;}
    public String getAdvisor(){return advisor;}

    public String toString(){
        return "Name: "+getName()+"\tMajor: "+getMajor()+"\tTution: ";
    }
}
