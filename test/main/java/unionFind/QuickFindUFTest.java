package main.java.unionFind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by Maksym_Mazur on 11/8/2016.
 */
public class QuickFindUFTest {


    @Test
    public void testQuickFind() {
        shouldBeProperlyConnected(new QuickFindUF(10));
    }

    @Test
    public void testQuickUnion() {
        shouldBeProperlyConnected(new QuickUnionUF(10));
    }

    @Test
    public void testWeightedQuickUnion() {
        shouldBeProperlyConnected(new WeightedQuickUnionUF(10));
    }

    @Test
    public void testWeightedQuickUnionWithPathCompression() {
        shouldBeProperlyConnected(new WeightedQuickUnionUFWithPathCompression(10));
    }

    @Test
    public void findMaxTest(){
        WeightedQuickUnionUFWithPathCompressionAndFind implementation = new WeightedQuickUnionUFWithPathCompressionAndFind(5);
        implementation.union(0, 1);
        implementation.union(0, 2);
        implementation.union(2, 4);
        assertEquals("Max element for {0,1,2,4} should be 4",4,implementation.find(1));
        assertEquals("Max element for {0,1,2,4} should be 4",4,implementation.find(0));
        assertEquals("Max element for {0,1,2,4} should be 4",3,implementation.find(3));
    }


    public void shouldBeProperlyConnected(UnionFind uf) {
        uf.union(0, 1);
        uf.union(0, 2);
        uf.union(2, 4);
        assertTrue(uf.connected(0, 4));
        assertFalse(uf.connected(0, 3));
    }

}