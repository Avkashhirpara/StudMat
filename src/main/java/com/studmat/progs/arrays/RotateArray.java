package com.studmat.progs.arrays;

public class RotateArray {

        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    public static void main(String[] args) {
            int num[] = new int[]{1,2,3,4,5,6,7,8,9};
            new RotateArray().rotate(num,4);
//        int num[] = new int[]{1,2,3,4,5,6};
//        new RotateArray().rotate(num,2);
            System.out.println(num);
    }
}

