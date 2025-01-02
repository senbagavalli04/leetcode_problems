CODE LINK : https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ans = new ArrayList<>();
        solve(ans, "" ,mat, 0,0);
        Collections.sort(ans);
        return ans;
    }
    public void solve(ArrayList<String> ans, String asf , ArrayList<ArrayList<Integer>> mat, int r, int c){
        int n = mat.size();
        int m = mat.get(0).size();
        if(r>=n || c>=m || r<0 || c<0 || mat.get(r).get(c) == 0) 
        return;
        if(r == n-1 && c == m-1) 
        ans.add(asf);
        mat.get(r).set(c,0);
        solve(ans,asf+'U',mat,r-1,c);
        solve(ans,asf+'R',mat,r,c+1);
        solve(ans,asf+'D',mat,r+1,c);
        solve(ans,asf+'L',mat,r,c-1);
        mat.get(r).set(c,1);
    }
}
