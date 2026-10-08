class Solution {
    void fun(int [][]adj_mat,int work_vert,boolean[] vis){
        for(int col=0;col<adj_mat[work_vert].length;col++){
            if(adj_mat[work_vert][col]>0 && vis[col]==false)
                {
                    vis[col]=true;
                    fun(adj_mat,col,vis);
                }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean []vis = new boolean[isConnected.length+1];
        for(int idx=0;idx<isConnected.length;idx++){
            if(vis[idx]==false){
                fun(isConnected,idx,vis);
                count++;
            }
        }
        return count;
    }
}