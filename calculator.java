import java.util.Scanner;
public class calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.print("Enter the operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default: System.out.println("Invalid operator");
        }
    
}
}
