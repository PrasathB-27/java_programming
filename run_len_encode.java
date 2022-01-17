import java.util.*;
public class run_len_encode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    String str[]=sc.nextLine().split("");
    int count=0;
    String str_chk=str[0];
    for(int i=0;i<str.length;i++){
        if(str_chk.equals(str[i])){
            count++;
        }
        else{
            System.out.print(count+""+str_chk);
            str_chk=str[i];
            count=0;
            count++;
        }
    }
    System.out.print(count+""+str_chk);
}
}
