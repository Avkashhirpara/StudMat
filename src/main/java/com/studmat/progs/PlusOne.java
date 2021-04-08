package com.studmat.progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        if(digits[digits.length-1] < 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] == 9){
                if(carry == 1) {
                    list.add(0);
                    carry = 1;
                }else{
                    list.add(digits[i]);
                    carry = 0;
                }

            }else{
                list.add(digits[i]+carry);
                carry = 0;
            }
        }
        if(carry == 1) {
            list.add(carry);
        }

        int[] r = new int[list.size()];
        int j = 0;
        for (int i=list.size()-1; i >= 0; i--) {
            r[j++] = list.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int num1[] = new int[]{4,9,9,5,4};
        int num2[] = new int[]{9,9,9,9};
         num1 = new PlusOne().plusOne(num2);
        Arrays.stream(num1).forEach(System.out::print);
        System.out.println();
    }
}
