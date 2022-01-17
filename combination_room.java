import java.io.*;
import java.util.*;
public class combination_room {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int k = 8;
        int n = arr.length;
        printCombination(arr, n, k);
    }
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r,int k)
    {
        int c=0;
        if (index == r)
        {
            int sum=0;
            for (int j=0; j<r; j++){
                sum=sum+data[j];
            }
            if(sum==k){ c++; System.err.println(c+" ");}
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r,k);
        }
    }
    static void printCombination(int arr[], int n,int k)
    {
      
        for(int i=1;i<=n;i++){
            int data[]=new int[i];
        combinationUtil(arr, data, 0, n-1, 0, i,k);
        }
    }

}