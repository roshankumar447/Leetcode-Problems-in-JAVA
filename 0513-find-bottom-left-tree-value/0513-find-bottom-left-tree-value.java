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
    int max=0;
    int res=0;
    void fun(TreeNode tptr,int d){
        if(tptr==null) return ;
        d=d+1;
        if(d>max){
            max=d;
            res=tptr.val;
        }
        fun(tptr.left,d);
        fun(tptr.right,d);
    }
    public int findBottomLeftValue(TreeNode root) {
        fun(root,0);
        return res;
    }
}