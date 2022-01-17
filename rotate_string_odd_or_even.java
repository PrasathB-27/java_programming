import java.util.*;
public class rotate_string_odd_or_even  {
    public static void main(String[] args) {
	   Scanner sc=new  Scanner(System.in);
	   String str[]=sc.nextLine().split(",");
	   for(int i=0;i<str.length;i++){
	       char ch[]=str[i].toCharArray();
	       int sum=0,j=0;
	       for(j=ch.length-1;j>=0;j--){
	           if(ch[j]==':') {break;}
	           sum=sum+((ch[j]-'0')*(ch[j]-'0'));
	       }
	       if(sum%2==0)
	       {
	           int c=j-1;
	           System.out.print(ch[c]);
	           for(j=0;j<=c-1;j++){
	               System.out.print(ch[j]);
	           }
	       }
	       else {
	           String s[]=str[i].split(":");
	           System.out.print(s[0].substring(2,s[0].length())+""+s[0].substring(0,2));
	       }
	       System.out.println();
	   }
	}
}

