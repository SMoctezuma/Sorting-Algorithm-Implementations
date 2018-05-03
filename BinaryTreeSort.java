package FA2016_LAB8;

import java.text.DecimalFormat;

public class BinaryTreeSort {
    public Node root;
    public BinaryTreeSort(Object x) {
        root = new Node(x);
    }
    public Node insert(Node node, Integer x) {
        if (node == null) {
            return node = new Node(x);
        }
        if (x < (Integer) node.element) {
            node.left = insert(node.left, x);
        } else {
            node.right = insert(node.right, x);
        }
        return node;
    }

    public void ShowAll_LNR(Node node) {
        if (node != null) {
            ShowAll_LNR(node.left);
            System.out.print(((Integer) node.element).intValue() + ",");
            ShowAll_LNR(node.right);
        }
    }
    public void print(long time, int data) {
        long endTime = System.currentTimeMillis();
        System.out.println("\n***********************************");
        System.out.println("Sorting Method: Binary Tree Sort");
        System.out.println("Data: "+data+" random numbers");
        System.out.println("Start time: "+ time);
        System.out.println("Ending time: "+ endTime);
        double seconds = ((endTime-time)/1000f);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sorting time (in seconds): " + df.format(seconds));
        System.out.println("***********************************\n");
    }
    class Node {
        public Object element;
        public Node left;
        public Node right;

        public Node(Object theElement) {
            this(theElement, null, null);
        }

        public Node(Object theElement, Node LNode, Node RNode) {
            element = theElement;
            this.left = LNode;
            this.right = RNode;
        }
    }
}

