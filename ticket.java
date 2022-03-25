import java.util.Random;
import javax.swing.JOptionPane;
public class ticket{
    public static void main(String [] args){
        int input;
        String ans="";
        input=JOptionPane.showConfirmDialog(null,"開始玩迷你樂透?","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        ans=ans+input;
        switch(Integer.parseInt(ans)){
            case 0:
            game();
            break;
            case 1:;
            break;
        }
        System.exit(1);

    }
    public static void game(){
        Random r = new Random();
        int b=0, d=0;
        String a = JOptionPane.showInputDialog("請押第一個數字(1~6 含 1或6):");
        b = Integer.parseInt(a);
        String c = JOptionPane.showInputDialog("請押第二個不同的數字(1~6 含 1或6):");
        d = Integer.parseInt(c);
        int e = 1, f = 2;
        if(e == b || e == d){
            e = r.nextInt(6)+1;
        }
        if(e == b || e == d){
            e = r.nextInt(6)+1;
        }
        if(f == b || f == d || f == e){
            f = r.nextInt(6)+1;
        }
        if(f == b || f == d || f == e){
            f = r.nextInt(6)+1;
        }
        if(f == b || f == d || f == e){
            f = r.nextInt(6)+1;
        }
        JOptionPane.showMessageDialog(null,"中獎號碼 : "+e+" "+f+"\n你的號碼 : "+b+" "+d+"\n銘謝惠顧!");

    }
}