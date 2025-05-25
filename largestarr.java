public class largestarr {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
            
        }
        System.out.println("smallest value is =  "+smallest );
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,5,7,9,};
        System.out.println("largest numbers is = " +getlargest(numbers));
        
        
    }
   
}
