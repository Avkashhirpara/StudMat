package com.studmat.progs.string;

import java.util.LinkedList;
import java.util.List;

public class CountAndSay {

    public String countAndSay(int n) {
        String str = "21";
        int counter = 1;
        StringBuffer nextStr = new StringBuffer();
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        if (n == 3) {
            return "21";
        }
        while (n > 3){
            int i = 0;
            for (; i < str.length()-1; i++) {
                if(str.charAt(i) == str.charAt(i+1)){
                    counter++;
                }else{
                    nextStr.append(counter).append(str.charAt(i));
                    counter = 1;
                }
            }
            nextStr.append(counter).append(str.charAt(i));
            str = nextStr.toString();
            nextStr.delete(0, nextStr.length());
            counter = 1;
            n--;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(11));
    }


}
