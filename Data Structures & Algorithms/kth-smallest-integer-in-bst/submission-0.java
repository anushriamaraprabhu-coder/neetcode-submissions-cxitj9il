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
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode>stack=new Stack<>();
        TreeNode current=root;

        while(current!=null || !stack.isEmpty()){

            //start going lefmost 

            while(current!=null){
                stack.push(current);
                current=current.left;
            }

            //pop the element 
            current=stack.pop();
            k--;

            //check if k=0 and return the current value 

            if(k==0){return current.val;}

            //otherwise move to right 
            current=current.right;
        }

        return -1;
        
    }
}
