package priv.fupingstar.arithmetic.tree;

import priv.fupingstar.arithmetic.util.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的层次遍历
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/1 23:26
 */
public class Hierarchical {
    public static void hierarchicalTraversal(TreeNode t){
        if (t == null){
            return;
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        TreeNode p = t;
        linkedList.offer(p);
        while (!linkedList.isEmpty()){
            p = (TreeNode) linkedList.poll();
            System.out.println(p.val);
            if (p.left != null){
                linkedList.offer(p.left);
            }
            if (p.right != null){
                linkedList.offer(p.right);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        hierarchicalTraversal(treeNode1);
    }
}
