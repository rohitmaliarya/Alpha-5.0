import java.util.Scanner;
public class largestnum {
    public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of A = ");
    int A = sc.nextInt();
    System.out.print("enter the value of B = ");
    int B = sc.nextInt();
    System.out.print("enter the value of C = ");
    int C =sc.nextInt();
    if(A>=B && A>=C){
    System.out.println("A is the largest number");
    }
    else if(B>=C){
        System.out.println("B is the largest number");
    }
    else{
        System.out.println("C is the largest number");


    }
}}
