package com.studmat.progs.string;

import com.sun.org.apache.regexp.internal.RE;

public class ReverseInterger {
    public int reverse(int num) {
        {
            // Handling negative numbers
            boolean negativeFlag = false;
            if (num < 0)
            {
                negativeFlag = true;
                num = -num ;
            }

            int prev_rev_num = 0, rev_num = 0;
            while (num != 0)
            {
                int curr_digit = num%10;

                rev_num = (rev_num*10) + curr_digit;

                if ((rev_num - curr_digit)/10 != prev_rev_num)
                {
                    return 0;
                }

                prev_rev_num = rev_num;
                num = num/10;
            }

            return (negativeFlag == true)? -rev_num : rev_num;
        }
    }

    public static void main(String[] args) {
      //  System.out.println(new ReverseInterger().reverse(1534236469));
        System.out.println(new ReverseInterger().reverse(1534236469));
        System.out.println(new ReverseInterger().reverse(563847412));
        System.out.println(new ReverseInterger().reverse(2147483639));
        System.out.println(new ReverseInterger().reverse(-2147483412));
        System.out.println(new ReverseInterger().reverse(-2147483648));
        System.out.println(new ReverseInterger().reverse(-1563847412));

    }
}
