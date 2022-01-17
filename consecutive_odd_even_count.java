import java.util.*;
public class consecutive_odd_even_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<a;i++){
            int ce=0,co=0;
            for(int j=0;j<b;j++){
                if(arr[i][j]%2==0){
                    ce++;
                }
                else{
                    if(max<ce){
                        max=ce;
                    }
                    ce=0;
                }
                if(arr[i][j]%2!=0){
                    co++;
                }
                else{
                    if(max<co){
                        max=co;
                    }
                    co=0;
                }
            }
        }
        for(int i=0;i<b;i++){
            int ce=0,co=0;
            for(int j=0;j<a;j++){
                if(arr[j][i]%2==0){
                    ce++;
                }
                else{
                    if(max<ce){
                        max=ce;
                    }
                    ce=0;
                }
                if(arr[j][i]%2!=0){
                    co++;
                }
                else{
                    if(max<co){
                        max=co;
                    }
                    co=0;
                }
            }
        }
        System.out.print(max);
    }
}