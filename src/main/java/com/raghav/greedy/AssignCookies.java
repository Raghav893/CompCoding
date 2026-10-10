package com.raghav.greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int l =0;
        int r=0;
        int ctr=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<g.length && r<s.length){
            if(s[r]>= g[l]){
                ctr++;
                l++;
                ;
            }
            r++;
        }
        return ctr;
    }

    public static void main(String[] args) {
        AssignCookies cookies = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(cookies.findContentChildren(g,s));

    }
}
