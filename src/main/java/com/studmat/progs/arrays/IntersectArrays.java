package com.studmat.progs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectArrays  {

        public int[] intersect(int[] nums1, int[] nums2) {
            int i = 0, j = 0;
            // sort
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {

                if (nums1[i] > nums2[j]) {
                    j++;
                }

                else if (nums2[j] > nums1[i]) {
                    i++;
                }
                else {
                    // when both are equal
                    list.add(nums1[i]);
                    i++;
                    j++;
                }
            }

            return  list.stream().mapToInt(k->k).toArray();
        }

    public static void main(String[] args) {
        //int num1[] = new int[]{1,2,2,1};
        int num1[] = new int[]{4,9,9,5,4};
//        int num2[] = new int[]{2,2};
        int num2[] = new int[]{9,4,9,8,4};
        new IntersectArrays().intersect(num1,num2);

    }
}
