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
    public TreeNode invertTree(TreeNode root) {

        //Time complexity: O(n) as we are visiting every node
        //space complexity: O(h) where h is the tree height, O(n) in worst case and best case is O(log n)

        //lets use recursion 

        if(root==null){
            return null;
        }

        //lets swap the left and right nodes recursively

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        //recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;
        
    }
}
