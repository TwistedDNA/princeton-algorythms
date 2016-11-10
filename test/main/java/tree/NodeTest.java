package main.java.tree;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Maksym_Mazur on 11/10/2016.
 */
public class NodeTest {
    @Test
    public void simpleTreeTest(){
        Node node = new Node(3);
        node.add(2);
        node.add(4);
        assertEquals("2 3 4 ", node.show());
    }

}