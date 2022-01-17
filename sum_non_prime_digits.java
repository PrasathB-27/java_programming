import java.util.*;
public class sum_non_prime_digits {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split("");
		int sum=0,f=0;
		for(String s:str){
		    boolean res = prime(Integer.parseInt(s));
		    if(res==false) {f=1;sum=sum+Integer.parseInt(s);}
		}
		if(f==0) System.out.print("-1");
		else System.out.print(sum);
	}
	
	public static boolean prime(int a){
	    if(a==0 || a==1) return false;
	    for(int i=2;i<=a/2;i++){
	        if(a%i==0) return false;
	    }
	    return true;
	}
}