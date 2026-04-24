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

        //List to store the o/p elements 

        List<List<Integer>>list=new ArrayList<>();

        //Queue D.S to do level order traversal 
        Queue<TreeNode>queue=new LinkedList<>();

        //check if root is null 
        if(root==null){return list;}

        //initially add the root to the queue 
        queue.offer(root);

        //check if the queue is empty/not as the loop will end once the queue becomes empty 
        while(!queue.isEmpty()){

            //Take the size of the queue as this will give the current level size. 
            //This equals the number of nodes in the current level 
            int size=queue.size();

            //Create a new Array list to store the value of the current elements in the level 
            List<Integer>newList=new ArrayList<>();

            //Run a for loop till the size of the queue 
            for(int i=0;i<size;i++){

                //Poll the queue elements to check the level 

                TreeNode node=queue.poll();

                //Add the new node value to the list 

                newList.add(node.val);

                //Check the node left and right values and add it to the queue 

                if(node.left!=null){queue.offer(node.left);}
                if(node.right!=null){queue.offer(node.right);}

            }

            //Add the level list to the o/p list 

            list.add(newList);
        }

        return list;


        
    }
}
