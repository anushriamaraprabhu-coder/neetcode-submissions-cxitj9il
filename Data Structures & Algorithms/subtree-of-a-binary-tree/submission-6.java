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

    String PreOrdertraversal(TreeNode node){

        if(node==null){return "null";}
        StringBuilder sb=new StringBuilder("^");
        sb.append(node.val);
        sb.append(PreOrdertraversal(node.left));
        sb.append(PreOrdertraversal(node.right));

        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        

        String Fulltree=PreOrdertraversal(root);
        String SubTree=PreOrdertraversal(subRoot);

        return Fulltree.contains(SubTree);

        

    }
}
