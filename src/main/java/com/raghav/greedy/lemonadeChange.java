package com.raghav.greedy;

public class lemonadeChange {
    public boolean lemonadeChangefunc(int[] bills) {
        int b5 = 0;
        int b10 = 0;

        for (int i : bills) {
            if (i == 5) {
                b5++;
            } else if (i == 10) {
                if (b5 > 0) {
                    b5--;
                    b10++;
                } else {
                    return false;
                }

            } else if (i == 20) {
                if (b10 > 0 && b5 > 0) {
                    b10--;
                    b5--;
                } else if (b5 >= 3) {
                    b5 = b5 - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lemonadeChange obj = new lemonadeChange();
        int[] nums = {5,5,5,10,20};
        System.out.println(obj.lemonadeChangefunc(nums));
    }
}
