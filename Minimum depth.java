class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(root.left==null && root.right==null) {
            return 1;
        }
        if(root.left==null) {
            return 1+r;
        }
        if(root.right==null) {
            return 1+l;
        }
        return Math.min(l,r)+1;
    }
}
