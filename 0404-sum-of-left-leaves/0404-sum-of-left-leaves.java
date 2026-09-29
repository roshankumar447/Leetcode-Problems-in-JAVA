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
    int fun(TreeNode tptr,TreeNode prev){
        if(tptr==null) return 0;
        if(tptr.left==null && tptr.right==null){
            if( prev!=null && prev.left==tptr){
                return tptr.val;
            }
            return 0;
        }
        int l=fun(tptr.left,tptr);
        int r=fun(tptr.right,tptr);
        return l+r;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root,null);
    }
}