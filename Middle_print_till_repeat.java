import java.util.*;
public class Middle_print_till_repeat {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch[]=sc.nextLine().toCharArray();
		List<Character> l = new ArrayList<Character>();
		l.add(ch[ch.length/2]);
		for(int i=(ch.length/2)-1,j=(ch.length/2)+1;i>=0;i--,j++){
		    if(l.contains(ch[i])) {l.add(ch[i]); break;}
		    l.add(ch[i]);
		    if(l.contains(ch[j])) {l.add(ch[j]); break;}
		    l.add(ch[j]);
		}
		for(int i=0;i<l.size();i++){
		    System.out.print(l.get(i));
		}
	}
}