package priv.fupingstar.arithmetic.tree;

import priv.fupingstar.arithmetic.util.TreeNode;

import java.util.Stack;

/**
 * 二叉树中序遍历--非递归
 * 1. 对任一节点P，访问P节点，并将其压入栈
 * 2. 判断其是否有左孩子，有左孩子，访问左孩子，将左孩子压入栈，如果没有左孩子，则取栈顶节点并进行出栈操作，将栈顶的右孩子当做当前节点
 * 3. 直到栈为空并且P为NULL
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/1 17:39
 */
public class InOrder01 {

    public static void inOrderRecursion1(TreeNode t){
        if (t == null){
            return;
        }
        TreeNode p = t;
        Stack<Object> stack = new Stack<>();
        // 循环条件（当前节点不为空或者栈不为空）
        while (p != null || !stack.empty()){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()){
                p = (TreeNode) stack.peek();
                System.out.println(p.val);
                stack.pop();
                p = p.right;
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

        inOrderRecursion1(treeNode1);
    }
}
