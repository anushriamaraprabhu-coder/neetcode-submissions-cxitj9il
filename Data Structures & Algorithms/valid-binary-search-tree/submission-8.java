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
        
        if(!inOrderTraversal(node.left)){return false;}

        if(prev!=null && node.val<=prev){return false;}

        prev=(long)node.val;


        return inOrderTraversal(node.right);


    }
}
