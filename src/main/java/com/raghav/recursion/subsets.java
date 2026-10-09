package com.raghav.recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(new ArrayList<>(), 0, nums);
        return res;
    }

    void solve(List<Integer> cur, int i, int[] nums) {
        if (i == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        solve(cur, i + 1, nums);
        cur.removeLast();

        solve(cur, i + 1, nums);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(obj.subsets(nums));
    }
}