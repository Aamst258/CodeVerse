package week2.day6;
// problem no 94

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        // traverse till the bt ends or stack is end
        while (root != null || !st.isEmpty()) {
            // traverse to the leftmost node of subtree
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            // reached the left most node of the subtree now root is pointing to null
            // pop the last recently visited node from stack
            // assign it to root
            root = st.pop();
            ans.add(root.val);
            root = root.right;

        }
        return ans;

    }
}
