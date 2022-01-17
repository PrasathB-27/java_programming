import java.util.*;
public class sort_every_k_Integers {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=sc.nextInt();
		Integer arr[]=new Integer[a];
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		int b=0,n=k;
		while(a>=k){
		    Integer arr1[]=Arrays.copyOfRange(arr,b,b+k);
		    Arrays.sort(arr1,Collections.reverseOrder());
		    for(int i=0;i<arr1.length;i++){
		        System.out.print(arr1[i]+" ");
		    }
		    b=b+k;
		    a=a-n;
		}
	Integer arr2[]=Arrays.copyOfRange(arr,b,b+(a%k));
	Arrays.sort(arr2,Collections.reverseOrder());
	for(int i=0;i<arr2.length;i++){
	    System.out.print(arr2[i]+" ");
	}
	}
}