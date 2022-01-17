import java.util.*;
public class matrix_rotate {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int N=sc.nextInt();
           int mat[][]=new int[N][N];
           for(int i=0;i<N;i++){
               for(int j=0;j<N;j++) { mat[i][j]=sc.nextInt();}
           }
           mat_90_deg(mat,N);
    }
    public static void mat_90_deg(int mat[][],int N){
        int mat_90[][]=new int[N][N];
        int c=0,k=0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--) {
                mat_90[c][k++]=mat[j][i];
            }
            c++;
            k=0;
        }
        System.out.println("matrix 90-deg rotation");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){ System.out.print(mat_90[i][j]+" ");}
            System.out.println();
        }
        mat_180_deg(mat_90,N);
    }
    public static void mat_180_deg(int mat_90[][],int N){
        int mat_180[][]=new int[N][N];
        int c=0,k=0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--) {
                mat_180[c][k++]=mat_90[j][i];
            }
            c++;
            k=0;
        }
        System.out.println("matrix 180-deg rotation");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){ System.out.print(mat_180[i][j]+" ");}
            System.out.println();
        }
        mat_270_deg(mat_180,N);
    }
    public static void mat_270_deg(int mat_180[][],int N){
        int mat_270[][]=new int[N][N];
        int c=0,k=0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--) {
                mat_270[c][k++]=mat_180[j][i];
            }
            c++;
            k=0;
        }
        System.out.println("matrix 270-deg rotation");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){ System.out.print(mat_270[i][j]+" ");}
            System.out.println();
        }
        mat_360_deg(mat_270,N);
    }
    public static void mat_360_deg(int mat_270[][],int N){
        int mat_360[][]=new int[N][N];
        int c=0,k=0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--) {
                mat_360[c][k++]=mat_270[j][i];
            }
            c++;
            k=0;
        }
        System.out.println("matrix 360-deg rotation");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){ System.out.print(mat_360[i][j]+" ");}
            System.out.println();
        }
    }
}
