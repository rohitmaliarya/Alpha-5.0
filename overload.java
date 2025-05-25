
public class overload
{
    public static int sum(int a , int b ){
        return a + b;

    }
    public static float sum(float  a , float b , float c){
        return a + b + c;
     }
	 public static void main(String[] args) {
System.out.println(sum(10, 20));
     System.out.println(sum(3.2f, 2.2f, 3.1f));
    }
}