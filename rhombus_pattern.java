import java.util.*;
public class rhombus_pattern {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		List<String> l =new ArrayList<String>();
		for(int i=0;i<a;i++){
		    String s="";
		    int c=i;
		    for(int j=0;j<a;j++){
		        if(j==c){s=s+String.valueOf((char)92); c=c+2;}
		        else{s=s+"#";}
		    }
		    l.add(s);
		}
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		for(int i=0;i<l.size();i++){
		    StringBuilder sb = new StringBuilder();
		    StringBuilder sx = new StringBuilder();
		    String str="";
		    for(int j=0;j<l.size();j++)
		       str=str+l.get(j).charAt(i);
		    String st = str.replace((char)92,'/');
	        sb.append(st); 
	        sx.append(str);
		    String strr = sb.reverse().toString() + str ;
		    String res = sx.reverse().toString() + sb.reverse().toString();
		    l1.add(strr);
		    l2.add(res);
		}
		for(int i=0;i<l1.size();i++) System.out.println(l1.get(i));
        for(int i=l2.size()-1;i>=0;i--) System.out.println(l2.get(i));
	}
}



