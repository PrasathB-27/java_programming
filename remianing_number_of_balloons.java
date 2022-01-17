import java.util.*;
public class remianing_number_of_balloons {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[a];
		int arr1[]=new int[b];
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++){
		    arr1[i]=sc.nextInt();
		}
		int f=0,c=0;
		for(int i=0;i<a;i++){
		    f=0;
		    for(int j=0;j<b;j++){
		        if((arr[i]%arr1[j])==0){
		            f=1;
		        }
		    }
		    if(f==0){
		        System.out.print(arr[i]+" ");
		        c=1;
		    }
		}
		if(c==0){
		    System.out.print("-1");
		}
	}
}