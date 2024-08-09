class Solution {
    int[] Nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        Nums = nums;
        return buildBST(0,nums.length - 1);
    }
    private TreeNode buildBST(int s,int e){
        if(s>e) return null;
        int mid = (s+e)/2;
        TreeNode cur = new TreeNode(Nums[mid]);
        cur.left = buildBST(s, mid-1);
        cur.right = buildBST(mid+1,e);
        return cur;

    }
}
