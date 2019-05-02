package huahua.tree.easy;

import others.tools.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    /**
     * Iterative
     * 1ms 11.63%
     * 39.7MB 9.40%
     */
    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            res++;
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
        }

        return res;
    }

    /**
     * Recursive
     * 0ms 100.00%
     * 40.1MB 5.01%
     */
    public int maxDepth2(TreeNode root) {
        return search(root, 0);
    }

    public int search(TreeNode node, int depth) {
        if (node == null) return depth;

        depth++;
        int leftDepth = search(node.left, depth);
        int rightDepth = search(node.right, depth);
        return Math.max(leftDepth, rightDepth);
    }
}
