import java.util.*;
public class string_in_mat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch[][]=new char[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                ch[i][j]=sc.next().charAt(0);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                sb.append(String.valueOf(ch[i][j]));
            }
        }
        String str=sb.toString();
        String strev=sb.reverse().toString(); 
        if(str.contains(s)) {System.out.print("yes"); return;}
        else if(strev.contains(s)){System.out.print("yes"); return;}
        StringBuilder sx=new StringBuilder();
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                sx.append(String.valueOf(ch[j][i]));
            }
        }
        String str1=sx.toString();
        String strev1=sx.reverse().toString();
        if(str1.contains(s)) {System.out.print("yes"); return;}
        else if(strev1.contains(s)){System.out.print("yes"); return;} 
        System.out.print("no");
    }
}
