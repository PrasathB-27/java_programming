import java.util.*;
public class char_abs_diff {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String st[]=s1.split("");
		String sx[]=s2.split("");
		List<String> l1=new ArrayList<>();
		List<String> l2=new ArrayList<>();
		for(int i=0;i<st.length;i++){
		    if(l1.contains(st[i]) || l2.contains(st[i])) continue;
		    else if(s2.contains(st[i])) l1.add(st[i]); //common
		    else l2.add(st[i]); //uncommon
		}
// 		System.out.print(String.join("",l1)+String.join("",l2));
		for(int i=0;i<sx.length;i++){
		    if(l2.contains(sx[i])) continue;
		    else if(l1.contains(sx[i])) continue;
		    else  l2.add(sx[i]);
		}
		//System.out.print(String.join("",l1)+" "+String.join("",l2));
		int res=Math.abs(l1.size()-l2.size());
		System.out.print(res);
	}
}

//aaaaaa
//bbbccc