package com.studmat.progs.string;

public class StringToInteger {
    public int myAtoi(String s) {
        int result =0;
        int prev_rev_num = 0;
        s= s.trim();
        boolean isNegative = s.charAt(0) == '-';
        int i=0;
        if(isNegative ||s.charAt(0) == '+') {
            i = 1;
        }
        for (;i < s.length(); i++) {
            if(!(s.charAt(i) >='0' && s.charAt(i) <= '9')){
                break;
            }else{
                result = result * 10 + (s.charAt(i)-'0');
                if ((result - (s.charAt(i)-'0'))/10 != prev_rev_num  || result < 0 ) {
                    if(isNegative)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }
                prev_rev_num = result;
            }
        }
        return isNegative ? -result:result ;
    }

    public static void main(String[] args) {
//        System.out.println(new StringToInteger().myAtoi("42"));
//        System.out.println(new StringToInteger().myAtoi("-42"));
//        System.out.println(new StringToInteger().myAtoi("4193 with words"));
//        System.out.println(new StringToInteger().myAtoi("4193 with words"));
//        System.out.println(new StringToInteger().myAtoi("-91283472332"));
//        System.out.println(new StringToInteger().myAtoi("+32"));
        System.out.println(new StringToInteger().myAtoi("-2147483649"));
    }
}
