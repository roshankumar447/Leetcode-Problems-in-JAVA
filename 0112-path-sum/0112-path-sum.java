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
    boolean fun(TreeNode tptr,int sum,int target){
        if(tptr==null) return false;
        if(tptr.left==null && tptr.right==null){
            sum=sum+tptr.val;
            return sum==target;
        }
        sum=sum+tptr.val;
        boolean l=fun(tptr.left,sum,target);
        boolean r=fun(tptr.right,sum,target);
        return l || r;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root,0,targetSum);
    }
}