import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        mergeSorted(nums1,m,nums2,n,arr);
        for(int i=0;i<(m+n);i++){
            nums1[i]=arr[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public void mergeSorted(int[] nums1,int m,int[] nums2,int n,int[] arr){
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if (nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                j++;
            }
            else{
                arr[k]=nums1[i];
                k++;
                arr[k]=nums2[j];
                i++;
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
    }
   
}