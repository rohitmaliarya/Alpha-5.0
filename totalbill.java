import java.util.*;
public class totalbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost of pen = ");
        int pen = sc.nextInt();
        System.out.print("enter the cost of pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("enter the cost of eraser  = ");
        double eraser = sc.nextDouble();
        double gst = (pen+pencil+eraser)*18/100;
        System.out.println("gst is = "+gst);
        double totalcost=(pen+pencil+eraser)+gst;
        System.out.println("total cost included with gst = "+totalcost);
        
        
        
        
    }
}