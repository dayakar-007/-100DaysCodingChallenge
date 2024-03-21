class Solution {
    public static int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dia=0;
        binarytree(root);
        return dia;
    }
    public int binarytree(TreeNode root)
    {
        if(root==null) return 0;
        int left=binarytree(root.left);
        int right=binarytree(root.right);
        dia=Math.max(dia,left+right);
        return 1+Math.max(left,right);
    }
}