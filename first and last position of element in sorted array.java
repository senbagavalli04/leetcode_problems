class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int s=-1;
        int e=-1;
        for(int i=0;i<n;i++){
            if (nums[i]==target){
                if(s==-1){
                    s=i;
                }
                e=i;
            }
        }
        return new int[]{s,e};
        
    }
}