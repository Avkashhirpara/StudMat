package com.studmat.progs.string;

import com.studmat.progs.arrays.RotateArray;
import sun.security.util.Length;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp = ' ';
        int len = s.length;
        for (int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[len-1-i];
            s[len-1-i] = temp;
        }

    }
    public static void main(String[] args) {
        char s[] = new char[]{'H','a','n','A','n','a','h'};
        System.out.println(String.copyValueOf(s));
        new ReverseString().reverseString(s);
        System.out.println(String.copyValueOf(s));
    }
}
