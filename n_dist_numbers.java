import java.util.*;
public class n_dist_numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)  arr[i]=sc.nextInt();
        even_num(arr,N);
        odd_num(arr,N);
    }
    public static void even_num(int arr[],int N){
        for(int i=0;i<N;i++){
            if(i%2==0) System.out.print(arr[i]+" ");
        }
    }
    public static void odd_num(int arr[],int N){
        for(int i=N-1;i>=0;i--){
            if(i%2==1) System.out.print(arr[i]+" ");
        }
    }
}
