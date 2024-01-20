package org.example;

public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));

    }
    public static boolean isSubsequence(String s, String t) {
        boolean b = true;
        int lastFoundIndex=0;
        for(char c: s.toCharArray()){
//            System.out.println(t.indexOf(c,lastFoundIndex));
            if(t.indexOf(c,lastFoundIndex)>=lastFoundIndex){
                lastFoundIndex = t.indexOf(c,lastFoundIndex)+1;
//                System.out.println(t.indexOf(c,lastFoundIndex));
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}
