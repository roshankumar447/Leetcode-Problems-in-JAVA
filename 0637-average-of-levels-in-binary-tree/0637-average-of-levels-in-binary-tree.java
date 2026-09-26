class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            double sum = 0;

            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }

            ans.add(sum / n);
        }

        return ans;
    }
}