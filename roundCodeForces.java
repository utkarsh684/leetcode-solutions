import java.util.*;
public class roundCodeForces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String arr[]=new String[t];
        for(int i=0;i<t;i++){
            String str=sc.next();
            arr[i]=str;
        }
        for(int i=0;i<arr.length;i++){
             List<Integer> list = new ArrayList<>();

            String str=arr[i];
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                int temp=(ch-'0')*(int)Math.pow(10,str.length()-j-1);
                if(temp!=0){
                     list.add(temp);
                }
            }
            System.out.println(list.size());
             for (int val : list) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}