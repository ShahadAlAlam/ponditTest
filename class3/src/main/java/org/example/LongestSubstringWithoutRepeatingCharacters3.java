package org.example;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkewabcda"));
    }

//    public static int lengthOfLongestSubstring(String st) {
//        int maxLength= 0;
//        StringBuffer dupSt = new StringBuffer();
//        int curLength = 0;
//        for(int i=0;i<st.length();i++){
//            String chkSt=String.valueOf(st.charAt(i));
//            if (!dupSt.toString().contains(chkSt)) {
//                dupSt.append(chkSt);
//                curLength += 1;
//                if (curLength > maxLength) {
//                    maxLength = curLength;
//                }
//            } else {
//                dupSt = new StringBuffer( dupSt.substring(dupSt.lastIndexOf(chkSt)+1) );
//                dupSt.append(chkSt);
//                curLength=dupSt.length();
//            }
//        }
//        return maxLength;
//    }

//    public static int lengthOfLongestSubstring(String s) {
//        int ans = 0;
//        int[] count = new int[128];
//
//        for (int l = 0, r = 0; r < s.length(); ++r) {
//            ++count[s.charAt(r)];
//            while (count[s.charAt(r)] > 1)
//                --count[s.charAt(l++)];
//            ans = Math.max(ans, r - l + 1);
//        }
//
//        return ans;
//    }


    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int j = -1;
        int[] aschiiCharTrack = new int[128];
        Arrays.fill(aschiiCharTrack, -1);

        for (int i = 0; i < s.length(); ++i) {
            j = Math.max(j, aschiiCharTrack[s.charAt(i)]);
            ans = Math.max(ans, i - j);
            aschiiCharTrack[s.charAt(i)] = i;
        }

        return ans;
    }
}
