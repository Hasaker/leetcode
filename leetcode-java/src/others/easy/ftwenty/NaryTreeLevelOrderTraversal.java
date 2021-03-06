package others.easy.ftwenty;

import tools.NNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 429 N-ary Tree Level Order Traversal
 *
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example, given a 3-ary tree:
 *
 *         1
 *       / | \
 *      3  2  4
 *    /  \
 *   5    6
 *
 * We should return its level order traversal:
 *
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */

public class NaryTreeLevelOrderTraversal {

    private static List<List<Integer>> levelOrder(NNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();

        if (root == null)
            return null;

        level.add(root.val);
        result.add(level);

        return result;
    }
}
