package com.raghav.greedy;

import java.util.Arrays;

public class ActivitySelection {
    public int activitySelection(int[] start, int[] finish){
        int n = start.length;
        if (n == 0) {
            return 0;
        }
        int [][] res = new int[n][2];
        for (int i =0;i<n;i++){
            res[i][0]=start[i];
            res[i][1]=finish[i];
        }
        Arrays.sort(res,
                (a,b)->Integer.compare(a[1],b[1]));
        int count =1;
        int lastFinish=res[0][1];
        for (int i =1 ;i<n;i++){
            if (res[i][0]>=lastFinish){
                count++;
                lastFinish=res[i][1];
            }
        }
        return count;
    }
}
