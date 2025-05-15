import java.util.HashSet;
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ch=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            while(ch.contains(s.charAt(right))){
                ch.remove(s.charAt(left));
                left++;
            }
            ch.add(s.charAt(right));
            maxLen=Math.max(right-left+1,maxLen);
        }
        return maxLen;
    }
}