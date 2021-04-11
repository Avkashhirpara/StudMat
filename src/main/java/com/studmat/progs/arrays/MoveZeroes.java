package com.studmat.progs.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int firstzero = 0;
        int swap = 0;
        for (int i = 0; i <nums.length - 1; i++) {
            if(nums[i] != 0){
                firstzero++;
                continue;
            }
            if(nums[i+1] != 0){
                swap = nums[i+1];
                nums[i+1] = 0;
                nums[firstzero] = swap;
                firstzero++;
            }
        }

    }

    public static void main(String[] args) {
      //int num1[] = new int[]{0,1,0,3,12};
        int num1[] = new int[]{6,1,3,0,12,0};
        new MoveZeroes().moveZeroes(num1);
        Arrays.stream(num1).forEach(System.out::print);
        System.out.println();
    }


//    0,1,0,3,12
//    1 0 0 3 12
//    1 3 0 0 12
//    1 3 12 0 0
}
