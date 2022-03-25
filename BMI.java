import java.util.Scanner;
public class BMI{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    double a,b,c;
    System.out.printf("輸入身高(公分整數):");
    a= s.nextDouble();
    System.out.printf("輸入體重(公斤整數):");
    b= s.nextDouble();
    s.close();
    c=b/(0.0001*a*a);
    System.out.printf("你的BMI為:%.2f",c);
  }
}