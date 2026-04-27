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

        //first lets take a hashMap to store the In Order elements 
        HashMap<Integer,Integer>map=new HashMap<>();
        //Iterate thru the map 
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i], i);

            //we have a helper function to split the tree at every instance 

            return splitTree(preorder,map,0,0,inorder.length-1); 
           
        
    }
     private TreeNode splitTree(int[]preorder,HashMap<Integer,Integer>map,int root,int left,int right){

        //begin construction of the new tree 

        TreeNode newRoot=new TreeNode(preorder[root]);

        //construct the left and right subtree 

        int mid=map.get(preorder[root]);
        //left subtree 
        if(mid>left){
            newRoot.left=splitTree(preorder,map,root+1,left,mid-1);
        }

        if(mid<right){
            newRoot.right=splitTree(preorder,map,root+mid-left+1,mid+1,right);
        }

        return newRoot;


        }
}
