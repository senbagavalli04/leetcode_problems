class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int p = 0;
        int[] arr = new int[2];
        while(n>0){
            if((n&1)==1){
                if(p%2==0) even++;
                else odd++;
                
            }
            n=n>>1;
            p++;
        }
        arr[0]=even;
        arr[1]=odd;
        
        return arr;
    }
}
