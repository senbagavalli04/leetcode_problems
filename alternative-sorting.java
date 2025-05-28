//link : https://www.geeksforgeeks.org/problems/alternative-sorting1311/1

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Integer[] val = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
        val[i] = arr[i];
        }
        Arrays.sort(val,Collections.reverseOrder());
        int l=0;
        int r=val.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(l<=r){
            res.add(val[l]);
            l++;
            if(l<r){
            res.add(val[r]);
            r--;
            }
        }
        return res;
    }
}
