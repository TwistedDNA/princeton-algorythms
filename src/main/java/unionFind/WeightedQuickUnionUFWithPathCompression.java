package main.java.unionFind;

public class WeightedQuickUnionUFWithPathCompression implements UnionFind{
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionUFWithPathCompression(int elementsCount) {
        id = new int[elementsCount];
        sz = new int[elementsCount];
        for(int i=0;i<elementsCount;i++){
            id[i] = i;
        }
    }

    @Override public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i){
        int currentRoot = i;
        while(id[currentRoot] != currentRoot) currentRoot = id[currentRoot];
        id[i] = currentRoot;
        return currentRoot;
    }

    @Override public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if(i == j)
            return;
        if (sz[i] < sz[j]){
            id[i] = j;
            sz[j]+=sz[i];
        } else {
            id[j] = i;
            sz[i]+=sz[j];
        }
    }
}