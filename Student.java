public class Student{
    private String name;
    private String major;
    private int credits=0;

    public Student(String name, String major, int credits){
        setName(name);
        setMajor(major);
        addCredits(credits);
    }

    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setMajor(String major){this.major=major;}
    public String getMajor(){return major;}
    public void addCredits(int credits){this.credits+=credits;}
    public int getCredits(){return credits;}
}
