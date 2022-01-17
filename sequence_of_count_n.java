import java.util.*;
public class sequence_of_count_n {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       String s="1";
       String st="1";
       System.out.print(s);
       for(int i=1;i<a;i++){
           char ch[]=st.toCharArray();
           char chk=ch[0];
           int count=0;
            st="";
           for(int j=0;j<ch.length;j++){
                if(chk==ch[j]){
                   count++;
                }
                else{
                    st=st+String.valueOf(count)+String.valueOf(chk);
                    count=0;
                    count++;
                   chk=ch[j];
                }
           }
           st=st+String.valueOf(count)+String.valueOf(chk);
           System.out.print(","+st);
       }
    }
}
