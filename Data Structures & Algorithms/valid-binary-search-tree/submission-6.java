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

    private Long prev=null;
    public boolean isValidBST(TreeNode root) {

        return inOrderTraversal(root);
        
    }

    private boolean inOrderTraversal(TreeNode node){

        if(node==null){return true;}

        //check the left side of the tree recursively 
        if(!inOrderTraversal(node.left)){return false;}

        //check the current node<=prev node 
        if(prev!=null && node.val<=prev){return false;}

        //Update the current node and previous node to continue the traversal 
        prev=(long)node.val;

        //check the right side of the tree recursively and the answer will be whatever will be returned 
        return inOrderTraversal(node.right);

    }
}
