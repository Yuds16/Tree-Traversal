package BinaryTree;

public class BinaryTree {

    private Node root;

    public void put(int key, int val) {
        if (root == null) {
            root = new Node(key, val);
        } else {
            insert(root, key, val);
        }
    }

    public void insert(Node start, int key, int val) {
        if (key <= start.getKey()) {
            if (start.getLeft() == null) {
                start.setLeft(new Node(key, val));
            } else {
                insert(start.getLeft(), key, val);
            }
        } else {
            if (start.getRight() == null) {
                start.setRight(new Node(key, val));
            } else {
                insert(start.getRight(), key, val);
            }
        }
    }

    public void listAll(String type) {
        type = type.toLowerCase();
        switch(type) {
            case "in order" :
                inOrder(root);
            case "post order" :
                postOrder(root);
            case "pre order" :
                preOrder(root);
        }
    }

    private void visit(Node n) {
        System.out.println("Node key: " + n.getKey() + " ~ Node val: " + n.getVal());
    }

    private void inOrder(Node n) {
        if (n.getLeft() != null) {
            inOrder(n.getLeft());
        }
        visit(n);
        if (n.getRight() != null) {
            inOrder(n.getRight());
        }
    }

    private void postOrder(Node n) {
        if (n.getLeft() != null) {
            postOrder(n.getLeft());
        }
        if (n.getRight() != null) {
            postOrder(n.getRight());
        }
        visit(n);
    }

    private void preOrder(Node n) {
        visit(n);
        if (n.getLeft() != null) {
            preOrder(n.getLeft());
        }
        if (n.getRight() != null) {
            preOrder(n.getRight());
        }
    }
}