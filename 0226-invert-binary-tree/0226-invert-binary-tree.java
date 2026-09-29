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
    void fun(TreeNode tptr){
        if(tptr== null) return;
        TreeNode t=tptr.left;
        tptr.left=tptr.right;
        tptr.right=t;
        fun(tptr.left);
        fun(tptr.right);
    }
    public TreeNode invertTree(TreeNode root) {
        fun(root);
        return root;
    }
}