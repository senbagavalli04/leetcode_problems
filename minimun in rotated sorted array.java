class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int min=99999;
        while(l<=r){
            if (nums[l]<=nums[r]){
                min=Math.min(min,nums[l]);
                break;
            }
            int mid=(l+r)/2;
            if (nums[mid]>=nums[l]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                r=mid-1;
            }
             
        }
        return min;
    }
}