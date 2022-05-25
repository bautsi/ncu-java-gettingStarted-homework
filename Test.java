public class Test{
    public static void main(String [] args){
        A a=new A();
        //B b=a; //用不到了
        C c=a;
        
        c.m2();
        //b.m3(); //因C沒有m3()所以不能DMB
    }
}
