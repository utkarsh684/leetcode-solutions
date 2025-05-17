import java.util.*;
class leetcode1941 {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int count=map.get(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(count!=map.get(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}