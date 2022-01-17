import java.util.*;
public class swap_every_two_digits {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		List<Integer> l = new ArrayList<Integer>();
		for(String s:str){
		    String st[]=s.split("");
		    StringBuilder sb = new StringBuilder();
		    String s1="";
		    for(int i=0;i<st.length;i++){
		        if(i!=0 && i%2==0){
		            s1=s1+sb.reverse().toString();
		            sb.setLength(0);
		        }
		        sb.append(st[i]);
		    }
		    if(sb.length()!=0){
		        s1=s1+sb.reverse().toString();
		    }
		    l.add(Integer.parseInt(s1));
		}
		int sum=0;
		for(int i=0;i<l.size();i++){
		    sum=sum+l.get(i);
		}
		System.out.print(sum);
	}
}