package main.java.unionFind;

public class QuickUnionUF implements UnionFind{
    private int[] id;

    public QuickUnionUF(int elementsCount) {
        id = new int[elementsCount];
        for(int i=0;i<elementsCount;i++){
            id[i] = i;
        }
    }

    @Override public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i){
        while(id[i] != i) i = id[i];
        return i;
    }

    @Override public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        id[rootP] = rootQ;
    }
}