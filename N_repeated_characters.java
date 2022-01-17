import java.util.*;
import java.Collections;
public class N_repeated_characters {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str[]=sc.nextLine().split("");
	    int a=sc.nextInt();
	    List<String>l=new ArrayList<String>();
	    for(int i=0;i<str.length;i++){
	        l.add(str[i]);
	    }
	    String max;
	    for(int i=0;i<l.size();i++){
	        if(Collections.frequency(l,str[i])==a){
	            max=str[i];
	        }
	    }
	    System.out.print(max);
	}
}