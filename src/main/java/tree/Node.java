package main.java.tree;

/**
 * Created by Maksym_Mazur on 11/10/2016.
 */
public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    public void add(int p) {
        if (p > value) {
            if (right == null) {
                right = new Node(p);
            } else {
                right.add(p);
            }
        } else {
            if (left == null) {
                left = new Node(p);
            } else {
                left.add(p);
            }
        }
    }

    public String show() {
        return (left != null ? left.show() : "") + value + " " + (right != null ? right.show() : "");
    }


}
