import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        System.out.print("enter your marks in maths: =  ");
        int maths = sc.nextInt();
        System.out.println("enter your marks in science: =  ");
        int science = sc.nextInt();
        System.out.println("enter your marks in english: =  ");
        int english = sc.nextInt();
        int total = maths + science + english;
        double percentage = (total / 300) * 100;
        System.out.println("your total marks are = " + total);
        System.out.println("your percentage is = " + percentage);
        if (percentage >=33 ){
            System.out.println("you are pass");

        }
        else(percentage<=33){
            System.out.println("you are fail");
        

        }
}
}