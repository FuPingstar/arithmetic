package priv.fupingstar.arithmetic.tree;

import priv.fupingstar.arithmetic.util.TreeNode;

/**
 * 后序遍历--递归
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/1 17:35
 */
public class PostOrder {

    public static void postOrderRecursion(TreeNode t){
        if (t == null){
            return;
        }
        postOrderRecursion(t.left);
        postOrderRecursion(t.right);
        System.out.println(t.val);
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

        postOrderRecursion(treeNode1);
    }
}
