public class stocks {
    public static int buyandsellsstocks(int prices[]) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
            int profit = prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
            
        }else{
            buyprice=prices[i];
        }
  
    }
    return maxprofit;
}
public static void main(String args[]){
    int prices[]={2,4,6,7,8,9,3};
    System.out.println(buyandsellsstocks(prices));
}
}
