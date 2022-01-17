import java.util.*;
public class count_of_char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strcpy=str;
        str =(str.replaceAll("[^\\d]", " ")).trim();
        String num[]=str.split(" ");
        strcpy=strcpy.replaceAll("[^a-z]","");
        char[] c_ch=strcpy.toCharArray();
        for(int i=0;i<num.length;i++){
            spread(num[i],c_ch[i]);
        }
    }
    public static void spread(String s1,char ch){
        int n=Integer.parseInt(s1);
         for(int i=0;i<n;i++){
             System.out.print(ch);
         }
    }
}
