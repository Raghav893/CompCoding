package com.raghav.recursion;

import java.util.ArrayList;
import java.util.List;

public class combination {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationFinder(int n , int k){
        solve(n,k,new ArrayList<>(),0);
        return res;
    }
    void  solve(int n,int k ,List<Integer> current,int start ){
        if (current.size() == k ){
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i  = start;i<=n;i++){
            current.add(i);
            solve(n,k,current,i+1);
            current.removeLast();
        }
    }

    public static void main(String[] args) {
        combination finder = new combination();
        int n = 4;
        int k = 2;
        System.out.println(finder.combinationFinder(n, k));
    }
}
