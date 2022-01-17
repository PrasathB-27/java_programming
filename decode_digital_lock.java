import java.util.*;
public class decode_digital_lock {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String str=String.valueOf(a);
		char ch[]=str.toCharArray();
		String s="";
		int sum=0;
		for(char c:ch){
		    int p=1;
		    for(int i=1;i<=ch.length;i++){
		        p=p*(c-'0');
		    }
		    sum=sum+p;
		}
        s=String.valueOf(sum);
		
		sum=0;
		if(s.equals(str)){
		    for(int i=0;i<ch.length;i++){
		        if((ch[i]-'0') % 2==0) sum=sum+(ch[i]-'0');
		    }
		}
		else{
		    for(int i=0;i<ch.length;i++){
		        if((ch[i]-'0') % 2!=0) sum=sum+(ch[i]-'0');
		    }
		}
		System.out.print(sum);
	}
	
}