public class Test1{
    public static void main(String [] args){
        A1 a=new A1();
        //B1 b=a; //用不到了
        C1 c=a;
        
        c.m2(); //OK
        //b.m3(); //因C沒有m3()所以不能DMB
    }
}

//1.DMB作用的條件：DMB works only for the common methods that are
//　 available in both super and sub@ (super跟sub都
//   有的同一支方法才行)

//2.子類別何情況需要宣告成抽象：當父類別為抽象且此子類別沒有要
//                            implement(實作)時
