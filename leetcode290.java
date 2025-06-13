import java.util.*;
class leetcode290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map =new HashMap<>();
        HashMap<Character, String> map2=new HashMap<>();

        String words[]=s.split(" ");

         if (words.length != pattern.length()) return false;


        for(int i=0;i<words.length;i++){

            String str=words[i];
            char ch=pattern.charAt(i);
            if(map.containsKey(str)){
                if(map.get(str)!=ch){
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch)){
                    return false;
                }
                 map.put(str,ch);
            map2.put(ch,str);

            }
           
        }
        return true;
    }
}
