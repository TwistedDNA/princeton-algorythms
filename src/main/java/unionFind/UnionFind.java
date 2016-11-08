package main.java.unionFind;

/**
 * Created by Maksym_Mazur on 11/8/2016.
 */
public interface UnionFind {

    public boolean connected(int p, int q);
    public void union(int p, int q);
}
