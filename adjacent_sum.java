import java.util.*;
public class adjacent_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int k=0;k<b;k++){
        for(int i=0;i<a;i++){
           sum=0;
            if(i==0){
              arr[i]=arr[i+1];
            }
            else if(i==a-1){
               arr[i]=arr[i-1];
            }
            else{
              sum=arr[i-1]+arr[i+1];
              arr[i]=sum;
            }
        }
    }
    for(int i=0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
    }
}






































































































