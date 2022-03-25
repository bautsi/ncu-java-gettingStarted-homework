import java.util.Scanner;
public class gong{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("畫出邊長為a的正方形工字, a設為(輸入一正奇數): ");
    int length=s.nextInt();
    s.close();
    for(int i=1;i<=length;i++){
      System.out.print("工");}
    System.out.print("\n");


      for(int j=1;j<=length-2;j++){
      for(int k=1;k<=length-1;k++){
      System.out.print(" ");}

      System.out.print("工\n");}

      for(int i=1;i<=length;i++){
      System.out.print("工");}
  }
}
    