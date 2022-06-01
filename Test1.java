public class Test1{
    public static void main(String [] args){
        A1 a=new A1();
        //B1 b=a; //用不到了
        C1 c=a;
        
        c.m2(); //OK
        //b.m3(); //因C沒有m3()所以不能DMB
    }
}
