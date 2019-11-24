package BinaryTree;

public class Node {
    private Node left;
    private Node right;
    private int key;
    private int val;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getKey() {
        return key;
    }

    public int getVal() {
        return val;
    }
}
