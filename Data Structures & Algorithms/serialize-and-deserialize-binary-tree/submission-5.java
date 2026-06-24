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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root==null){return null;}

        StringBuilder sb=new StringBuilder();

        Queue<TreeNode>queue=new LinkedList<>();
        
        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode node=queue.poll();

            if(sb.length()>0){sb.append(',');}

            if(node==null){sb.append("N");}

            else{
                sb.append(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data==null || data.isEmpty()){return null;}

        String[]splitstring=data.split(",");

        Queue<TreeNode>queue=new LinkedList<>();
        
        TreeNode root=new TreeNode(Integer.parseInt(splitstring[0]));

        queue.add(root);

        int i=1;

        while(!queue.isEmpty() && i<splitstring.length){

            TreeNode parent=queue.poll();

            if(i<splitstring.length && !splitstring[i].equals("N")){
                
                TreeNode left=new TreeNode(Integer.parseInt(splitstring[i]));
                parent.left=left;
                queue.add(left);

            }

            i++;

            if(i<splitstring.length && !splitstring[i].equals("N")){

                TreeNode right=new TreeNode(Integer.parseInt(splitstring[i]));
                parent.right=right;
                queue.add(right);
            }
            i++;
        }

        return root;
        
    }
}
