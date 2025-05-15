class leetcode58 {
    public int lengthOfLastWord(String s) {
        String ss=s.trim();
        String str="";
        int count=0;
        for(int i=ss.length()-1;i>=0;i--){
            if(ss.charAt(i)==' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}