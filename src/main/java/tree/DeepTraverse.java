package tree;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by lanxinghua@2dfire.com on 2020/7/11
 * 深度遍历
 * 1.先序（递归，非递归）preorder
 * 2.中序  inorder
 * 3.后序 postorder
 */
public class DeepTraverse {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        List<Integer> deep = deep(node1);
        System.out.println(deep.toString());
    }

    public static List<Integer> deep(TreeNode node){
        List<Integer> resultList = new ArrayList<>();
        if (node == null){
            return resultList;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(node);
        while (!stack.isEmpty()){
            TreeNode nn = stack.pop();
            if (nn.getRight() != null){
                stack.push(nn.getRight());
            }
            if (nn.getLeft() != null){
                stack.push(nn.getLeft());
            }
            resultList.add(nn.getVal());
        }
        return resultList;
    }

}
