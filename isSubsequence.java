import java.util.*;
class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        ArrayList<Character> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }

        int index=0;

        for(int i=0;i<t.length();i++){
            if(index<list.size() && t.charAt(i) == list.get(index)){
                index++;
            }
        }
        return index==list.size();
    }
}
