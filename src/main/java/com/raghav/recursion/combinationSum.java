package com.raghav.recursion;
import java.util.*;
class combinationSum {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    void solve(int[] candidates, int target, List<Integer> current, int i) {
        if (sum(current) == target) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (sum(current) > target || i == candidates.length) {
            return;
        }
        current.add(candidates[i]);
        solve(candidates, target, current, i );
        current.removeLast();

        solve(candidates, target, current, i + 1);
    }

    int sum(List<Integer> current) {
        int sum = current.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum;
    }

    public static void main(String[] args) {
        combinationSum obj = new combinationSum();
        int [] nums = {2,3,6,7};
        System.out.println(obj.combinationSum(nums,7));
    }
}