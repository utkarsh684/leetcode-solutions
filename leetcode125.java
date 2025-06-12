class leercode125 {
    public boolean isPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<j){
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);
        if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)){
            if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        if(!Character.isLetterOrDigit(Character.toLowerCase(ch1))){
            i++;
        }
        if(!Character.isLetterOrDigit(Character.toLowerCase(ch2))){
            j--;
        }
       }
       return true;
    }
}
