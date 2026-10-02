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

        List<List<Integer>>list=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();

        if(root==null){
            return list;
        }

        queue.offer(root);

        while(!queue.isEmpty()){

            int levelsize=queue.size();

            List<Integer>currentlist=new ArrayList<>();

            for(int i=0;i<levelsize;i++){                

                TreeNode node=queue.poll();

                currentlist.add(node.val);


                if(node.left!=null){
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offer(node.right);
                }

                
            }

            list.add(currentlist);

            
        }

        return list;
        
    }
}
