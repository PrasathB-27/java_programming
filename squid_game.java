
import java.util.*;
import java.lang.*;
import java.io.*;
// 3
// 3
// 3 1 2
// 5
// 1 1 1 1 1
// 6
// 3 6 4 2 5 1

/* Name of the class has to be "Main" only if the class is public. */
class squid_game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[i]=sc.nextInt();
		    }
            int max=0;
		    for(int k=0;k<n;k++){
		        int sum=0;
		        for(int l=0;l<n;l++){
		            if(k==l) continue;
		            sum=sum+arr[l];
		        }
                if(sum>max){
                    max=sum;
                }
		    }
            System.out.print(max);
		    System.out.println();
		}
	}
}
