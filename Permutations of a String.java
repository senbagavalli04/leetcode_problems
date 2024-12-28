CODE LINK : https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.findPermutation(S);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public List<String> findPermutation(String s) {
      List<String> ans = new ArrayList<>();
      HashSet<String> temp = new HashSet<>();
      permutations(s,"",temp);
      for(String ss: temp){
          ans.add(ss);
      }
      Collections.sort(ans);
      return ans;
    }
    public void permutations(String s, String ans,HashSet<String>temp){
        if(s.length()==0){
            temp.add(ans);
            return ;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String newString = s.substring(0,i)+s.substring(i+1,s.length());
            permutations(newString,ans+ch , temp);
        }
        
    }
}
