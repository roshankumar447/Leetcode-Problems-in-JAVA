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
    boolean res=true;
    void fun(TreeNode tptr,long min, long max){
        if(tptr==null) return;
        if(!(tptr.val>min && tptr.val<max)){
            res=false;
            return;
        }
        fun(tptr.left,min,tptr.val);
        fun(tptr.right,tptr.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        fun(root,Long.MIN_VALUE,Long.MAX_VALUE);
        if(root.left==null && root.right==null) return true;
        if(root.val>Integer.MAX_VALUE && root.left==null && root.right==null) return true;
        return res;
    }
}