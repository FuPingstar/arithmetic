package priv.fupingstar.arithmetic.tree;

import priv.fupingstar.arithmetic.util.TreeNode;

/**
 * 二叉排序树的插入，查找，删除
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/4/3 9:28
 */
public class BinarySearchTree {

    /**
     * 二叉排序树的插入
     * 递归方式
     * @param root
     * @param data
     * @return boolean
     */
    public static boolean insert(TreeNode root ,int data){
        TreeNode treeNode = new TreeNode(data);
        if (root == null){
            // 如果二叉查找树为空，将要插入的节点置为根结点，插入成功
            root = treeNode;
            return true;
        }
        if (root.val > data){
            // 如果要插入结点的值小于根结点的值
            if (root.left == null){
                // 如果左节点为空，将左结点置为要插入的结点
                root.left = treeNode;
                return true;
            }else{
                // 如果左结点不为空，向下递归找到空的左子树插入
                return insert(root.left,data);
            }
        }else if(root.val < data){
            // 如果要插入结点的值大于根结点的值
            if (root.right == null){
                // 如果右节点为空，将右结点置为要插入的结点
                root.right = treeNode;
                return true;
            }else{
                // 如果左结点不为空，向下递归找到空的左子树插入
                return insert(root.right, data);
            }
        }else{
            return false;
        }
    }

    /**
     * 二叉排序树的查找
     * 递归方式
     * @param root
     * @param data
     * @return boolean
     */
    public static boolean search(TreeNode root, int data){
        // 树为空，查找失败
        if (root == null){
            return false;
        }else if(root.val == data){
            // 要查找结点等于根结点，查找成功
            return true;
        }else if (root.val > data){
            // 要查找的关键字小于根结点的值，递归查找左子树
            return search(root.left, data);
        }else{
            // 要查找的关键字小于根结点的值，递归查找左子树
            return search(root.right, data);
        }
    }

    public static boolean delete(TreeNode root, int data){
        //current为查找得到的节点
        TreeNode current=root;
        //parent为时刻更新父节点
        TreeNode parent=root;
        //tempParent为同时存在左右子树的迭代临时父节点
        TreeNode tempParent=root;
        //isLeft记录current节点的左右属性
        boolean isLeft=true;
        while(current.val!=data){
            parent=current;
            //到左子树查找
            if(current.val>data){
                isLeft=true;
                current=current.left;
            }else if(current.val<data){ //到右子树查找
                isLeft=false;
                current=current.right;
            }
            //查不到，返回false
            if(current==null){
                return false;
            }
        }
        //第一种情况：删除节点为叶节点
        if(current.left==null && current.right==null){
            if(current==root){
                root=null;
            }
            if(isLeft) {
                parent.left = null;
            }else{
                parent.right = null;
            }
            return true;
        }else if(current.right==null){    //第二种情况：删除节点只有左节点
            if(current==root){
                root=current.left;
            }
            else if(isLeft){
                parent.left=current.left;
            } else{
                parent.right=current.left;
            }
            return true;
        }else if(current.left==null){    //第三种情况：删除节点只有右节点
            if(current==root){
                root=current.right;
            }
            else if(isLeft){
                parent.left=current.right;
            }
            else{
                parent.right=current.right;
            }
            return true;
        }else{  //第四种情况：删除节点均存在左节点和右节点
            if(current==root){
                root=root.left;
            }
            TreeNode tempNode=current.left;
            //没有左节点
            if(tempNode.right==null){
                if(isLeft){
                    parent.left=tempNode;
                }
                else{
                    parent.right=tempNode;
                }
            }else{  //存在左节点，迭代到最右侧子节点，即直接前驱
                while(tempNode.right!=null){
                    tempParent=tempNode;
                    tempNode=tempNode.right;
                }
                if(isLeft){    //为左节点，连接
                    parent.left=tempNode;
                    parent.left.left=current.left;
                }else{  //为右节点，连接
                    parent.right=tempNode;
                    parent.right.left=current.left;
                }
                //删除前驱节点，连接
                if(tempNode.left==null) {
                    tempParent.right = null;
                }
                else{
                    tempParent.right=tempNode.left;
                }
            }
            return true;
        }
    }

    public static void midSort(TreeNode root){
        if (root == null){
            return;
        }
        midSort(root.left);
        System.out.print(root.val + " ");
        midSort(root.right);
    }

    public static void main(String[] args) {
        int[] a=new int[]{62,88,58,47,35,73,51,99,37,93};
        TreeNode root=new TreeNode(a[0]);
        for(int i=1; i<a.length; i++){
            insert(root, a[i]);
        }
        midSort(root);
        System.out.println();
        insert(root, 100);
        midSort(root);
    }
}
