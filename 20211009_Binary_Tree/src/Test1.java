/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/9 16:07
 **/
public class Test1 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode('A');
        BinaryTree tree = new BinaryTree();
        tree.root = a;
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        a.leftChild = b;
        a.rightChild = c;
        b.leftChild = d;
        b.rightChild = e;
        c.leftChild = f;
        tree.postOrder(tree.root);
    }


}
