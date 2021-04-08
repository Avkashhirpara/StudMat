package com.studmat.progs;

public class BuySellStock {

    public int maxProfit(int[] prices) {
        int prfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                prfit += prices[i] - prices[i - 1];
        }
        return prfit;

    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,5,6,4,5};
        int nums1[] = new int[] {7,1,5,1,2,4};
        int nums2[] = new int[]{7,6,4,3,1};

        System.out.println("nums -> "+new BuySellStock().maxProfit(nums));
        System.out.println("nums1 -> "+new BuySellStock().maxProfit(nums1));
        System.out.println("nums2 -> "+new BuySellStock().maxProfit(nums2));


    }
}
