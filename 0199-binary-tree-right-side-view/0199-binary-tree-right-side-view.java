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
    int m=0;
    void fun(TreeNode tptr,int d,List<Integer> res){
        if(tptr==null) return;
        d++;
        if(d>m){
            m=d;
            res.add(tptr.val);
        }
        fun(tptr.right,d,res);
        fun(tptr.left,d,res);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        fun(root,0,res);
        return res;
    }
}