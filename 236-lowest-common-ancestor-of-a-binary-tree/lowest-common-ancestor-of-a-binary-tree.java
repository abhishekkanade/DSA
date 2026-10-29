/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==p || root==q) return root;

        boolean pLiesinLeft = exist(root.left, p);
        boolean qLiesinLeft = exist(root.left, q);

        if(!pLiesinLeft && qLiesinLeft) return root;
        else if(pLiesinLeft && ! qLiesinLeft) return root;

        else if(pLiesinLeft && qLiesinLeft){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(!pLiesinLeft && !qLiesinLeft){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    boolean exist(TreeNode root, TreeNode target){
        if(root==null) return false;
        if(root==target) return true;

        return (exist(root.left, target) || exist(root.right, target) );

    }

}