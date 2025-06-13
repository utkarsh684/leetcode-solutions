import java.util.HashMap;

class leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();

        for(char c: s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i))<=0){
                    return false;
                }
                else{
                    map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
       
        
    }
}

