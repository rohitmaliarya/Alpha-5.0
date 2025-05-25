
public class linear
{
    public static int linearsearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key) {
        return i;
    }
    
    }
    return -1;
    }
	public static void main(String[] args) {
	    int numbers[] = {12,23,1,2,10,34,56,23};
	    int key = 23;
	    int index = linearsearch(numbers ,key);
	    if(index==-1){
	        System.out.println("key not found");
	    }
	    else{
	        System.out.println("key found at index  = " +index );
	    }
	    
		
	}
}