import java.util.*;
import java.util.stream.*; 
public class sk1 {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;

        List<String> li = new LinkedList<>();

        int curr=n;

        for(int i=0;i<n;i++){
            String x ="";
            for(int j=1;j<=curr;j++){
                x+=curr;
            }    
            for(int j=curr+1;j<=n;j++){
                x+=j;
            }
            curr--;
            String rev = new StringBuilder(x.substring(1)).reverse().toString();
            li.add(rev+x);
        }
        for(String x:li){
            System.out.println(x);
        }
		

        for(int i=li.size()-2;i>=0;i--){
            System.out.println(li.get(i));
        }
}}