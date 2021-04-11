package com.studmat.progs.arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int position = 0 ;
        int swap = 0 ;
        for (int i = 1 ; i < nums.length ; i++){
              if (nums[position] != nums[i]){
                    swap = nums[position+1];
                    nums[position+1] = nums[i];
                    nums[i] = swap;
                    position++;
              }
        }

        return position+1;
    }

    public static void main(String[] args) {
        int[] num = new int[]{0,1,2,3,3,4,5,6,7};
        int len = new RemoveDuplicates().removeDuplicates(num);
        for (int i = 0; i < len; i++) {
            System.out.print(num[i]);
        }
    }
}
