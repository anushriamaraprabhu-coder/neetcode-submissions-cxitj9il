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

    int maxsum= Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        dfs(root);

        return maxsum;
        
    }

    private int dfs(TreeNode node ){

        if(node==null){return 0;}

        int leftgain=Math.max(dfs(node.left),0);
        int rightgain=Math.max(dfs(node.right),0);

        int currentsum=node.val+leftgain+rightgain;

        maxsum=Math.max(maxsum,currentsum);

        return node.val+Math.max(leftgain,rightgain);
    }
}
