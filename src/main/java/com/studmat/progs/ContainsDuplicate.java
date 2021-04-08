package com.studmat.progs;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public int containsDuplicate(int[] nums) {
        int s  = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i <  nums.length; i++) {
           if(set.contains(nums[i])){
               set.remove(nums[i]);
           }else{
               set.add(nums[i]);
           }
        }
        return set.iterator().next().intValue();
    }
    public static void main(String[] args) {
        int num[] = new int[]{1,3,3,4,1};

        System.out.println(new ContainsDuplicate().containsDuplicate(num));
    }
}
