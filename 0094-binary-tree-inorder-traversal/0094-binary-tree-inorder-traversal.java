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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        solve(root,al);
        return al;
    }
    public void solve(TreeNode root,List<Integer> al){
        if(root==null){
            return;
        }
        solve(root.left,al);
        al.add(root.val);
        solve(root.right,al);
    } 

}
