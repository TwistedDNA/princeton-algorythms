package main.java.unionFind;

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


    public void shouldBeProperlyConnected(UnionFind uf) {
        uf.union(0, 1);
        uf.union(0, 2);
        uf.union(2, 4);
        assertTrue(uf.connected(0, 4));
        assertFalse(uf.connected(0, 3));
    }

}