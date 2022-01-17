import java.util.*;
public class cross_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch[][]=new char[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                ch[i][j]=sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String str[]=sc.nextLine().split(";");
        char arr[]=new char[a*b];
        char arr1[]=new char[a*b];
        int c=0,s=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[c++]=ch[i][j];
            }
            for(int k=0;k<a;k++){
                arr1[s++]=ch[k][i];
            }
        }
        c=0;
        int st=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='-') {
                if(c==0) st=i;
                c++;
            }
            else if(c>1){
                for(int j=0;j<str.length;j++){
                    if( str[j].length() == c ){
                        char r[]=str[j].toCharArray();
                        int ct=r.length;
                        for(int k=c;k>=st;k--){
                              arr[k]=r[ct--];
                            //   System.out.print(arr[k]);
                        } 
                    }  
                }
                c=0;
                st=0;
            } 
            else {c=0; st=0;}
        }
        c=0;
         st=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=='-') {
                if(c==0) st=i;
                c++;
            }
            else if(c>1){
                for(int j=0;j<str.length;j++){
                    if( str[j].length() == c ){
                        char r[]=str[j].toCharArray();
                        int ct=r.length;
                        for(int k=c;k>=st;k--){
                              arr1[k]=r[ct--];
                        } 
                    }  
                }
                c=0;
                st=0;
            } 
            else {c=0; st=0;}
        }
        c=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                ch[i][j]=arr[c++];
            }
        }
        c=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               if(ch[i][j]>='A' && ch[i][j]<='Z') ch[i][j]=arr1[c++];
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}






// 10 10
// +-++++++++
// +-++++++++
// +-------++
// +-++++++++
// +-++++++++
// +------+++
// +-+++-++++
// +++++-++++
// +++++-++++
// ++++++++++  
// AGRA;NORWAY;ENGLAND;GWALIOR