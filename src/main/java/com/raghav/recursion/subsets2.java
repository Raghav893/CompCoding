package com.raghav.recursion;
import java.util.*;

public class subsets2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(new ArrayList<>(), 0, nums);
        return res;
    }
    void solve(List<Integer> cur, int i, int[] nums) {

        res.add(new ArrayList<>(cur));

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            cur.add(nums[j]);
            solve(cur, j + 1, nums);
            cur.removeLast();

        }
    }
    public static void main(String[] args) {
        subsets2 obj = new subsets2();
        int[] nums = {1, 2, 2};
        System.out.println(obj.subsetsWithDup(nums));
    }
    }
