//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        if(arr.length<k) return -1;
        int l=0;
        int r=0;
        for (int i=0;i<arr.length;i++){
            l=Math.max(l,arr[i]);
            r+=arr[i];
        }
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(check(arr,mid,k)==true){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean check(int[] arr,int cap,int k){
        int curr=0;
        int st=1;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
        if(curr>cap){
            curr=arr[i];
            st++;
        }
        if(arr[i]>cap) return false;
     
    }
    if (st<=k) return true;
    else return false;
    }
}
