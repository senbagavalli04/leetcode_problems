CODE LINK : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=cardPoints[i];
        }
        int curr = s;
        int maxi = s;
        for(int i=0;i<k;i++){
            curr -= cardPoints[k-i-1];
            curr += cardPoints[cardPoints.length-i-1];
            maxi = Math.max (curr,maxi);
        }
        return maxi;
    }
}
