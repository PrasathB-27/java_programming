import java.util.*;
public class Min_sum_and_ind_pos
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            arr2[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE,i1=0,i2=0,sum=Integer.MAX_VALUE;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i!=j){
                    sum=arr1[i]+arr2[j];
                }
                if(min>sum){
                    min=sum;
                    i1=arr1[i];
                    i2=arr2[j];
                }
            }
        }
        System.out.print(i1+","+i2);
    }
}
