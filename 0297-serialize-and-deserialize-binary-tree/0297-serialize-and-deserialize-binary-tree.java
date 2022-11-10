/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return "X";
        String leftseri = serialize(root.left);
        String rightseri = serialize(root.right);
        return root.val+ "," + leftseri + "," + rightseri;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodeleft = new LinkedList<>();
        nodeleft.addAll(Arrays.asList(data.split(",")));
        return deserializehelper(nodeleft);
    }
    public TreeNode deserializehelper(Queue<String> nodeleft){
        String valueForNode = nodeleft.poll();
        if(valueForNode.equals("X"))
            return null;
        TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));
        newNode.left = deserializehelper(nodeleft);
        newNode.right = deserializehelper(nodeleft);
        return newNode;
        
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));