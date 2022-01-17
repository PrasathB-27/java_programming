import java.util.*;
public class spread_char {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s[]=sc.nextLine().split("");
        int a=sc.nextInt();
        int b=sc.nextInt();
        StringBuilder sb= new StringBuilder();
        int c=0;
        for(int i=0;i<b;i++){
            if(i%s.length == 0) c=0;
            sb.append(s[c++]); 
        }
        System.out.println(sb.toString());
        System.out.println(sb.charAt(a-1));
        System.out.println(sb.charAt(b-1));
        if(sb.charAt(a-1) == sb.charAt(b-1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
