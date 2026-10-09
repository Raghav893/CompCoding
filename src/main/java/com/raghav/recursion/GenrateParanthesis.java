package com.raghav.recursion;

import java.util.*;

class GenrateParanthesis {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        solve("", 0, 0, n);
        return res;
    }

    void solve(String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            res.add(cur);
            return;
        }
        if (open < n) {
            solve(cur + "(", open + 1, close, n);
        }
        if (close < open) {
            solve(cur + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenrateParanthesis obj = new GenrateParanthesis();
        int n = 3;
        System.out.println(obj.generateParenthesis(n));
    }
}
