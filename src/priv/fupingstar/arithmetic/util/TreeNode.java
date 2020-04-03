package priv.fupingstar.arithmetic.util;

/**
 * 二叉树节点结构
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/1 20:37
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        val = x;
    }
    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
