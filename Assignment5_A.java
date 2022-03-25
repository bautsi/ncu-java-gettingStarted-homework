import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment5_A{    
    public static void main(String[] args){
      Scanner s = new Scanner(System.in); 
      int [] play = new int[6];

      System.out.println("請投注六個不同的號碼(1~42)並以空格隔開 \n玩家不需自己將號碼由小至大排列： ");

      for(int i=0; i<6; i++){ play[i] = s.nextInt(); }
      Arrays.sort(play);
      s.close();

      int []lotto = new int[6] ;
       draw(lotto) ;
       System.out.printf("lotto numbers :%d  %d  %d  %d  %d  %d\n",lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]) ;
       System.out.printf("your numbers :%d  %d  %d  %d  %d  %d",play[0],play[1],play[2],play[3],play[4],play[5]) ;
      check(play, lotto);

    }    

    public static void draw(int[] lotto){ 
    //依需求實作出本方法
    
    Random r = new Random() ;
    int temp = 0 ;
    for(int j=0;j<lotto.length;j++) {
       do{temp=r.nextInt(42)+1;}
       while(Arrays.binarySearch(lotto,temp)>=0) ;
       lotto[0]=temp;
       Arrays.sort(lotto) ;}
    }

    public static void check(int[] play,int[] lotto){
    //依需求實作出本方法 
    int count = 0 ;
    for(int i=0;i<play.length;i++) {
      for(int j=0;j<lotto.length;j++) {
        if(play[i]==lotto[j]) {count++;}
      }
    }
    if(count==6) {System.out.print("恭喜贏得一獎 !") ;}
    else if(count==5) {
      System.out.print("恭喜贏得二獎 !");
    }
    else if(count==4) 
    {System.out.print("恭喜贏得三獎 !");
  }
    else if(count==3) {
      System.out.print("恭喜贏得四獎 !");
    } 
    else if(count==2) {
      System.out.print("恭喜贏得五獎 !");
    }
    else if(count==1) {
      System.out.print("恭喜贏得六獎 !");
    }
    else {
      System.out.print("銘謝惠顧 下次再來 !");
    }  
  }
}