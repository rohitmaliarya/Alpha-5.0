
import java.util.Scanner;
public class temp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("enter the temp  =  ");
	    double temp = sc.nextDouble();
	    if(temp>=100){
	        System.out.println("Fever hai aapko");
	    }
	    else{
	        System.out.println("you are fine ");
	    }
	    
	
	}

}