/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        Stack <TreeNode> st = new Stack<>();
        Boolean lr = false ;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int n=q.size();
            if (lr==false){
            for(int i=0;i<n;i++){
            TreeNode temp = q.poll();
            ls.add(temp.val);
            if(temp.left!=null) {
                q.offer(temp.left);
            }
            if(temp.right!=null) {
                q.offer(temp.right);
            }   
            }                                                                                     }
            else{
             for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                st.push(temp);
             if(temp.left!=null) {
                q.offer(temp.left);
            }
            if(temp.right!=null) {
                q.offer(temp.right);
            }
             }
            int m=st.size();
            for(int j=0;j<m;j++){
                ls.add(st.pop().val);
            }
        
        }
        res.add(ls);
        lr = !lr;
        System.out.println(lr);
        }
        return res;
    }
} 