package main.java.unionFind.quickFind;

import main.java.unionFind.UnionFind;

public class QuickFindUF implements UnionFind{
    private int[] id;

    public QuickFindUF(int elementsCount) {
        id = new int[elementsCount];
        for(int i=0;i<elementsCount;i++){
            id[i] = i;
        }
    }

    @Override public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for(int i=0;i<id.length;i++){
            if(id[i] == pId) id[i] = qId;
        }
    }
}