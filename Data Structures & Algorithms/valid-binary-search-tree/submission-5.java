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

        return inOrder(root);
    }

    private boolean inOrder(TreeNode node){

        if(node==null){return true;}

        //recursively check the ledt subtree and return false immediately if invalid 
        if(!inOrder(node.left)){return false;}

        //check if prev is not null and check the current node 
        if(prev!=null && node.val<=prev){return false;}
        
        //Now the previous becomes the current 
        prev=(long)node.val;

        //check recursively for right node. the answer will be whatever is returned at this stage 
        return inOrder(node.right);

    }
}
