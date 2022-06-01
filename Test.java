public class Test{
    public static void main(String [] args){
        C c=new C();
        A a=new A();

        c.ma();
        c.mb();
        a.ma();
        a.mb();
        a.md();
    }
}

// 1.An interface has only (1)abstract methods (2)constants
//  (1) 介面裡的方法都默認是公開且抽象
//  (2) 介面裡的變數一定是常數且默認是公開、實體和不可被改寫的