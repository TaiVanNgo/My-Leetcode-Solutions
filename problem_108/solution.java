package problem_108;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class solution {
    public static void main(String[] args) {
        TreeNode node = sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
    }

    int[] globalNums;

    staticpublic TreeNode sortedArrayToBST(int[] nums) {
        globalNums = nums;
        return help(0, nums.length - 1);
    }

    public TreeNode help(int l, int r) {
        // the idea is go from middle (middle is the root);
        // go recursively [0,1,2,3,4,5]
        //
        // 3
        // / \
        // 1 5
        // / \ /
        // 0 2 4
        // the mid (l + r) / 2 is the root

        if (l > r) {
            return null;
        }

        // if it not null, we call the help again
        int m = (l + r) / 2;
        TreeNode root = new TreeNode(globalNums[m]);
        root.left = help(l, m - 1);
        root.right = help(m + 1, r);

        return root;
    }
}