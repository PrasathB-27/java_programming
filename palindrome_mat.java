import java.util.*;
public class palindrome_mat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int mat[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            int c=i;
           boolean res=column_chk(mat,c,a);
           if(res==true){
               System.out.print("yes");
               return ;
           }
           else{
               System.out.print("no");
               return ;
           }
           //column_rev(mat,i,a);
        }
    }
    public static boolean column_chk(int mat[][],int c,int a){
        int f=0;
           for(int i=0,j=a-1;i<a/2;i++,j--){
                  if(mat[i][c]==mat[j][c]){
                        f=1;
                  } 
           }
           if(f==1) return true;
           return false;
    }
}
