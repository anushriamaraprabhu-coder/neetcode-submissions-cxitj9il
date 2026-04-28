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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i], i);

            return splittree(preorder,map,0,0,inorder.length-1);
        
    }
    private TreeNode splittree(int[]preorder,HashMap<Integer,Integer>map,int root, int left,int right){

        TreeNode newRoot=new TreeNode(preorder[root]);

        int mid=map.get(preorder[root]);

        if(mid>left){
            newRoot.left=splittree(preorder,map,root+1,left,mid-1);
        }

        if(mid<right){
            newRoot.right=splittree(preorder,map,root+1+(mid-left),mid+1,right);
        }

        return newRoot;

            
        }
}
