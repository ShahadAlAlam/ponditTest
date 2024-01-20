package org.example;

public class MergeStringsAlternately1768 {
    public static void main(String[] args) {

    }
    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.max(len1,len2);
        int minlen = Math.min(len1,len2);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<minlen;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
        }
        s.append(len1>len2? word1.substring(len,len1):word2.substring(len,len2));
        return s.toString();
    }
}
