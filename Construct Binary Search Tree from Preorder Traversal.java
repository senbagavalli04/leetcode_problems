//CODE LINK : https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        int n = preorder.length;
        for(int i=0;i<n;i++){
            root = insert(root,preorder[i]);
        }
        return root;
    }
    public TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        if(root.val == key){
            return root;
        }
        if(root.val > key){
            root.left = insert(root.left,key);
        }
        else{
             root.right = insert(root.right,key);
        }
        return root;
    }
    
}
