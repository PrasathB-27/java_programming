import java.util.*;
public class reversed_n_shift_mat_edge {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mat[][]=new int[a][b];
		for(int i=0;i<a;i++)
		    for(int j=0;j<b;j++)
		       mat[i][j]=sc.nextInt();
		int l=mat[0][0];
		for(int i=1;i<a;i++){
		    StringBuilder sb=new StringBuilder();
		    sb.append(mat[i][0]);
		    sb.reverse();
		    mat[i-1][0]=Integer.parseInt(sb.toString());
		}
		for(int i=1;i<b;i++){
		    StringBuilder sb=new StringBuilder();
		    sb.append(mat[a-1][i]);
		    sb.reverse();
		    mat[a-1][i-1]=Integer.parseInt(sb.toString());
		}
		for(int i=a-2;i>=0;i--){
		    StringBuilder sb=new StringBuilder();
		    sb.append(mat[i][b-1]);
		    sb.reverse();
		    mat[i+1][b-1]=Integer.parseInt(sb.toString());
		}
		for(int i=b-2;i>=1;i--){
		    StringBuilder sb=new StringBuilder();
		    sb.append(mat[0][i]);
		    sb.reverse();
		    mat[0][i+1]=Integer.parseInt(sb.toString());
		}
		StringBuilder sx = new StringBuilder();
		mat[0][1]=Integer.parseInt(sx.append(l).reverse().toString());
		
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}

//test case:

// input:  3
//         3
//         2 3 4
//         5 6 7
//         8 9 1

// output :  5 2 3 
//           8 6 4
//           9 1 7


