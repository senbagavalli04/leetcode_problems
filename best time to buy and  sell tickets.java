class Solution {
    public int maxProfit(int[] prices) {
        int max_p=0;
        int p=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if (prices[i]>min){
            p=prices[i]-min;
            max_p=Math.max(p,max_p);
        }
        else
        min=prices[i];
        }
        return max_p;
        
    }
}