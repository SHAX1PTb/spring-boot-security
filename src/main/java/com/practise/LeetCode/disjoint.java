package com.practise.LeetCode;

public class disjoint {

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);
        uf.union(1, 2);
        System.out.println(uf.connected(1, 2));
    }

    private static class UnionFind {

        int[] root;
        int[] rank;

        public UnionFind(int size){
            root = new int[size] ;
            rank = new int[size] ;

            for(int i =0;i<size;i++){
                root[i] =i;
                rank[i] =i;

            }
        }

        public int find(int x){

            if(root[x] == x){
                return x;
            }

            return root[x] = find(root[x]);

        }

        public void union(int x , int y){
            int rootx = x;
            int rooty = y;

            if(rootx != rooty){
               if(rank[rootx] >  rank[rooty]){
                   root[rooty] = rootx;
               } else if(rank[rootx] < rank[rooty]){
                   root[rootx] = rooty;
               } else {
                   root[rootx] = rooty;
                   rank[rootx] += 1;
               }

            }

        }

        public boolean connected(int x, int y){

            return find(x) == find(y);
        }



    }


}
