CODE LINK : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
          ArrayList<Node> arr = new ArrayList<>();
          int n = q.size();
          for(int i=0;i<n;i++){
            Node temp = q.poll();
            arr.add(temp);
            if(temp.left!= null) q.add(temp.left);
            if(temp.right!= null) q.add(temp.right);
          }
          for(int i=0;i<=arr.size()-2;i++){ //-2 cuz next of last is null already
            Node a = arr.get(i);
            Node b = arr.get(i+1);
            a.next = b;
          }
        }
        return root;
        
    }
}
