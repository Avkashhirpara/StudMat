package com.studmat.progs.string;

public class IndexOf {

    public int strStr(String haystack, String needle) {
        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;


        for (int i = 0; i < haystack.length(); i++) {
            // no enough places for needle after i
            if (i + needle.length() > haystack.length()) break;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
//        System.out.println(new IndexOf().strStr("he0llo", "ll"));
//        System.out.println(new IndexOf().strStr("aaaaa", "baa"));
//        System.out.println(new IndexOf().strStr("", ""));
//        System.out.println(new IndexOf().strStr("aaa", "aaaa"));
//        System.out.println(new IndexOf().strStr("mississippi", "issipi"));
//        System.out.println(new IndexOf().strStr("mississipipi", "issipi"));
//        System.out.println(new IndexOf().strStr("mississippi", "issi"));
        System.out.println(new IndexOf().strStr("mississippi", "pi"));
        System.out.println(new IndexOf().strStr("miississippi", "is"));
        System.out.println(new IndexOf().strStr("babbsa", "bbb"));


    }


}
