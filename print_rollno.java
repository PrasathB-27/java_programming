import java.util.*;
public class print_rollno {
    public static void main(String[] args) {

 String str[]="2021 c 5 3".split(" ");
 int N=Integer.parseInt(str[2]);
 int d=Integer.parseInt(str[3])-1;
 int c=1;
 for(int i=0;i<N;i++){
   //System.out.print(d);
     System.out.print(str[0]+str[1]+"0".repeat(d)+ c++ +" ");
 }
}
}