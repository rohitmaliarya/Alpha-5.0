public class subarrays
{
    public static void maxsum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            int start =i; 
            for(int j =1;j<numbers.length;j++){
                int end=j; 
                currsum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
	public static void main(String[] args) {
		int numbers[]={2,4,6,8,10};
		maxsum(numbers);

	}
}