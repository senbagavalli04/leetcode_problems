//code link : https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] a = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            ob.segregateElements(a);
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            T--;
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        Stack<Integer> pos = new Stack<>();
         Stack<Integer> neg = new Stack<>();
         for(int i : arr){
             if(i<0) neg.add(i);
             else pos.add(i);
         }
         //System.out.println(arr);
         for(int i=arr.length-1;i>=0;i--){
             if(!neg.isEmpty()){
             int temp = neg.pop();
             arr[i] = temp;
             }
             else
             arr[i] = pos.pop();
         }
        
        
    }
