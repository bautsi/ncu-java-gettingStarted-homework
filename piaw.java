import java.util.Scanner;
public class piaw{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int response=0, votes=0, r1=0, r2=0, r3=0, a=0;
    String b="哈哈";
    System.out.print("投票人數?");
    a=input.nextInt();
    while(votes<a){
    System.out.print("票選最喜歡的台灣美食：(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇 : ");
    response=input.nextInt();
    if(response==1){r1++;}
    else if(response==2){r2++;}
    else if(response==3){r3++;}
    votes++;}
    input.close();
    
    if(votes!=0){
    System.out.printf("票選結果 : \n(1)臭豆腐 : %d 得票率 : 0.%d\n(2)蚵ㄚ煎 : %d 得票率 : 0.%d\n(3)滷  味 : %d 得票率 : 0.%d\n",r1, 100*r1/votes,r2, 100*r2/votes,r3, 100*r3/votes);}
    else{System.out.println("無任何投票");}
    
    if(r1>r2&&r1>r3){
         b="臭豆腐";}


    if(r2>r1&&r2>r3){
         b="蚵ㄚ煎";}

    if(r3>r1&&r3>r2){
         b="滷味";}

    if(r1==r2||r2==r3||r1==r3){
         b="從缺";}
    System.out.printf("最高票為 : %s",b);
    
    
}
}