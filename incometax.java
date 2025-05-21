import java.util.*;
public class incometax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("your income  =  ");
        int income = sc.nextInt();
        int tax = 0;
        if(income<=500000)
        {   tax=0;
            System.out.println("tax = " +tax);
            
        }
        else if(income>500000 && income <100000){
            tax=(income)*18/100;
            income=income-tax;
            System.out.println("income including  tax  = " +income);
            
        }
        else{
            tax=(income)*30/100;
            income=income-tax;
        }  
            System.out.println("income including tax = " +income);
}}
