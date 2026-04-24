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

        //take the list of integers as array list to store the result 
       List<List<Integer>>list=new ArrayList<>();

       //Take a queue to store the i/p elements 
       Queue<TreeNode>queue=new LinkedList<>();

       if(root==null){return list;}

       //Add the root element to the queue 
       queue.offer(root);

       //check till the queue is not empty 
       while(!queue.isEmpty()){

        //take the size of the queue 
        int size=queue.size();

        //take a new array list to store the current level elements 
            List<Integer>newList=new ArrayList<>();

        //Iterate the for loop to the size 
        for(int i=0;i<size;i++){

            //Take a new node to poll the queue element 
            TreeNode node=queue.poll();

            //Add the node value to the new list 
            newList.add(node.val);

            //check if the node values are not null and add them to queue 

            if(node.left!=null){queue.offer(node.left);}
            if(node.right!=null){queue.offer(node.right);}


            

        }

        list.add(newList);

       }

       return list;
        
        
    }
}
