package main.java.unionFind;

public class WeightedQuickUnionUFWithPathCompressionAndFind implements UnionFind {

    private int[] id;
    private int[] sz;
    private int[] max;

    public WeightedQuickUnionUFWithPathCompressionAndFind(int elementsCount) {
        id = new int[elementsCount];
        sz = new int[elementsCount];
        max = new int[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            id[i] = i;
            sz[i] = 1;
            max[i] = i;
        }
    }

    @Override public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        int currentRoot = i;
        while (id[currentRoot] != currentRoot) {
            currentRoot = id[currentRoot];
        }
        id[i] = currentRoot;
        return currentRoot;
    }

    @Override public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
            max[j] = max[i] > max[j]? max[i] : max[j];
        } else {
            id[j] = i;
            sz[i] += sz[j];
            max[i] = max[i] > max[j]? max[i] : max[j];
        }
    }

    public int find(int element){
        return max[root(element)];
    }
}