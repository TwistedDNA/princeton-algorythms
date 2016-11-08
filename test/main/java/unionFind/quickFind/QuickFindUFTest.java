package main.java.unionFind.quickFind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by Maksym_Mazur on 11/8/2016.
 */
public class QuickFindUFTest {
    private QuickFindUF quickFindUF;

    @Test
    public void shouldBeProperlyConnected(){
        quickFindUF = new QuickFindUF(10);

        quickFindUF.union(0,1);
        quickFindUF.union(0,2);
        quickFindUF.union(2,4);
        assertTrue(quickFindUF.connected(0,4));
        assertFalse(quickFindUF.connected(0,3));
    }

}