import java.util.*;
import java.util.stream.*;
public class Array_Leaders {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int[] A={10,17,4,3,5,2};
		int n=A.length;
       int f=0;
	    for(int i=0;i<n;i++){
          f=0;
	        for(int j=i+1;j<n;j++){
	            if(A[i]<A[j] || A[i]==A[j]){
	                f=1;
	            }
	        }
          if(f==0)
	        System.out.print(A[i]+" ");
	    }	
	}
}