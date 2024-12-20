class Solution {
    public int shipWithinDays(int[] w, int d) {
        int l=0;
        int r=0;
        for(int i=0;i<w.length;i++){
            l=Math.max(l,w[i]);
            r+=w[i];
        }
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(check(w,mid,d)==true){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean check(int[] w,int cap,int d){
        int curr=0;
        int days=1;
         for(int i=0;i<w.length;i++){
            curr+=w[i];
         if (curr>cap){
          curr=w[i];
          days++;
         }
         if (w[i]>cap){
            return false;
         }

        }
        if (days<=d) return true;
        else return false;
    }
    }
