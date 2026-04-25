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
    public List<List<Integer>> levelOrder(TreeNode root) {

        //create a list to store the o/p elements 

        List<List<Integer>>list=new ArrayList<>();

        Queue<TreeNode>queue=new LinkedList<>();

        if(root==null){return list;}

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer>newList=new ArrayList<>();

            for(int i=0;i<size;i++){

                TreeNode node=queue.poll();

                newList.add(node.val);

                if(node.left!=null){queue.offer(node.left);}
                if(node.right!=null){queue.offer(node.right);}

                
            }

            list.add(newList);
        }

        return list;

        
    }
}
