package priv.fupingstar.arithmetic.tree;

import priv.fupingstar.arithmetic.util.TreeNode;

import java.util.Stack;

/**
 * 二叉树后续遍历--非递归
 * 对任一节点，先将其入栈，如果P不存在左孩子和右孩子，则可以直接访问它
 * 或者P只存在左孩子或右孩子，但是其左孩子和右孩子都已经被访问 则同样可以直接访问左孩子和右孩子
 * 这样保证了左孩子和右孩子都在跟节点之前被访问
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/1 17:40
 */
public class PostOrder01 {
    public static void postOrderRecursion1(TreeNode t){
        if (t == null){
            return;
        }
        TreeNode pre = null,cur = null;
        Stack<Object> stack = new Stack<>();
        stack.push(t);
        while (!stack.empty()){
            cur = (TreeNode) stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right)) ){
                System.out.println(cur.val);
                stack.pop();
                pre = cur;
            }else {
                if (cur.right != null){
                    stack.push(cur.right);
                }
                if(cur.left != null){
                    stack.push(cur.left);
                }
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

        postOrderRecursion1(treeNode1);
    }
}
