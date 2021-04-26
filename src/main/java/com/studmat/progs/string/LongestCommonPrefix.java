package com.studmat.progs.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String firstIndex  = strs[0];
        int index = 0;
        boolean flag = false;

        while(!flag && index < firstIndex.length()) {
            for (int i = 1; i < strs.length; i++) {
                if (index > (strs[i].length()-1)) {
                    flag = true;
                    break;
                }

                if (!(firstIndex.charAt(index) == strs[i].charAt(index))) {
                    flag = true;
                }

            }
            if (!flag) {
                prefix += firstIndex.charAt(index);
            }else{
                break;
            }
            index++;
        }

    return prefix;
    }

    public static void main(String[] args) {
        String s[] = new String[]{"flower","flow","flight"};
        String s1[] = new String[]{"car1","car","car2"};
        String s2[] = new String[]{"abdce","iroplane","rt"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(s2));
    }
}
