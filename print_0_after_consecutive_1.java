import java.util.*;
public class print_0_after_consecutive_1 {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=12;
		int b=2;
       int arr[]={1,0,1,1,0,1,1,0,1,1,1,1};
		int f=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==1){
		        System.out.print(arr[i]+" ");
		        f++;
		    }
		    else{
		        f=0;
		        System.out.print(arr[i]+" ");
		    }
		    if(f==b){
		        System.out.print("0"+" ");
		        f=0;
		    }
		}
	}
}