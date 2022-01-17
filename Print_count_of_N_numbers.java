import java.util.*;
public class Print_count_of_N_numbers {
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter n ");
           int a=sc.nextInt();
           int count=0;
           for(int i=1;i<=a;i++){
               String s=String.valueOf(i);
               count = count + s.length();
           }
           System.out.print(count);
    }
}
