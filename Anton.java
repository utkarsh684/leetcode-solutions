import java.util.*;
public class Anton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(str[i].equals("Tetrahedron")){
                sum=sum+4;
            }
            else if(str[i].equals("Cube")){
                sum=sum+6;
            }
            else if(str[i].equals("Octahedron")){
                sum=sum+8;
            }
            else if(str[i].equals("Dodecahedron")){
                sum=sum+12;
            }
            else if(str[i].equals("Icosahedron")){
                sum=sum+20;
            }
        }
        System.out.println(sum);
    }
}
