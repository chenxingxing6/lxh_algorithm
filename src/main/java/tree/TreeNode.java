package tree;

import java.io.Serializable;

/**
 * created by lanxinghua@2dfire.com on 2020/7/11
 */
public class TreeNode implements Serializable {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
