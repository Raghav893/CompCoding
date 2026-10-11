package com.raghav.recursion;
import java.util.*;
public class combinationSum2 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(
            int[] candidates, int target) {

        Arrays.sort(candidates);

        solve(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    void solve(int[] candidates, int target,
               List<Integer> current, int i) {

        int total = sum(current);

        if (total == target) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (total > target || i == candidates.length) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {

            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }

            current.add(candidates[j]);

            solve(candidates, target, current, j + 1);

            current.removeLast();
        }
    }

    int sum(List<Integer> current) {
        int sum = current.stream()
                .mapToInt(Integer::intValue)
                .sum();

        return sum;
    }
    public static void main(String[] args) {
        combinationSum2 obj = new combinationSum2();
        int [] nums = {10,1,2,7,6,1,5};
        System.out.println(obj.combinationSum2(nums,8));
    }
}
