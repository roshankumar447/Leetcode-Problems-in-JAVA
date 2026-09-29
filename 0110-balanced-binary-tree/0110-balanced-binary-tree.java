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
    int fun(TreeNode tptr,boolean res[]){
        if(tptr==null) return 0;
        int l=fun(tptr.left,res);
        int r=fun(tptr.right,res);
        int d=Math.abs(l-r);
        if(d>1) res[0]=false;
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        boolean []res=new boolean[1];
        res[0]=true;
        fun(root,res);
        return res[0];
    }
}