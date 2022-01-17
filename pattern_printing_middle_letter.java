import java.util.*;
public class pattern_printing_middle_letter {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="sdhqwtyopmzxswekgiryuzwqv";
       int n=str.length();
       String s2="";
       String s3="";
       for(int i=0;i<(n/2);i++){
         s2=s2+String.valueOf(str.charAt(i));
       }
       for(int i=(n/2)+1;i<n;i++){
         s3=s3+String.valueOf(str.charAt(i));
       }
       String s1=String.valueOf(str.charAt(n/2))+s3+s2;
       char ch[]=s1.toCharArray();
       int a=n;
       for(int i=0;i<n;i++){
          for(int j=0;j<a-1;j++){
              System.out.print("*");
          }
          for(int k=0;k<=i;k++){
              System.out.print(ch[k]);
          }
          a--;
          System.out.println();
       }
	}
}
//sdhqwtyopmzxswekgiryuzwqv