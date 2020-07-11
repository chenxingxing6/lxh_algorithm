package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by lanxinghua@2dfire.com on 2020/7/11
 * 广度遍历：使用队列
 */
public class WideTraverse {
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
        List<Integer> deep = wide(node1);
        System.out.println(deep.toString());
    }

    public static List<Integer> wide(TreeNode node){
        List<Integer> resultList = new ArrayList<>();
        if (node == null){
            return resultList;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll.getLeft() != null){
                queue.add(poll.getLeft());
            }
            if (poll.getRight() != null){
                queue.add(poll.getRight());
            }
            resultList.add(poll.getVal());
        }
        return resultList;
    }
}
