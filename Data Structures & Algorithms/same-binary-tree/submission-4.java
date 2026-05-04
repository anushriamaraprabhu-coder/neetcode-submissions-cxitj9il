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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //TC: O(n) as we need to visit each node atleast once 
        //Sc: O(h) wher h is height of the tree best case O(log n) worst case is O(n);

        if(p==null || q==null){return p==q;}

        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
}
