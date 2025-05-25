import java.util.*;
public class Arr{
    public static void main (String args[]){
  int marks[] = new int[50];
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the marks of physics = ");
  marks[0] = sc.nextInt();
  System.out.print("enter the marks of Chemistry = ");
  marks[1] = sc.nextInt();
  System.out.print("enter the marks of maths = ");
  marks[2]= sc.nextInt();
 
  int percentage = (marks[0]+marks[1]+marks[2])/3;
  System.out.println("percentage = "+percentage);
  if(percentage<=50){
      System.out.println("fail");
      
  }
  else{
      System.out.println("pass");
  }
    }
}