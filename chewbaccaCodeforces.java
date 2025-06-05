import java.util.*;
public class chewbaccaCodeforces {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            int temp=ch-'0';
            if(i==0 && temp==9){
                sb.append(9);
            }
            else if(temp>=5){
                sb.append(9-temp);
            }
            else{
                sb.append(temp);
            }
        }
        System.out.println(sb.toString());
    }
}
