/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/9 15:57
 **/


public class BinaryTree {
    public TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void prevOrder(TreeNode cur) {
        if (cur == null) {
            System.out.println("null");
            return;
        }
        System.out.println(cur.data);
        this.prevOrder(cur.leftChild);
        this.prevOrder(cur.rightChild);
    }
    public void mediumOrder(TreeNode cur) {
        if (cur == null) {
            System.out.println("null");
            return;
        }
        this.mediumOrder(cur.leftChild);
        System.out.println(cur.data);
        this.mediumOrder(cur.rightChild);
    }
    public void postOrder(TreeNode cur) {
        if (cur == null) {
            System.out.println("null");
            return;
        }
        this.postOrder(cur.leftChild);
        this.postOrder(cur.rightChild);
        System.out.println(cur.data);
    }
}
