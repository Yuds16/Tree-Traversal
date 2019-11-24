import BinaryTree.BinaryTree;
import java.util.*;

public class Main {
    private void populateTree(BinaryTree t, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            t.put(random.nextInt(20), random.nextInt(20));
        }
    }

    public void run() {
        BinaryTree binaryTree = new BinaryTree();
//        populateTree(binaryTree, 1);
        binaryTree.put(6, 6);
        binaryTree.put(2, 2);
        binaryTree.put(1, 1);
        binaryTree.put(4, 4);
        binaryTree.put(8, 8);
        binaryTree.put(7, 7);
        binaryTree.put(9, 9);
        binaryTree.put(3, 3);
        binaryTree.put(5, 5);
        binaryTree.listAll("in order");
//        binaryTree.listAll("post order");
//        binaryTree.listAll("pre order");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
